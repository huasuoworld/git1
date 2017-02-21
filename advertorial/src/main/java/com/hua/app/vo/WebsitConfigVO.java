package com.hua.app.vo;

public class WebsitConfigVO  extends BaseVO {

	/**
	 * 	#主键	did
		#网站名称	websit_name
		#网址 	internet_address
		#优化标题	title_
		#关键词	keyword
		#描述	description
		#最后修改时间	last_update_time
		#最后修改人	last_update_by
	 */
	private static final long serialVersionUID = 1L;
	private String did;
	private String websit_name;
	private String internet_address;
	private String title_;
	private String keyword;
	private String description;
	//
	public String getDid() {
		return did;
	}
	public void setDid(String did) {
		this.did = did;
	}
	public String getWebsit_name() {
		return websit_name;
	}
	public void setWebsit_name(String websit_name) {
		this.websit_name = websit_name;
	}
	public String getInternet_address() {
		return internet_address;
	}
	public void setInternet_address(String internet_address) {
		this.internet_address = internet_address;
	}
	public String getTitle_() {
		return title_;
	}
	public void setTitle_(String title_) {
		this.title_ = title_;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
