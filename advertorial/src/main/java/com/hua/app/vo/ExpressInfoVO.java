package com.hua.app.vo;

public class ExpressInfoVO  extends BaseVO {

	/**
	 * 	#主键	DID
		#收件人	consignee
		#联系电话	telephone
		#收件地址	address
		#物流公司	express_company
		#快递单号	express_no
		#最后修改时间	last_update_time
		#最后修改人	last_update_by
	 */
	private static final long serialVersionUID = 1L;

	private String did;
	private String consignee;
	private String telephone;
	private String address;
	private String express_company;
	private String express_no;
	
	public String getDid() {
		return did;
	}
	public void setDid(String did) {
		this.did = did;
	}
	public String getConsignee() {
		return consignee;
	}
	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getExpress_company() {
		return express_company;
	}
	public void setExpress_company(String express_company) {
		this.express_company = express_company;
	}
	public String getExpress_no() {
		return express_no;
	}
	public void setExpress_no(String express_no) {
		this.express_no = express_no;
	}
	
	
}
