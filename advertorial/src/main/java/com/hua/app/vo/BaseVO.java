package com.hua.app.vo;

public class BaseVO implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5855570747763243891L;

	private int start;
	private int limit;
	private int pageSize;
	private int currentPage;
	private int nextPage;
	private int previousPage;
	private int count_;
	private String[] did_;
	
	private String last_update_time;
	private String last_update_by;

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getNextPage() {
		return nextPage;
	}

	public void setNextPage(int nextPage) {
		this.nextPage = nextPage;
	}

	public int getPreviousPage() {
		return previousPage;
	}

	public void setPreviousPage(int previousPage) {
		this.previousPage = previousPage;
	}


	public int getCount_() {
		return count_;
	}

	public void setCount_(int count_) {
		this.count_ = count_;
	}

	public String getLast_update_time() {
		return last_update_time;
	}

	public void setLast_update_time(String last_update_time) {
		this.last_update_time = last_update_time;
	}

	public String getLast_update_by() {
		return last_update_by;
	}

	public void setLast_update_by(String last_update_by) {
		this.last_update_by = last_update_by;
	}

	public String[] getDid_() {
		return did_;
	}

	public void setDid_(String[] did_) {
		this.did_ = did_;
	}

}
