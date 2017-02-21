/**
 * 
 */
$(document).ready(function() {menu.getMenu(1);	menu.getListBody();});

var font = "会员列表";

var valids = ["会员ID	", "账户余额(元)", "会员名", "联系人", "公司名", "网址", "手机号码", "QQ号码", "会员级别", "是否成交", "注册时间", "最后修改时间", "最后修改人"];
var sizes = [100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100];
var contents = ["会员ID	", "账户余额(元)", "会员名", "联系人", "公司名", "网址", "手机号码", "QQ号码", "会员级别", "是否成交", "注册时间", "最后修改时间", "最后修改人"];
var keys = ["vip_id", "account_balance", "vip_name", "contact", "company", "internet_address", "telephone", "qqnumber", "vip_level_id", "is_deal", "add_time", "last_update_time", "last_update_by"];