/**
 * 
 */
$(document).ready(function() {menu.getMenu(7);	menu.getListBody();});

var font = "微博认证管理";

var valids = ["所属", "名称", "排序", "最后修改时间", "最后修改人"];
var sizes = [100, 100, 100, 100, 100];
var contents = ["所属", "名称", "排序", "最后修改时间", "最后修改人"];
var keys = ["owner", "weibo_authentication_name", "order_", "last_update_time", "last_update_by"];