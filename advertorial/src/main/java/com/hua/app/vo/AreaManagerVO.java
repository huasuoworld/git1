package com.hua.app.vo;

public class AreaManagerVO extends BaseVO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/***
	 * 
	 * 	#主键	did
		#地区名称	area_manager_name
		#排序	order_
		#最后修改时间	last_update_time
		#最后修改人	last_update_by
	 * */
	private String did;
	private String area_manager_name;
	private String order_;
	
	public String getDid() {
		return did;
	}
	public void setDid(String did) {
		this.did = did;
	}
	public String getArea_manager_name() {
		return area_manager_name;
	}
	public void setArea_manager_name(String area_manager_name) {
		this.area_manager_name = area_manager_name;
	}
	public String getOrder_() {
		return order_;
	}
	public void setOrder_(String order_) {
		this.order_ = order_;
	}
	
	

}
