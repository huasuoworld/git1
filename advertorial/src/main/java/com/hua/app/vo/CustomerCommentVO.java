package com.hua.app.vo;

public class CustomerCommentVO  extends BaseVO {

	/**
	 * 	#主键	did
		#客户	customer_comment_name
		#缩略图1 thumbnail_1
		#缩略图2 thumbnail_2
		#内容	content_
		#最后修改时间	last_update_time
		#最后修改人	last_update_by
	 */
	private static final long serialVersionUID = 1L;

	private String did;
	private String customer_comment_name;
	private String thumbnail_1;
	private String thumbnail_2;
	private String content_;
	
	public String getDid() {
		return did;
	}
	public void setDid(String did) {
		this.did = did;
	}
	public String getCustomer_comment_name() {
		return customer_comment_name;
	}
	public void setCustomer_comment_name(String customer_comment_name) {
		this.customer_comment_name = customer_comment_name;
	}
	public String getThumbnail_1() {
		return thumbnail_1;
	}
	public void setThumbnail_1(String thumbnail_1) {
		this.thumbnail_1 = thumbnail_1;
	}
	public String getThumbnail_2() {
		return thumbnail_2;
	}
	public void setThumbnail_2(String thumbnail_2) {
		this.thumbnail_2 = thumbnail_2;
	}
	public String getContent_() {
		return content_;
	}
	public void setContent_(String content_) {
		this.content_ = content_;
	}
	
	
}
