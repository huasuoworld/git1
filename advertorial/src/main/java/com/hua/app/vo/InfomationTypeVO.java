package com.hua.app.vo;

public class InfomationTypeVO  extends BaseVO {

	/**
	 * 	#主键	did
		#名称	infomaction_type_name
		#排序	order_
		#最后修改时间	last_update_time
		#最后修改人	last_update_by
	 */
	private static final long serialVersionUID = 1L;
	private String did;
	private String infomaction_type_name;
	private String order_;
	//
	public String getDid() {
		return did;
	}
	public void setDid(String did) {
		this.did = did;
	}
	public String getInfomaction_type_name() {
		return infomaction_type_name;
	}
	public void setInfomaction_type_name(String infomaction_type_name) {
		this.infomaction_type_name = infomaction_type_name;
	}
	public String getOrder_() {
		return order_;
	}
	public void setOrder_(String order_) {
		this.order_ = order_;
	}
	
}
