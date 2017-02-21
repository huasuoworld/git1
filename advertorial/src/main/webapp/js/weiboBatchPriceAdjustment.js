/**
 * 
 */
$(document).ready(function() {menu.getMenu(7);	menu.getListBody();});

var font = "批量调价";

var valids = ["调价选择", "直发市场价", "直发锁定价", "转发市场价", "转发锁定价", "直发成本价", "转发成本价", "最后修改时间", "最后修改人"];
var sizes = [100, 100, 100, 100, 100, 100, 100, 100, 100];
var contents = ["调价选择", "直发市场价", "直发锁定价", "转发市场价", "转发锁定价", "直发成本价", "转发成本价", "最后修改时间", "最后修改人"];
var keys = ["price_adjustment_choose", "straight_market_price", "straight_lock_price", "redirect_market_price", "redirect_lock_price", "straight_cost", "redirect_cost", "last_update_time", "last_update_by"];