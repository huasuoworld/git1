package com.hua.app.vo;

public class FriendshipLinkVO  extends BaseVO {

	/**
	 * 	#主键	did
		#链接名称	link_name
		#链接网址	link_address
		#添加时间	add_time
		#最后修改时间	last_update_time
		#最后修改人	last_update_by
	 */
	private static final long serialVersionUID = 1L;
	private String did;
	private String link_name;
	private String link_address;
	private String add_time;
	//
	public String getDid() {
		return did;
	}
	public void setDid(String did) {
		this.did = did;
	}
	public String getLink_name() {
		return link_name;
	}
	public void setLink_name(String link_name) {
		this.link_name = link_name;
	}
	public String getLink_address() {
		return link_address;
	}
	public void setLink_address(String link_address) {
		this.link_address = link_address;
	}
	public String getAdd_time() {
		return add_time;
	}
	public void setAdd_time(String add_time) {
		this.add_time = add_time;
	}
	
}
