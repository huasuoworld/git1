package com.hua.app.vo;

public class MediaOrderDetailVO extends BaseVO {

	/**
	 * 	#主键	did
		#媒体订单DID	 media_order_did
		#订单号	order_no
		#媒体名	media_name
		#QQ	qqnumber
		#备注	comment
		#状态	status_
		#最后修改时间	last_update_time
		#最后修改人	last_update_by
	 */
	private static final long serialVersionUID = 1L;

	private String did;
	private String media_order_did;
	private String order_no;
	private String media_name;
	private String qqnumber;
	private String comment;
	private String status_;
	
	public String getDid() {
		return did;
	}
	public void setDid(String did) {
		this.did = did;
	}
	public String getMedia_order_did() {
		return media_order_did;
	}
	public void setMedia_order_did(String media_order_did) {
		this.media_order_did = media_order_did;
	}
	public String getOrder_no() {
		return order_no;
	}
	public void setOrder_no(String order_no) {
		this.order_no = order_no;
	}
	public String getMedia_name() {
		return media_name;
	}
	public void setMedia_name(String media_name) {
		this.media_name = media_name;
	}
	public String getQqnumber() {
		return qqnumber;
	}
	public void setQqnumber(String qqnumber) {
		this.qqnumber = qqnumber;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getStatus_() {
		return status_;
	}
	public void setStatus_(String status_) {
		this.status_ = status_;
	}
	
	
}
