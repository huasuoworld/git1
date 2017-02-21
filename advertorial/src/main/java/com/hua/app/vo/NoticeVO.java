package com.hua.app.vo;

public class NoticeVO  extends BaseVO {

	/**
	 * 	#主键	did
		#内容 content_
		#最后修改时间	last_update_time
		#最后修改人	last_update_by
	 */
	private static final long serialVersionUID = 1L;
	private String did;
	private String content_;
	//
	public String getDid() {
		return did;
	}
	public void setDid(String did) {
		this.did = did;
	}
	public String getContent_() {
		return content_;
	}
	public void setContent_(String content_) {
		this.content_ = content_;
	}
	
}
