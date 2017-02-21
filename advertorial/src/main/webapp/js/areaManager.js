/**
 * 
 */
$(document).ready(function() {menu.getMenu(5);	menu.getListBody();});

var font = "地区管理";

var valids = ["地区名称", "排序", "最后修改时间", "最后修改人"];
var sizes = [100, 100, 100, 100];
var contents = ["地区名称", "排序", "最后修改时间", "最后修改人"];
var keys = ["area_manager_name", "order_", "last_update_time", "last_update_by"];