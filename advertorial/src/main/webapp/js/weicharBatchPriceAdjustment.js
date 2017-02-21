/**
 * 
 */
$(document).ready(function() {menu.getMenu(6);	menu.getListBody();});

var font = "批量调价";

var valids = ["调价选择", "单图文市场价格", "多图文市场价格", "单图文锁定价格", "多图文市锁定价格", "单图文成本价", "多图文成本价", "最后修改时间", "最后修改人"];
var sizes = [100, 100, 100, 100, 100, 100, 100, 100, 100];
var contents = ["调价选择", "单图文市场价格", "多图文市场价格", "单图文锁定价格", "多图文市锁定价格", "单图文成本价", "多图文成本价", "最后修改时间", "最后修改人"];
var keys = ["price_adjustment_choose", "single_market_price", "more_market_price", "single_lock_price", "more_lock_price", "single_cost_price", "more_cost_price", "last_update_time", "last_update_by"];