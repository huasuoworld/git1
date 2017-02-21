package com.hua.app.vo;

public class VipLevelVO  extends BaseVO {

	/**
	 * 	#主键	did
		#级别别名	level_name
		#级别折扣	level_rebate
		#最后修改时间	last_update_time
		#最后修改人	last_update_by
	 */
	private static final long serialVersionUID = 1L;
	private String did;
	private String level_name;
	private String level_rebate;
	//
	public String getDid() {
		return did;
	}
	public void setDid(String did) {
		this.did = did;
	}
	public String getLevel_name() {
		return level_name;
	}
	public void setLevel_name(String level_name) {
		this.level_name = level_name;
	}
	public String getLevel_rebate() {
		return level_rebate;
	}
	public void setLevel_rebate(String level_rebate) {
		this.level_rebate = level_rebate;
	}
	
}
