package com.hua.app.vo;

public class FamousAreaVO  extends BaseVO {

	/**
	 * 	#主键	did
		#所属	owner
		#名称	famous_area_name
		#排序	order_
		#最后修改时间	last_update_time
		#最后修改人	last_update_by
	 */
	private static final long serialVersionUID = 1L;

	private String did;
	private String owner;
	private String famous_area_name;
	private String order_;
	
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
	public String getFamous_area_name() {
		return famous_area_name;
	}
	public void setFamous_area_name(String famous_area_name) {
		this.famous_area_name = famous_area_name;
	}
	public String getOrder_() {
		return order_;
	}
	public void setOrder_(String order_) {
		this.order_ = order_;
	}
	
	
}
