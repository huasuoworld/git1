/**
 * 
 */
$(document).ready(function() {menu.getMenu(0);	menu.getListBody();});

var font = "栏目管理";

var valids = ["栏目名称", "排序", "访问", "最后修改时间", "最后修改人"];
var sizes = [100, 100, 100, 100, 100];
var contents = ["栏目名称", "排序", "访问", "最后修改时间", "最后修改人"];
var keys = ["column_name", "order_", "visit", "last_update_time", "last_update_by"];