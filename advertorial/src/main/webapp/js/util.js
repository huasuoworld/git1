/**
 * 
 */
var json = "";

Array.prototype.indexOf = function(val) {              
    for (var i = 0; i < this.length; i++) {  
        if (this[i] == val) return i;  
    }  
    return -1;  
};  
Array.prototype.remove = function(val) {  
    var index = this.indexOf(val);  
    if (index > -1) {  
        this.splice(index, 1);  
    }  
};  

var scope = {
		searchURL : "search",
		submitURL : "commit",
		deleteURL : "delete",
		addURL : "add",
		enterURL	: "enter",
		updateURL : "update",
		url			: "",
		param : {
				user_id				: "",
				currentPage			: "1",
				count				: "",
				pageSize			: "20",
				start				: "0",
				limit				: "20",
				password 			: "1",
				tolta				: "",
				did					: "",
				dids				: []
				
		},
		clear : function() {
			for(var s = 0; s < keys.length; s++) {
				var key = keys[s];
				scope.param[key] = "";
			}
		},
		table : function(list) {
			var data = "";
			for(var i = 0; i < list.length; i++) {
				var column = "";
				
				for(var s = 0; s < keys.length; s++) {
					var key = keys[s];
					column = column + "<td>"+list[i][key]+"</td>";
				}
				data = data + "<tr>"
							+ '<td><input type="checkbox" id="did'+list[i].did+'" onclick="util.remove('+list[i].did+')"/></td>'
							+ "<td>"+list[i].did+"</td>"
							+ column
							+ '<td><a id="detail"'+list[i].did+' class="button border-blue button-little" href="#" onclick="util.detail('+list[i].did+')">详情</a></td>'
							+ '<td><a id="detail"'+list[i].did+' class="button border-blue button-little" href="#" onclick="util.update('+list[i].did+')">修改</a></td>'
							+ '<td><a id="delete"'+list[i].did+' class="button border-yellow button-little" href="#" onclick="util.delete0('+list[i].did+')">删除</a></td>';
			}
			return data;
		},	
		tb_head : function() {	
			var t_str = "";
			for(var s = 0; s < sizes.length; s++) {
				t_str = t_str +'<th width="'+sizes[s]+'">'+contents[s]+'</th>';
			}
			var str = 
					'<tr>'
		            +'<th width="45">选择</th>'
		            +'<th width="100">DID</th>'
		            + t_str
		            +'<th width="100">操作</th>'
		            +'</tr>'
		    return str;        
		},
		form : function() {
			
			var t_str = "";
			for(var s = 0; s < keys.length; s++) {
				t_str = 
					t_str +'<div class="form-group">'
					+'<div class="label"><label for="'+keys[s]+'">'+contents[s]+'</label></div>'
					+'<div class="field">'
					+'<input type="text" class="input" id="'+keys[s]+'" name="'+keys[s]+'" size="50" placeholder="'+contents[s]+'" data-validate="required:'+valids[s]+'" />'
					+'</div></div>';
			}
			
			var str = 
				'<form method="post" class="form-x" action="">'
			+ 	t_str
			+ 	'<div class="form-button"><input id="commit" class="button bg-main" type="button" value="提交" /></div>'
			+ 	'</form>';
			
			$("#form").html(str);
			
			$("#commit").click(function(){
				if(confirm("submit?")) {
					util.submit();
				}
			});
		}
};

