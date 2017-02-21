package com.hua.app.vo;

public class ColumnVisitVO extends BaseVO {

	/**
	 * 	#主键	did
		#栏目名称	column_name
		#排序	order_
		#访问	visit
		#最后修改时间	last_update_time
		#最后修改人	last_update_by
	 */
	private static final long serialVersionUID = 1L;

	private String did;
	private String column_name;
	private String order_;
	private String visit;
	
	public String getDid() {
		return did;
	}
	public void setDid(String did) {
		this.did = did;
	}
	public String getColumn_name() {
		return column_name;
	}
	public void setColumn_name(String column_name) {
		this.column_name = column_name;
	}
	public String getOrder_() {
		return order_;
	}
	public void setOrder_(String order_) {
		this.order_ = order_;
	}
	public String getVisit() {
		return visit;
	}
	public void setVisit(String visit) {
		this.visit = visit;
	}
	
	
	
}
