package com.hua.app.service;

import java.util.List;

public interface BaseService {

	public String commit();
	public String delete();
	public String update();
	public List<Object> search();
	public String count();
}
