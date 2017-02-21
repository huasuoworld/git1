package com.hua.app.service;

import java.util.List;

import com.hua.app.vo.WeichatOrderDetailVO;

public interface WeichatOrderDetailService {

	public String commit(WeichatOrderDetailVO vo);
	public String delete(WeichatOrderDetailVO vo);
	public String update(WeichatOrderDetailVO vo);
	public List<WeichatOrderDetailVO> search(WeichatOrderDetailVO vo);
	public Integer count(WeichatOrderDetailVO vo);
}
