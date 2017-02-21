/**
 * 
 */
$(document).ready(function() {menu.getMenu(5);	menu.getListBody();});

var font = "门户媒体管理";

var valids = ["门户媒体", "排序", "最后修改时间", "最后修改人"];
var sizes = [100, 100, 100, 100];
var contents = ["门户媒体", "排序", "最后修改时间", "最后修改人"];
var keys = ["portal_media_name", "order_", "last_update_time", "last_update_by"];