package com.hua.app.service;

import java.util.List;

import com.hua.app.vo.WeichatOrderVO;

public interface WeichatOrderService {

	public String commit(WeichatOrderVO vo);
	public String delete(WeichatOrderVO vo);
	public String update(WeichatOrderVO vo);
	public List<WeichatOrderVO> search(WeichatOrderVO vo);
	public Integer count(WeichatOrderVO vo);
}
