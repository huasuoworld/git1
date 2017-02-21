package com.hua.app.vo;

public class WeiboBatchPriceAdjustmentVO  extends BaseVO {

	/**
	 * 	#主键	did
		#调价选择	price_adjustment_choose
		#直发市场价	straight_market_price
		#直发锁定价	straight_lock_price
		#转发市场价	redirect_market_price
		#转发锁定价	redirect_lock_price
		#直发成本价	straight_cost
		#转发成本价	redirect_cost
		#最后修改时间	last_update_time
		#最后修改人	last_update_by
	 */
	private static final long serialVersionUID = 1L;
	private String did;
	private String price_adjustment_choose;
	private String straight_market_price;
	private String straight_lock_price;
	private String redirect_market_price;
	private String redirect_lock_price;
	private String straight_cost;
	private String redirect_cost;
	//
	public String getDid() {
		return did;
	}
	public void setDid(String did) {
		this.did = did;
	}
	public String getPrice_adjustment_choose() {
		return price_adjustment_choose;
	}
	public void setPrice_adjustment_choose(String price_adjustment_choose) {
		this.price_adjustment_choose = price_adjustment_choose;
	}
	public String getStraight_market_price() {
		return straight_market_price;
	}
	public void setStraight_market_price(String straight_market_price) {
		this.straight_market_price = straight_market_price;
	}
	public String getStraight_lock_price() {
		return straight_lock_price;
	}
	public void setStraight_lock_price(String straight_lock_price) {
		this.straight_lock_price = straight_lock_price;
	}
	public String getRedirect_market_price() {
		return redirect_market_price;
	}
	public void setRedirect_market_price(String redirect_market_price) {
		this.redirect_market_price = redirect_market_price;
	}
	public String getRedirect_lock_price() {
		return redirect_lock_price;
	}
	public void setRedirect_lock_price(String redirect_lock_price) {
		this.redirect_lock_price = redirect_lock_price;
	}
	public String getStraight_cost() {
		return straight_cost;
	}
	public void setStraight_cost(String straight_cost) {
		this.straight_cost = straight_cost;
	}
	public String getRedirect_cost() {
		return redirect_cost;
	}
	public void setRedirect_cost(String redirect_cost) {
		this.redirect_cost = redirect_cost;
	}
	
}
