package com.hua.app.vo;

public class MediaWebsitVO  extends BaseVO {

	/**
	 * 	#主键	did
		#媒体类别主键	media_type_did
		#所属地区主键	area_manager_did
		#门户网站	potal_media_did
		#媒体名称	media_name
		#媒体网址	internet_address
		#案例网址	case_address
		#收录参考主键	included_reference_did
		#链接类型主键	link_type_did
		#可发媒体	media_sender_did
		#入口	entry
		#媒体QQ	media_qq
		#成本价	cost_price
		#市场价格	market_price
		#锁定价格	lock_price
		#备注		comment
		#最后修改时间	last_update_time
		#最后修改人	last_update_by
	 */
	private static final long serialVersionUID = 1L;
	private String did;
	private String media_type_did;
	private String area_manager_did;
	private String potal_media_did;
	private String media_name;
	private String internet_address;
	private String case_address;
	private String included_reference_did;
	private String link_type_did;
	private String media_sender_did;
	private String entry;
	private String media_qq;
	private String cost_price;
	private String market_price;
	private String lock_price;
	private String comment;
	//
	public String getDid() {
		return did;
	}
	public void setDid(String did) {
		this.did = did;
	}
	public String getMedia_type_did() {
		return media_type_did;
	}
	public void setMedia_type_did(String media_type_did) {
		this.media_type_did = media_type_did;
	}
	public String getArea_manager_did() {
		return area_manager_did;
	}
	public void setArea_manager_did(String area_manager_did) {
		this.area_manager_did = area_manager_did;
	}
	public String getPotal_media_did() {
		return potal_media_did;
	}
	public void setPotal_media_did(String potal_media_did) {
		this.potal_media_did = potal_media_did;
	}
	public String getMedia_name() {
		return media_name;
	}
	public void setMedia_name(String media_name) {
		this.media_name = media_name;
	}
	public String getInternet_address() {
		return internet_address;
	}
	public void setInternet_address(String internet_address) {
		this.internet_address = internet_address;
	}
	public String getCase_address() {
		return case_address;
	}
	public void setCase_address(String case_address) {
		this.case_address = case_address;
	}
	public String getIncluded_reference_did() {
		return included_reference_did;
	}
	public void setIncluded_reference_did(String included_reference_did) {
		this.included_reference_did = included_reference_did;
	}
	public String getLink_type_did() {
		return link_type_did;
	}
	public void setLink_type_did(String link_type_did) {
		this.link_type_did = link_type_did;
	}
	public String getMedia_sender_did() {
		return media_sender_did;
	}
	public void setMedia_sender_did(String media_sender_did) {
		this.media_sender_did = media_sender_did;
	}
	public String getEntry() {
		return entry;
	}
	public void setEntry(String entry) {
		this.entry = entry;
	}
	public String getMedia_qq() {
		return media_qq;
	}
	public void setMedia_qq(String media_qq) {
		this.media_qq = media_qq;
	}
	public String getCost_price() {
		return cost_price;
	}
	public void setCost_price(String cost_price) {
		this.cost_price = cost_price;
	}
	public String getMarket_price() {
		return market_price;
	}
	public void setMarket_price(String market_price) {
		this.market_price = market_price;
	}
	public String getLock_price() {
		return lock_price;
	}
	public void setLock_price(String lock_price) {
		this.lock_price = lock_price;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
}
