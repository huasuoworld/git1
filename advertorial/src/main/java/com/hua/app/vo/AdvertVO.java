package com.hua.app.vo;

public class AdvertVO extends BaseVO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/***
	 * 	#主键	did
		#广告名称	name_
		#广告链接	link_
		#广告图片	picture_
		#广告排序	order_
		#最后修改时间	last_update_time
		#最后修改人	last_update_by
	 * */
	
	private String did;
	private String name_;
	private String link_;
	private String picture_;
	private String order_;
	
	public String getDid() {
		return did;
	}
	public void setDid(String did) {
		this.did = did;
	}
	public String getName_() {
		return name_;
	}
	public void setName_(String name_) {
		this.name_ = name_;
	}
	public String getLink_() {
		return link_;
	}
	public void setLink_(String link_) {
		this.link_ = link_;
	}
	public String getPicture_() {
		return picture_;
	}
	public void setPicture_(String picture_) {
		this.picture_ = picture_;
	}
	public String getOrder_() {
		return order_;
	}
	public void setOrder_(String order_) {
		this.order_ = order_;
	}
	
	
}
