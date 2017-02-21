/**
 * 
 */
$(document).ready(function() {menu.getMenu(3);	menu.getListBody();});

var font = "媒体订单";

var valids = ["订单号", "会员名", "文章标题", "媒体数", "费用", "状态", "下单时间", "最后修改时间", "最后修改人"];
var sizes = [100, 100, 100, 100, 100, 100, 100, 100, 100];
var contents = ["订单号", "会员名", "文章标题", "媒体数", "费用", "状态", "下单时间", "最后修改时间", "最后修改人"];
var keys = ["order_no", "vip_name", "article_title", "media_no", "cost", "status_", "add_time", "last_update_time", "last_update_by"];