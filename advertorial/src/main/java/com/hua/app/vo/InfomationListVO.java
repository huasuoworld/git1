package com.hua.app.vo;

public class InfomationListVO  extends BaseVO {

	/**
	 * 	#主键	did
		#分类	type_
		#关键字	keyword
		#描述	description
		#缩略图	thumbnail
		#内容	content_
		#最后修改时间	last_update_time
		#最后修改人	last_update_by
	 */
	private static final long serialVersionUID = 1L;
	private String did;
	private String type_;
	private String keyword;
	private String description;
	private String thumbnail;
	private String content_;
	//
	public String getDid() {
		return did;
	}
	public void setDid(String did) {
		this.did = did;
	}
	public String getType_() {
		return type_;
	}
	public void setType_(String type_) {
		this.type_ = type_;
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
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public String getContent_() {
		return content_;
	}
	public void setContent_(String content_) {
		this.content_ = content_;
	}
	
}
