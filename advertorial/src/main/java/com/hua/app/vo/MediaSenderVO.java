package com.hua.app.vo;

public class MediaSenderVO  extends BaseVO {

	/**
	 * 	#主键	did
		#可发媒体选项	media_sender_name
		#排序	order_
		#最后修改时间	last_update_time
		#最后修改人	last_update_by
	 */
	private static final long serialVersionUID = 1L;
	private String did;
	private String media_sender_name;
	private String order_;
	//
	public String getDid() {
		return did;
	}
	public void setDid(String did) {
		this.did = did;
	}
	public String getMedia_sender_name() {
		return media_sender_name;
	}
	public void setMedia_sender_name(String media_sender_name) {
		this.media_sender_name = media_sender_name;
	}
	public String getOrder_() {
		return order_;
	}
	public void setOrder_(String order_) {
		this.order_ = order_;
	}
	
}
