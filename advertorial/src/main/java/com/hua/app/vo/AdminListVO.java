package com.hua.app.vo;


public class AdminListVO extends BaseVO {
	
	/**
	#主键	did
	#会员ID		vip_id
	#登录账户 	user_
	#管理员姓名 	admin_name
	#联系电话	telephone
	#联系QQ		qq
	#角色	role_id
	#密码	password
	#添加时间	add_time
	#上次登录时间	last_logon_time
	#最后修改时间	last_update_time
	#最后修改人	last_update_by
	 */
	private static final long serialVersionUID = -6047884084448362558L;
	private String did;
	private String vip_id;
	private String user_;
	private String admin_name;
	private String telephone;
	private String qqnumber;
	private String role_id;
	private String password;
	private String add_time;
	private String last_logon_time;
	
	public String getDid() {
		return did;
	}
	public void setDid(String did) {
		this.did = did;
	}
	public String getVip_id() {
		return vip_id;
	}
	public void setVip_id(String vip_id) {
		this.vip_id = vip_id;
	}
	public String getUser_() {
		return user_;
	}
	public void setUser_(String user_) {
		this.user_ = user_;
	}
	public String getAdmin_name() {
		return admin_name;
	}
	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	public String getQqnumber() {
		return qqnumber;
	}
	
	public void setQqnumber(String qqnumber) {
		this.qqnumber = qqnumber;
	}
	
	public String getRole_id() {
		return role_id;
	}
	public void setRole_id(String role_id) {
		this.role_id = role_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAdd_time() {
		return add_time;
	}
	public void setAdd_time(String add_time) {
		this.add_time = add_time;
	}
	public String getLast_logon_time() {
		return last_logon_time;
	}
	public void setLast_logon_time(String last_logon_time) {
		this.last_logon_time = last_logon_time;
	}

	
}