var util = {
		submit : function(url) {
			for(var s = 0; s < keys.length; s++) {
				var key = keys[s];
				scope.param[key] = $("#"+key).val();
			}
			$.post(url, scope.param, function(result) {
				document.location.href = scope.enterURL;
			});
		},
		delete0 : function(did) {
			if(confirm("delete?")) {
				scope.param.did = did;
				$.post(scope.deleteURL, scope.param, function(result) {
					util.search();
				});
			}
		},
		delete1 : function() {
			scope.param.did = scope.param.dids.toString();
			$.post(scope.deleteURL, scope.param, function(result) {
				scope.param.dids = [];
				util.search();
			});
		},
		remove : function(did) {
			if($("#did"+did).is(':checked')) {
				scope.param.dids.push(did);
			}
			else {
				scope.param.dids.remove(did);
			} 
		}, 
		unremove : function () {
			
		},
		detail	: function(did) {
			
			scope.param.did = did;
			$.post(scope.searchURL, scope.param, function(result) {
				
			var list = jQuery.parseJSON(result.list);
			json = list;
			menu.getAddBody(false, font);
			
			for(var i = 0; i < list.length; i++) {
				for(var s = 0; s < keys.length; s++) {
					var key = keys[s];
					$("#"+key).val(list[i][key]);
				}
			}
			},"json");
		},
		update : function (did) {
			
			scope.url = scope.updateURL;
			scope.param.did = did;
			$.post(scope.searchURL, scope.param, function(result) {
				
			var list = jQuery.parseJSON(result.list);
			menu.getAddBody(true, font);
			
			//绑定提交按钮
			$("#commit").click(function(){
				if(confirm("submit?")) {
					util.submit(scope.url);
				}
			});
			
			for(var i = 0; i < list.length; i++) {
				for(var s = 0; s < keys.length; s++) {
					var key = keys[s];
					$("#"+key).val(list[i][key]);
				}
			}
			},"json");
		},
		current : function(k) {
			scope.param.currentPage = k - 1;
			scope.param.start = (k-1) * scope.param.pageSize;
			scope.param.limit = scope.param.pageSize;
			util.search();
		},
		search : function() {
			$.post(scope.searchURL, scope.param, function(result) {
				
				var list = jQuery.parseJSON(result.list);
				scope.param.count = result.count;
				json = result;
				var table = '<table class="table table-hover\">' + scope.tb_head() + scope.table(list) + "</table>";
				$("#table").html(table);
				
				util.page();
			},"json");
		},
		page : function() {
			var count = scope.param.count;
			var pageSize = new Number(scope.param.pageSize);
			var pageList = "";
			var k = 1;
			for(var j = 0; j < count; j = j+pageSize) {
				pageList = pageList + '<li><a href="#" onclick="util.current('+k+')">'+k+'</a></li>';
				k++;
			}
			scope.param.tolta = k;
			var page = 
				'<div class="panel-foot text-center">'
		        +'<ul class="pagination"><li><a id="previous" href="#">上一页</a></li></ul>'
		        +'<ul class="pagination pagination-group">'
		        +pageList
		        +'</ul>'
		        +'<ul class="pagination"><li><a id="next" href="#">下一页</a></li></ul>'
		        +'</div>';
			
			$("#page").html(page);
			
			$("#previous").click(function(){
				if(scope.param.currentPage >= 1) {
					scope.param.currentPage = scope.param.currentPage - 1;
				}
				scope.param.start = scope.param.currentPage * scope.param.pageSize;
				scope.param.limit = scope.param.pageSize;
				util.search();
			});	
				
			$("#next").click(function(){
				var count = scope.param.count;
				var pageSize = scope.param.pageSize;
				var tolta = scope.param.tolta;
				if(scope.param.currentPage < (tolta - 2)) {
					scope.param.currentPage = new Number(scope.param.currentPage) + 1;
					
					scope.param.start = scope.param.currentPage * scope.param.pageSize;
					scope.param.limit = scope.param.pageSize;
					util.search();
				}	
			});
		},
		confirm : function () {
			  var r=confirm("Press a button");
			  if (r==true) {
				  document.write("You pressed OK!");
			  }
			  else {
				  document.write("You pressed Cancel!");
		    }
		},
		dynamic : function() {
			for(var s = 0; s < keys.length; s++) {
				var key = keys[s];
				scope.param[key] = "";
			}
		}
};


$(function(){
	
	//loading
	util.search();
	util.dynamic();
	
	$("#batch_delete").click(function(){
		if(confirm("delete?"))
		util.delete1();
	});
	
	//添加事件
	$("#add").click(function(){
		
		scope.url = scope.submitURL;
		menu.getAddBody(true, font);
		//绑定提交按钮
		$("#commit").click(function(){
			if(confirm("submit?")) {
				util.submit(scope.url);
			}
		});
	});
});