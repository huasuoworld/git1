/**
 * 
 */
$(document).ready(function() {menu.getMenu(0);	menu.getListBody();});

var font = "名人名媒订单详细";

var valids = ["媒体订单DID", "订单号", "媒体名", "QQ", "备注", "状态", "最后修改时间", "最后修改人"];
var sizes = [100, 100, 100, 100, 100, 100, 100, 100];
var contents = ["媒体订单DID", "订单号", "媒体名", "QQ", "备注", "状态", "最后修改时间", "最后修改人"];
var keys = ["famous_order_did", "order_no", "media_name", "qqnumber", "comment", "status_", "last_update_time", "last_update_by"];