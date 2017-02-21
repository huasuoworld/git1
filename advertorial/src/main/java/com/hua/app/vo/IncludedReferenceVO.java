package com.hua.app.vo;

public class IncludedReferenceVO  extends BaseVO {

	/**
	 * 	#主键	did
		#收录参考选项	included_reference_name
		#排序	order_
		#最后修改时间	last_update_time
		#最后修改人	last_update_by
	 */
	private static final long serialVersionUID = 1L;

	private String did;
	private String included_reference_name;
	private String order_;
	//
	public String getDid() {
		return did;
	}
	public void setDid(String did) {
		this.did = did;
	}
	public String getIncluded_reference_name() {
		return included_reference_name;
	}
	public void setIncluded_reference_name(String included_reference_name) {
		this.included_reference_name = included_reference_name;
	}
	public String getOrder_() {
		return order_;
	}
	public void setOrder_(String order_) {
		this.order_ = order_;
	}
	
}
