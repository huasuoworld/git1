package com.hua.app.vo;

public class FinancialReportVO  extends BaseVO {

	/**
	 * 	#主键	did
		#订单号	order_no
		#会员名	user
		#联系人	contact
		#公司名	company
		#交易金额	deal_balance
		#账户余额	account_balance
		#毛利润	gross_profit
		#交易时间	add_time
		#交易类型	status
		#最后修改时间	last_update_time
		#最后修改人	last_update_by
	 */
	private static final long serialVersionUID = 1L;

	private String did;
	private String order_no;
	private String user;
	private String contact;
	private String company;
	private String deal_balance;
	private String account_balance;
	private String gross_profit;
	private String add_time;
	private String status;
	//
	public String getDid() {
		return did;
	}
	public void setDid(String did) {
		this.did = did;
	}
	public String getOrder_no() {
		return order_no;
	}
	public void setOrder_no(String order_no) {
		this.order_no = order_no;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
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
	public String getDeal_balance() {
		return deal_balance;
	}
	public void setDeal_balance(String deal_balance) {
		this.deal_balance = deal_balance;
	}
	public String getAccount_balance() {
		return account_balance;
	}
	public void setAccount_balance(String account_balance) {
		this.account_balance = account_balance;
	}
	public String getGross_profit() {
		return gross_profit;
	}
	public void setGross_profit(String gross_profit) {
		this.gross_profit = gross_profit;
	}
	public String getAdd_time() {
		return add_time;
	}
	public void setAdd_time(String add_time) {
		this.add_time = add_time;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
