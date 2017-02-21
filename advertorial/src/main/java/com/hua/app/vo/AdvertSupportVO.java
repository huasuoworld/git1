package com.hua.app.vo;

public class AdvertSupportVO extends BaseVO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	#主键	did
	#广告位名称	advert_name
	#尺寸	advert_size
	#最后修改时间	last_update_time
	#最后修改人	last_update_by
	 * 
	 * */
	private String did;
	private String advert_name;
	private String advert_size;
	
	public String getDid() {
		return did;
	}
	public void setDid(String did) {
		this.did = did;
	}
	public String getAdvert_name() {
		return advert_name;
	}
	public void setAdvert_name(String advert_name) {
		this.advert_name = advert_name;
	}
	public String getAdvert_size() {
		return advert_size;
	}
	public void setAdvert_size(String advert_size) {
		this.advert_size = advert_size;
	}
	
	
}
