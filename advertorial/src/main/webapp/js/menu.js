/**
 * 菜单栏目
 */
var http = "http://localhost:8080/advertorial/";

var baseMenu = {
		listFirst : 
				'<div class="righter nav-navicon" id="admin-nav">'
				+'<div class="mainer">'
				+'<div class="admin-navbar">'
				+'<span class="float-right">'
				+'<a class="button button-little bg-main" href="修改资料.html">修改资料</a>'
				+'<a class="button button-little bg-main" href="#" target="_blank">前台首页</a>'
				+'<a class="button button-little bg-yellow" href="login.html">注销登录</a>'
				+'</span>'
				+'<ul class="nav nav-inline admin-nav">'
				+'<li><a href="index.html" class="icon-home"> 开始</a></li>'
		,
		listLast : 
			
			'<li><a href="'+http+'adminList/enter" class="icon-cog"> 系统</a></li>'
			
			+'<li id="left_li_00"><a href="'+http+'websitConfig/enter">系统设置</a></li>'
			+'<ul id="left_ul_00">'
			+'<li><a href="'+http+'adminList/enter">管理员</a></li>'
			+'<li><a href="'+http+'columnVisit/enter">栏目管理</a></li>'
			+'<li><a href="'+http+'advertSupport/enter">广告管理</a></li>'
			+'<li><a href="'+http+'friendshipLink/enter">友情链接</a></li>'
			+'</ul>'
			
			+'<li id="left_li_01"><a href="'+http+'vipList/enter"  class="icon-file-text"> 会员</a>'
			+'<ul id="left_ul_01">'
			+'<li><a href="'+http+'vipList/enter" "会员列表.html">会员列表</a></li>'
			+'<li class="active"><a href="'+http+'vipList/enter" >成交会员</a></li>'
			+'<li><a href="'+http+'vipLevel/enter" "会员级别.html">会员级别</a></li>'
			+'</ul>'
			+'</li>'
			
			+'<li id="left_li_02"><a href="'+http+'rechargeRecord/enter" class="icon-shopping-cart"> 财务</a>'
			+'<ul id="left_ul_02">'
			+'<li><a href="'+http+'rechargeRecord/enter" >充值记录</a></li>'
			+'<li class="active"><a href="'+http+'financialReport/enter" >财务报表</a></li>'
			+'<li><a href="'+http+'receipt/enter" >发票管理</a></li>'
			+'</ul>'
			+'</li>'
			
			+'<li id="left_li_03"><a href="'+http+'mediaOrder/enter" class="icon-user"> 发稿</a>'
			+'<ul id="left_ul_03">'
			+'<li><a href="'+http+'mediaOrder/enter" >网站媒体订单</a></li>'
            +'<li><a href="'+http+'weichatOrder/enter" >微信媒体订单</a></li>'
            +'<li class="active"><a href="'+http+'famousOrder/enter" >名人名媒公众号订单</a></li>'
            +'<li><a href="'+http+'weichatOrder/enter" >微博媒体订单</a></li>'
            +'</ul>'
            +'</li>'
			
			+'<li id="left_li_04"><a href="'+http+'gunnerOrder/enter" class="icon-file"> 代写</a>'
			+'<ul id="left_ul_04">'
			+'<li><a href="'+http+'gunnerOrder/enter" >订单管理</a></li>'
            +'</ul>'
            +'</li>'
			
			+'<li id="left_li_05"><a href="'+http+'mediaType/enter" class="icon-th-list"> 网站</a>'
			+'<ul id="left_ul_05">'
			+'<li class="active"><a href="'+http+'mediaType/enter" >媒体类别</a></li>'
            +'<li><a href="'+http+'areaManager/enter" >地区管理</a></li>'
            +'<li><a href="'+http+'portalMedia/enter" >门户媒体管理</a></li>'
            +'<li><a href="'+http+'includedReference/enter" >收录参考配置</a></li>'
            +'<li><a href="'+http+'mediaSender/enter" >可发媒体配置</a></li>'
            +'<li><a href="'+http+'linkType/enter" >链接类型配置</a></li>'
            +'<li><a href="'+http+'packageManager/enter" >套餐管理</a></li>'
            +'<li><a href="'+http+'mediaWebsit/enter" >管理媒体</a></li>'
            +'<li><a href="'+http+'batchPriceAdjustmentWebsit/enter" >批量调价</a></li>'
            +'</ul>'
            +'</li>'
            
			+'<li id="left_li_06"><a href="'+http+'weichatMediaType/enter" class="icon-th-list"> 微信</a>'
			+'<ul id="left_ul_06">'
			+'<li class="active"><a href="'+http+'weichatMediaType/enter" >媒体类别</a></li>'
			+'<li><a href="'+http+'weichatMedia/enter" >管理媒体</a></li>'
			+'<li><a href="'+http+'famousArea/enter" >名人名媒领域</a></li>'
			+'<li><a href="'+http+'famousPublic/enter" >名人名媒公众号</a></li>'
			+'<li><a href="'+http+'weicharBatchPriceAdjustment/enter" >批量调价</a></li>'
			+'</ul>'
			+'</li>'
			
			+'<li id="left_li_07"><a href="'+http+'weiboMediaType/enter" class="icon-th-list"> 微博</a>'
			+'<ul id="left_ul_07">'
			+'<li class="active"><a href="'+http+'weiboAuthentication/enter" >媒体类别</a></li>'
			+'<li><a href="'+http+'adminList/enter" >微博认证管理</a></li>'
			+'<li><a href="'+http+'weiboWebsit/enter" >微博网站管理</a></li>'
			+'<li><a href="'+http+'weiboMedia/enter" >管理媒体</a></li>'
			+'<li><a href="'+http+'weiboBatchPriceAdjustment/enter" >批量调价</a></li>'
			+'</ul>'
			+'</li>'
			
			+'<li id="left_li_08"><a href="'+http+'userFeedback/enter"  class="icon-th-list"> 反馈</a>'
			+'<ul id="left_ul_08"><li class="active"><a href="'+http+'questionFeedback/enter" >问题反馈</a></li>'
			+'<li><a href="'+http+'orderFeedback/enter" >订单反馈</a></li>'
			+'</ul>'
			+'</li>'
			
			+'<li id="left_li_09"><a href="'+http+'notice/enter" class="icon-th-list"> 公告</a>'
			+'<ul id="left_ul_09">'
			+'<li class="active"><a href="'+http+'infomationList/enter" >资讯列表</a></li>'
			+'<li><a href="'+http+'infomationType/enter" >资讯分类</a></li>'
			+'<li><a href="'+http+'partners/enter" >合作伙伴</a></li>'
			+'<li><a href="'+http+'userFeedback/enter" >客户点评</a></li>'
			+'<li><a href="'+http+'notice/enter" >公告</a></li>'
			+'</ul>'
			+'</li>'
			
			+'</ul>'
			+'</div>'
			+'<div class="admin-bread">'
			+'<span>您好，admin，欢迎您的光临。</span>'
			+'<ul class="bread">'
			+'<li><a href="index.html" class="icon-home"> 开始</a></li>'
			+'<li>后台首页</li>'
			+'</ul>'
			+'</div>'
			+'</div>'
			+'</div>'
			
		
}
var menu = {
				getMenu:function(n) {
					
					var htm = baseMenu.listFirst + baseMenu.listLast;
					$("#menu_span").html(htm);
					
					for(var i = 0; i < 10; i++) {
						if(i == n) {
							$("#left_li_0"+i).show();
							$("#left_ul_0"+i).show();
						} else {
							$("#left_li_0"+i).hide();
							$("#left_ul_0"+i).hide();
						}
					}
					return 1;
				},
				getListBody : function() {
					var htm = ""
					+	'<form method="post">'
					+	'<div class="panel admin-panel">'
					+	'<div class="panel-head"><strong>管理员列表</strong></div>'
					+	'<div class="padding border-bottom">'
		            +	'<input type="button" class="button button-small checkall" name="checkall" checkfor="id" value="全选" />'
		            +	'<a href="#" id="add" class="button button-small border-green">添加</a>'
		            +	'<input id="batch_delete" type="button" class="button button-small border-yellow" value="批量删除" />'
		            +	'</div>'
		            +	'<span id="table"></span>'
		            + '<span id="page"></span>'
		            +	'</div></form><br />';
					$("#page_body").html(htm);
				},
				hasSubmit : function(has) {
					if(has == true) {
						return '<div class="form-button"><input id="commit" class="button bg-main" type="button" value="提交" /></div>';
					} else {
						return '';
					}
				},
				getAddBody : function(has, font) {
					
					var htm = ""
						+ '<div class="tab"><div class="tab-head">'
						+'<strong>'+font+'</strong><ul class="tab-nav">'
				        +'<li class="active"><a href="#tab-set">'+font+'</a></li></ul></div>'
				        +'<div class="tab-body"><br />'
				        +'<div class="tab-panel active" id="tab-set">'
				    	+'<span id = "form"></span></div></div></div>';
					$("#page_body").html(htm);
					
					var t_str = "";
					for(var s = 0; s < keys.length; s++) {
						t_str =  t_str +'<div class="form-group">'
							+'<div class="label"><label for="'+keys[s]+'">'+contents[s]+'</label></div>'
							+'<div class="field">'
							+'<input type="text" class="input" id="'+keys[s]+'" name="'+keys[s]+'" size="50" placeholder="'+contents[s]+'" data-validate="required:'+valids[s]+'" />'
							+'</div></div>';
					}
					
					var str = '<form method="post" class="form-x" action="">'
					+ 	t_str
					+ 	menu.hasSubmit(has)
					+ 	'</form>';
					
					$("#form").html(str);
				}
			};

