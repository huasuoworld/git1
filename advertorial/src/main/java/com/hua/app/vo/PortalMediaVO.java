package com.hua.app.vo;

public class PortalMediaVO  extends BaseVO {

	/**
	 * 	#主键	did
		#门户媒体	portal_media_name
		#排序	order_
		#最后修改时间	last_update_time
		#最后修改人	last_update_by

	 */
	private static final long serialVersionUID = 1L;
	private String did;
	private String portal_media_name;
	private String order_;
	//
	public String getDid() {
		return did;
	}
	public void setDid(String did) {
		this.did = did;
	}
	public String getPortal_media_name() {
		return portal_media_name;
	}
	public void setPortal_media_name(String portal_media_name) {
		this.portal_media_name = portal_media_name;
	}
	public String getOrder_() {
		return order_;
	}
	public void setOrder_(String order_) {
		this.order_ = order_;
	}
	
}
