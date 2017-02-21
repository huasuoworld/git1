/**
 * 
 */
$(document).ready(function() {menu.getMenu(3);	menu.getListBody();});

var font = "微信订单";

var valids = ["订单号", "会员名", "任务名称", "媒体数", "费用", "状态", "紧急", "图文", "延期", "发布时间", "下单时间", "最后修改时间", "最后修改人"];
var sizes = [100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100];
var contents = ["订单号", "会员名", "任务名称", "媒体数", "费用", "状态", "紧急", "图文", "延期", "发布时间", "下单时间", "最后修改时间", "最后修改人"];
var keys = ["order_no", "vip_name", "task_name", "media_no", "cost", "status_", "urgent", "image_text", "postponed", "publish_time", "add_time", "last_update_time", "last_update_by"];