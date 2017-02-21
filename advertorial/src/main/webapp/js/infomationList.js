/**
 * 
 */
$(document).ready(function() {menu.getMenu(9);	menu.getListBody();});

var font = "咨询列表";

var valids = ["分类", "关键字", "描述", "缩略图", "内容", "最后修改时间", "最后修改人"];
var sizes = [100, 100, 100, 100, 100, 100, 100];
var contents = ["分类", "关键字", "描述", "缩略图", "内容", "最后修改时间", "最后修改人"];
var keys = ["type_", "keyword", "description", "thumbnail", "content_", "last_update_time", "last_update_by"];