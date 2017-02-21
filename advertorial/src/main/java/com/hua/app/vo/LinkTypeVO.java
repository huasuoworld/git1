package com.hua.app.vo;

public class LinkTypeVO  extends BaseVO {

	/**
	 * 	#主键	did
		#链接类型选项	link_type_name
		#排序	order_
		#最后修改时间	last_update_time
		#最后修改人	last_update_by
	 */
	private static final long serialVersionUID = 1L;
	private String did;
	private String link_type_name;
	private String order_;
	//
	public String getDid() {
		return did;
	}
	public void setDid(String did) {
		this.did = did;
	}
	public String getLink_type_name() {
		return link_type_name;
	}
	public void setLink_type_name(String link_type_name) {
		this.link_type_name = link_type_name;
	}
	public String getOrder_() {
		return order_;
	}
	public void setOrder_(String order_) {
		this.order_ = order_;
	}
	
}
