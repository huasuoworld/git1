/**
 * 
 */
$(document).ready(function() {menu.getMenu(7);	menu.getListBody();});

var font = "微博媒体管理";

var valids = ["所属地区", "微博认证", "微博网站", "头像", "昵称", "粉丝数量(万)", "直发市场价", "直发锁定价", "转发市场价", "转发锁定价", "直发成本价", "转发成本价", "媒体QQ", "备注", "最后修改时间", "最后修改人"];
var sizes = [100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100];
var contents = ["所属地区", "微博认证", "微博网站", "头像", "昵称", "粉丝数量(万)", "直发市场价", "直发锁定价", "转发市场价", "转发锁定价", "直发成本价", "转发成本价", "媒体QQ", "备注", "最后修改时间", "最后修改人"];
var keys = ["area_did", "weibo_auth", "weibo_websit_did", "head_pic", "nickname", "fan", "straight_market_price", "straight_lock_price", "redirect_market_price", "redirect_lock_price", "straight_cost", "redirect_cost", "qqnumber", "commont", "quantity", "last_update_time", "last_update_by"];