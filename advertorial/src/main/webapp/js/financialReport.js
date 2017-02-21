/**
 * 
 */
$(document).ready(function() {menu.getMenu(2);	menu.getListBody();});

var font = "财务报表";

var valids = ["订单号", "会员名", "联系人", "公司名", "交易金额", "账户余额", "毛利润", "交易时间", "交易类型", "最后修改时间", "最后修改人"];
var sizes = [100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100];
var contents = ["订单号", "会员名", "联系人", "公司名", "交易金额", "账户余额", "毛利润", "交易时间", "交易类型", "最后修改时间", "最后修改人"];
var keys = ["order_no", "user", "contact", "company", "deal_balance", "account_balance", "gross_profit", "add_time", "status", "last_update_time", "last_update_by"];