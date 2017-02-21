package com.hua.app.vo;

public class WeichatBatchPriceAdjustmentVO  extends BaseVO  {

	/**
	 * 	#主键	did
		#调价选择	price_adjustment_choose
		#单图文市场价格	single_market_price
		#多图文市场价格	more_market_price
		#单图文锁定价格	single_lock_price
		#多图文市锁定价格	more_lock_price
		#单图文成本价	single_cost_price
		#多图文成本价	more_cost_price
		#最后修改时间	last_update_time
		#最后修改人	last_update_by
	 */
	private static final long serialVersionUID = 1L;
	private String did;
	private String price_adjustment_choose;
	private String single_market_price;
	private String more_market_price;
	private String single_lock_price;
	private String more_lock_price;
	private String single_cost_price;
	private String more_cost_price;
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
	public String getSingle_market_price() {
		return single_market_price;
	}
	public void setSingle_market_price(String single_market_price) {
		this.single_market_price = single_market_price;
	}
	public String getMore_market_price() {
		return more_market_price;
	}
	public void setMore_market_price(String more_market_price) {
		this.more_market_price = more_market_price;
	}
	public String getSingle_lock_price() {
		return single_lock_price;
	}
	public void setSingle_lock_price(String single_lock_price) {
		this.single_lock_price = single_lock_price;
	}
	public String getMore_lock_price() {
		return more_lock_price;
	}
	public void setMore_lock_price(String more_lock_price) {
		this.more_lock_price = more_lock_price;
	}
	public String getSingle_cost_price() {
		return single_cost_price;
	}
	public void setSingle_cost_price(String single_cost_price) {
		this.single_cost_price = single_cost_price;
	}
	public String getMore_cost_price() {
		return more_cost_price;
	}
	public void setMore_cost_price(String more_cost_price) {
		this.more_cost_price = more_cost_price;
	}
	
}
