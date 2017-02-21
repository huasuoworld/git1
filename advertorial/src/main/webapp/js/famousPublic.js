/**
 * 
 */
$(document).ready(function() {menu.getMenu(6);	menu.getListBody();});

var font = "名人名媒公众号";

var valids = ["媒体领域", "类型", "头像", "二维码", "微信名称", "微信号", "粉丝数量(万)", "阅读数", "多图文一市场价", "多图文一锁定价", "多图文二市场价", "多图文二锁定价", "多图文其他市场价", "多图文其他锁定价", "多图文一成本价", "多图文二成本价", "多图文三成本价", "媒体QQ", "功能介绍", "价格", "最后修改时间", "最后修改人"];
var sizes = [100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100];
var contents = ["媒体领域", "类型", "头像", "二维码", "微信名称", "微信号", "粉丝数量(万)", "阅读数", "多图文一市场价", "多图文一锁定价", "多图文二市场价", "多图文二锁定价", "多图文其他市场价", "多图文其他锁定价", "多图文一成本价", "多图文二成本价", "多图文三成本价", "媒体QQ", "功能介绍", "价格", "最后修改时间", "最后修改人"];
var keys = ["famous_area_did", "type_", "head_pic", "qr_code", "weichat_name", "weichat_no", "fan", "read_", "more_market_price_1", "more_lock_price_1", "more_market_price_2", "more_lock_price_2", "more_market_other_price", "more_lock_other_price", "more_cost_1", "more_cost_2", "more_cost_3", "media_qq", "function_intro", "price", "last_update_time", "last_update_by"];