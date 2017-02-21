package com.hua.app.vo;

public class WeiboMediaVO  extends BaseVO {

	/**
	 * 	#主键	did
		#所属	owner
		#媒体类型名称	weibo_media_type_name
		#排序	order_
		#最后修改时间	last_update_time
		#最后修改人	last_update_by
	 */
	private static final long serialVersionUID = 1L;
	private String did;
	private String owner;
	private String weibo_media_type_name;
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
	public String getWeibo_media_type_name() {
		return weibo_media_type_name;
	}
	public void setWeibo_media_type_name(String weibo_media_type_name) {
		this.weibo_media_type_name = weibo_media_type_name;
	}
	public String getOrder_() {
		return order_;
	}
	public void setOrder_(String order_) {
		this.order_ = order_;
	}
	
}
