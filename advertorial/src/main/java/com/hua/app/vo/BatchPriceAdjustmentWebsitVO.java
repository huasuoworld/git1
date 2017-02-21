package com.hua.app.vo;

public class BatchPriceAdjustmentWebsitVO extends BaseVO {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/***
	 * 	#主键	did
		#调价选择	price_adjustment_choose
		#成本价	cost_price
		#市场价格	market_price
		#锁定价格	lock_price
		#最后修改时间	last_update_time
		#最后修改人	last_update_by
	 * 
	 * */
	
	private String did;
	private String price_adjustment_choose;
	private String cost_price;
	private String market_price;
	private String lock_price;
	
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
	
	

}
