package com.hua.app.vo;

public class CompanyInfoVO  extends BaseVO  {

	/**
	 * 	#主键	did
		#公司名称 company_name
		#纳税识别号 tax_no
		#公司地址	company_address
		#电话	telephone
		#开户行	bank
		#账号	user_
		#税务登记	tax_regist
		#最后修改时间	last_update_time
		#最后修改人	last_update_by
	 */
	private static final long serialVersionUID = 1L;

	private String did;
	private String company_name;
	private String tax_no;
	private String company_address;
	private String telephone;
	private String bank;
	private String user_;
	private String tax_regist;
	
	public String getDid() {
		return did;
	}
	public void setDid(String did) {
		this.did = did;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getTax_no() {
		return tax_no;
	}
	public void setTax_no(String tax_no) {
		this.tax_no = tax_no;
	}
	public String getCompany_address() {
		return company_address;
	}
	public void setCompany_address(String company_address) {
		this.company_address = company_address;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getUser_() {
		return user_;
	}
	public void setUser_(String user_) {
		this.user_ = user_;
	}
	public String getTax_regist() {
		return tax_regist;
	}
	public void setTax_regist(String tax_regist) {
		this.tax_regist = tax_regist;
	}
	
	
}
