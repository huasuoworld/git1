package com.hua.app.vo;

public class WeichatMediaTypeVO  extends BaseVO {

	/**
	 * 	#主键	did
		#所属	owner
		#媒体类型名称	weichat_media_type_name
		#排序	order_
		#最后修改时间	last_update_time
		#最后修改人	last_update_by
	 */
	private static final long serialVersionUID = 1L;
	private String did;
	private String owner;
	private String weichat_media_type_name;
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
	public String getWeichat_media_type_name() {
		return weichat_media_type_name;
	}
	public void setWeichat_media_type_name(String weichat_media_type_name) {
		this.weichat_media_type_name = weichat_media_type_name;
	}
	public String getOrder_() {
		return order_;
	}
	public void setOrder_(String order_) {
		this.order_ = order_;
	}
	
}
