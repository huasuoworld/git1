package com.hua.app.vo;

public class ReceiptVO  extends BaseVO {

	/**
	 * 	#主键	DID
		#订单号	order_no
		#会员名	vip_name
		#发票抬头	head_
		#发票内容	content_
		#发票金额	balance_y
		#未开票金额 balance_n
		#状态	status_
		#申请时间	add_time
		#最后修改时间 last_update_time
		#最后修改人	last_update_by
	 */
	private static final long serialVersionUID = 1L;
	private String did;
	private String order_no;
	private String vip_name;
	private String head_;
	private String content_;
	private String balance_y;
	private String balance_n;
	private String status_;
	private String add_time;
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
	public String getVip_name() {
		return vip_name;
	}
	public void setVip_name(String vip_name) {
		this.vip_name = vip_name;
	}
	public String getHead_() {
		return head_;
	}
	public void setHead_(String head_) {
		this.head_ = head_;
	}
	public String getContent_() {
		return content_;
	}
	public void setContent_(String content_) {
		this.content_ = content_;
	}
	public String getBalance_y() {
		return balance_y;
	}
	public void setBalance_y(String balance_y) {
		this.balance_y = balance_y;
	}
	public String getBalance_n() {
		return balance_n;
	}
	public void setBalance_n(String balance_n) {
		this.balance_n = balance_n;
	}
	public String getStatus_() {
		return status_;
	}
	public void setStatus_(String status_) {
		this.status_ = status_;
	}
	public String getAdd_time() {
		return add_time;
	}
	public void setAdd_time(String add_time) {
		this.add_time = add_time;
	}
	
}
