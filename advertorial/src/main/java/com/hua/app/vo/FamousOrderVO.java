package com.hua.app.vo;

public class FamousOrderVO  extends BaseVO {

	/**
	 * 	#主键	did
		#订单号	order_no
		#会员名	vip_name
		#任务名称	task_name
		#媒体数	media_no
		#费用	cost	
		#状态	status_
		#紧急	urgent
		#图文	image_text
		#延期	postponed
		#发布时间	publish_time
		#下单时间	add_time
		#最后修改时间	last_update_time
		#最后修改人	last_update_by
	 */
	private static final long serialVersionUID = 1L;

	private String did;
	private String order_no;
	private String vip_name;
	private String task_name;
	private String media_no;
	private String cost;
	private String status_;
	private String urgent;
	private String image_text;
	private String postponed;
	private String publish_time;
	private String add_time;
	
	public String getDid() {
		return did;
	}
	public void setDid(String did) {
		this.did = did;
	}
	public String getOrder_no() {
		return order_no;
	}
	public void setOrder_no(String order_no) {
		this.order_no = order_no;
	}
	public String getVip_name() {
		return vip_name;
	}
	public void setVip_name(String vip_name) {
		this.vip_name = vip_name;
	}
	public String getTask_name() {
		return task_name;
	}
	public void setTask_name(String task_name) {
		this.task_name = task_name;
	}
	public String getMedia_no() {
		return media_no;
	}
	public void setMedia_no(String media_no) {
		this.media_no = media_no;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	public String getStatus_() {
		return status_;
	}
	public void setStatus_(String status_) {
		this.status_ = status_;
	}
	public String getUrgent() {
		return urgent;
	}
	public void setUrgent(String urgent) {
		this.urgent = urgent;
	}
	public String getImage_text() {
		return image_text;
	}
	public void setImage_text(String image_text) {
		this.image_text = image_text;
	}
	public String getPostponed() {
		return postponed;
	}
	public void setPostponed(String postponed) {
		this.postponed = postponed;
	}
	public String getPublish_time() {
		return publish_time;
	}
	public void setPublish_time(String publish_time) {
		this.publish_time = publish_time;
	}
	public String getAdd_time() {
		return add_time;
	}
	public void setAdd_time(String add_time) {
		this.add_time = add_time;
	}
	
	
}
