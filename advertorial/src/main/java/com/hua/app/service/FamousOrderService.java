package com.hua.app.service;

import java.util.List;

import com.hua.app.vo.FamousOrderVO;

public interface FamousOrderService {

	public String commit(FamousOrderVO vo);
	public String delete(FamousOrderVO vo);
	public String update(FamousOrderVO vo);
	public List<FamousOrderVO> search(FamousOrderVO vo);
	public Integer count(FamousOrderVO vo);
}
