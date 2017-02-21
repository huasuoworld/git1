/**
 * 
 */
$(document).ready(function() {menu.getMenu(6);	menu.getListBody();});

var font = "微信媒体管理";

var valids = ["所属地区", "认证", "配合度", "类型", "头像", "二维码", "微信名称", "微信号", "粉丝数量(万)", "阅读数", "单图文市场价", "单图文锁定价", "多图文市场价", "多图文锁定价", "单图文成本价", "多图文成本价", "单量", "媒体QQ", "备注", "最后修改时间", "最后修改人"];
var sizes = [100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100];
var contents = ["所属地区", "认证", "配合度", "类型", "头像", "二维码", "微信名称", "微信号", "粉丝数量(万)", "阅读数", "单图文市场价", "单图文锁定价", "多图文市场价", "多图文锁定价", "单图文成本价", "多图文成本价", "单量", "媒体QQ", "备注", "最后修改时间", "最后修改人"];
var keys = ["area_manager_did", "cert", "match_", "type_", "head_pic", "qr_code", "weichat_name", "weichat_no", "fan", "read_", "single_market_price", "single_lock_price", "more_market_price", "more_lock_price", "single_cost", "more_cost", "single_volume", "media_qq", "comment_", "last_update_time", "last_update_by"];