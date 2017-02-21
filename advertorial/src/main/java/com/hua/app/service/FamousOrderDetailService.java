package com.hua.app.service;

import java.util.List;

import com.hua.app.vo.FamousOrderDetailVO;

public interface FamousOrderDetailService {

	public String commit(FamousOrderDetailVO vo);
	public String delete(FamousOrderDetailVO vo);
	public String update(FamousOrderDetailVO vo);
	public List<FamousOrderDetailVO> search(FamousOrderDetailVO vo);
	public Integer count(FamousOrderDetailVO vo);
}
