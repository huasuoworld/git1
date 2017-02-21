package com.hua.app.service;

import java.util.List;

import com.hua.app.vo.ExpressInfoVO;

public interface ExpressInfoService {

	public String commit(ExpressInfoVO vo);
	public String delete(ExpressInfoVO vo);
	public String update(ExpressInfoVO vo);
	public List<ExpressInfoVO> search(ExpressInfoVO vo);
	public Integer count(ExpressInfoVO vo);
}
