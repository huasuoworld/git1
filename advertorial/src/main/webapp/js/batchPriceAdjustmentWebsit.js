/**
 * 
 */
$(document).ready(function() {menu.getMenu(5);	menu.getListBody();});

var font = "批量调价";

var valids = ["调价选择", "成本价", "市场价格", "锁定价格", "最后修改时间", "最后修改人"];
var sizes = [100, 100, 100, 100, 100, 100];
var contents = ["调价选择", "成本价", "市场价格", "锁定价格", "最后修改时间", "最后修改人"];
var keys = ["price_adjustment_choose", "cost_price", "market_price", "lock_price", "last_update_time", "last_update_by"];