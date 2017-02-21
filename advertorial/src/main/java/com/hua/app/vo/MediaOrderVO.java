package com.hua.app.vo;

public class MediaOrderVO  extends BaseVO {

	/**
	 * 	#主键	did
		#订单号	order_no
		#会员名	vip_name
		#文章标题	article_title
		#媒体数	media_no
		#费用	cost	
		#状态	status_
		#下单时间	add_time
		#最后修改时间	last_update_time
		#最后修改人	last_update_by
	 */
	private static final long serialVersionUID = 1L;
	private String did;
	private String order_no;
	private String vip_name;
	private String article_title;
	private String media_no;
	private String cost;
	private String status_;
	private String add_time;
	//
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
	public String getArticle_title() {
		return article_title;
	}
	public void setArticle_title(String article_title) {
		this.article_title = article_title;
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
	public String getAdd_time() {
		return add_time;
	}
	public void setAdd_time(String add_time) {
		this.add_time = add_time;
	}
	
}
