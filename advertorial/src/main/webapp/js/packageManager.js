/**
 * 
 */
$(document).ready(function() {menu.getMenu(5);	menu.getListBody();});

var font = "链套餐管理";

var valids = ["套餐名", "套餐价格", "套餐广告语", "媒体表主键", "排序", "最后修改时间", "最后修改人"];
var sizes = [100, 100, 100, 100, 100, 100, 100];
var contents = ["套餐名", "套餐价格", "套餐广告语", "媒体表主键", "排序", "最后修改时间", "最后修改人"];
var keys = ["package_manager_name", "package_price", "package_adert", "media_did", "order_", "last_update_time", "last_update_by"];