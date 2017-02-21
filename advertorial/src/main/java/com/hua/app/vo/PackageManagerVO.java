package com.hua.app.vo;

public class PackageManagerVO  extends BaseVO {

	/**
	 * 	#主键	did
		#套餐名	package_manager_name
		#套餐价格 package_price
		#套餐广告语	package_adert
		#媒体表主键	media_did
		#排序	order_
		#最后修改时间	last_update_time
		#最后修改人	last_update_by
	 */
	private static final long serialVersionUID = 1L;
	private String did;
	private String package_manager_name;
	private String package_price;
	private String package_adert;
	private String media_did;
	private String order_;
	//
	public String getDid() {
		return did;
	}
	public void setDid(String did) {
		this.did = did;
	}
	public String getPackage_manager_name() {
		return package_manager_name;
	}
	public void setPackage_manager_name(String package_manager_name) {
		this.package_manager_name = package_manager_name;
	}
	public String getPackage_price() {
		return package_price;
	}
	public void setPackage_price(String package_price) {
		this.package_price = package_price;
	}
	public String getPackage_adert() {
		return package_adert;
	}
	public void setPackage_adert(String package_adert) {
		this.package_adert = package_adert;
	}
	public String getMedia_did() {
		return media_did;
	}
	public void setMedia_did(String media_did) {
		this.media_did = media_did;
	}
	public String getOrder_() {
		return order_;
	}
	public void setOrder_(String order_) {
		this.order_ = order_;
	}
	
}
