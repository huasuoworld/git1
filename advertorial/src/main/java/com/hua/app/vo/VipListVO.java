package com.hua.app.vo;

public class VipListVO  extends BaseVO {

	/**
	 * 	#主键	did
		#会员ID	vip_id
		#账户余额(元)	account_balance
		#会员名	vip_name
		#联系人	contact
		#公司名	company
		#网址	internet_address
		#手机号码	telephone
		#QQ号码	qqnumber
		#会员级别	vip_level_id
		#是否成交	is_deal
		#注册时间	add_time
		#最后修改时间	last_update_time
		#最后修改人	last_update_by
	 */
	private static final long serialVersionUID = 1L;
	private String did;
	private String vip_id;
	private String account_balance;
	private String vip_name;
	private String contact;
	private String company;
	private String internet_address;
	private String telephone;
	private String qqnumber;
	private String vip_level_id;
	private String is_deal;
	private String add_time;
	//
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
	public String getAccount_balance() {
		return account_balance;
	}
	public void setAccount_balance(String account_balance) {
		this.account_balance = account_balance;
	}
	public String getVip_name() {
		return vip_name;
	}
	public void setVip_name(String vip_name) {
		this.vip_name = vip_name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getInternet_address() {
		return internet_address;
	}
	public void setInternet_address(String internet_address) {
		this.internet_address = internet_address;
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
	public String getVip_level_id() {
		return vip_level_id;
	}
	public void setVip_level_id(String vip_level_id) {
		this.vip_level_id = vip_level_id;
	}
	public String getIs_deal() {
		return is_deal;
	}
	public void setIs_deal(String is_deal) {
		this.is_deal = is_deal;
	}
	public String getAdd_time() {
		return add_time;
	}
	public void setAdd_time(String add_time) {
		this.add_time = add_time;
	}
	
}
