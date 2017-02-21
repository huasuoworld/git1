package com.hua.app.vo;

public class WeiboAuthenticationVO  extends BaseVO {

	/**
	 * 	#主键	did
		#所属	owner
		#名称	weibo_authentication_name
		#排序	order_
		#最后修改时间	last_update_time
		#最后修改人	last_update_by
	 */
	private static final long serialVersionUID = 1L;
	private String did;
	private String owner;
	private String weibo_authentication_name;
	private String order_;
	//
	public String getDid() {
		return did;
	}
	public void setDid(String did) {
		this.did = did;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getWeibo_authentication_name() {
		return weibo_authentication_name;
	}
	public void setWeibo_authentication_name(String weibo_authentication_name) {
		this.weibo_authentication_name = weibo_authentication_name;
	}
	public String getOrder_() {
		return order_;
	}
	public void setOrder_(String order_) {
		this.order_ = order_;
	}
	
}
