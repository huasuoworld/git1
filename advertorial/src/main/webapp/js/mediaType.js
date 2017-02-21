/**
 * 
 */
$(document).ready(function() {menu.getMenu(5);	menu.getListBody();});

var font = "媒体类别";

var valids = ["所属", "媒体类型名称", "排序", "最后修改时间", "最后修改人"];
var sizes = [100, 100, 100, 100, 100];
var contents = ["所属", "媒体类型名称", "排序", "最后修改时间", "最后修改人"];
var keys = ["owner", "media_type_name", "order_", "last_update_time", "last_update_by"];