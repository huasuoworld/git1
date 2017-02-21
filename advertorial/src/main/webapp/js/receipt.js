/**
 * 
 */
$(document).ready(function() {menu.getMenu(2);	menu.getListBody();});

var font = "发票管理";

var valids = ["订单号", "会员名", "发票抬头", "发票内容", "发票金额", "未开票金额", "状态", "申请时间", "最后修改时间", "最后修改人"];
var sizes = [100, 100, 100, 100, 100, 100, 100, 100, 100, 100];
var contents = ["订单号", "会员名", "发票抬头", "发票内容", "发票金额", "未开票金额", "状态", "申请时间", "最后修改时间", "最后修改人"];
var keys = ["order_no", "vip_name", "head_", "content_", "balance_y", "balance_n", "status_", "add_time", "last_update_time", "last_update_by"];