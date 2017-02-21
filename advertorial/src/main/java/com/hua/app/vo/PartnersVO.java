package com.hua.app.vo;

public class PartnersVO  extends BaseVO {

	/**
	 * 	#主键	did
		#名称	partners_name
		#缩略图 thumbnail
		#排序	order_
		#最后修改时间	last_update_time
		#最后修改人	last_update_by

	 */
	private static final long serialVersionUID = 1L;
	private String did;
	private String partners_name;
	private String thumbnail;
	private String order_;
	///
	public String getDid() {
		return did;
	}
	public void setDid(String did) {
		this.did = did;
	}
	public String getPartners_name() {
		return partners_name;
	}
	public void setPartners_name(String partners_name) {
		this.partners_name = partners_name;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public String getOrder_() {
		return order_;
	}
	public void setOrder_(String order_) {
		this.order_ = order_;
	}
	
}
