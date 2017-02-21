/**
 * 
 */
$(document).ready(function() {menu.getMenu(0);	menu.getListBody();});

var font = "公司信息";

var valids = ["公司名称", "纳税识别号", "公司地址", "电话", "开户行", "账号", "税务登记", "最后修改时间", "最后修改人"];
var sizes = [100, 100, 100, 100, 100, 100, 100, 100, 100];
var contents = ["公司名称", "纳税识别号", "公司地址", "电话", "开户行", "账号", "税务登记", "最后修改时间", "最后修改人"];
var keys = ["company_name", "tax_no", "company_address", "telephone", "bank", "user_", "tax_regist", "last_update_time", "last_update_by"];