/**
 * 
 */
$(document).ready(function() {menu.getMenu(0);	menu.getListBody();});

var font = "快递信息";

var valids = ["收件人", "联系电话", "收件地址", "物流公司", "快递单号", "最后修改时间", "最后修改人"];
var sizes = [100];
var contents = ["收件人", "联系电话", "收件地址", "物流公司", "快递单号", "最后修改时间", "最后修改人"];
var keys = ["consignee", "telephone", "address", "express_company", "express_no", "last_update_time", "last_update_by"];