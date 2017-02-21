package com.hua.app.service;

import java.util.List;

import com.hua.app.vo.CompanyInfoVO;

public interface CompanyInfoService {

	public String commit(CompanyInfoVO vo);
	public String delete(CompanyInfoVO vo);
	public String update(CompanyInfoVO vo);
	public List<CompanyInfoVO> search(CompanyInfoVO vo);
	public Integer count(CompanyInfoVO vo);
}
