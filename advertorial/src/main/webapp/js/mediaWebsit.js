/**
 * 
 */
$(document).ready(function() {menu.getMenu(5);	menu.getListBody();});

var font = "媒体管理";

var valids = ["媒体类别主键", "所属地区主键", "门户网站", "媒体名称", "媒体网址", "案例网址", "收录参考主键", "链接类型主键", "可发媒体", "入口", "媒体QQ", "成本价", "市场价格", "锁定价格", "备注", "最后修改时间", "最后修改人"];
var sizes = [100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100];
var contents = ["媒体类别主键", "所属地区主键", "门户网站", "媒体名称", "媒体网址", "案例网址", "收录参考主键", "链接类型主键", "可发媒体", "入口", "媒体QQ", "成本价", "市场价格", "锁定价格", "备注", "最后修改时间", "最后修改人"];
var keys = ["media_type_did", "area_manager_did", "potal_media_did", "media_name", "internet_address", "case_address", "included_reference_did", "link_type_did", "media_sender_did", "entry", "media_qq", "cost_price", "market_price", "lock_price", "comment", "last_update_time", "last_update_by"];