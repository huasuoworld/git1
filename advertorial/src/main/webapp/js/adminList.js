/**
 * 管理员
 */
/**
 * 菜单栏目
 */
$(document).ready(function() {menu.getMenu(0);	menu.getListBody();});

var font = "管理员";
var valids = ["请输入会员ID","请输入登陆账户","请输入管理员姓名","请输入联系电话","请输入联系QQ","请输入角色","请输入添加时间"];
var sizes = [100,100,100,150,150,130,180];
var contents = ["会员ID", "登陆账户", "管理员姓名", "联系电话", "联系QQ", "角色", "添加时间"];
var keys = ["vip_id", "user_", "admin_name", "telephone", "qqnumber", "role_id", "add_time"];

