package com.hua.app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hua.app.vo.CompanyInfoVO;

@Repository(value = "companyInfoMapper") 
public interface CompanyInfoDAO {

	public String commit(CompanyInfoVO vo);
	public String delete(CompanyInfoVO vo);
	public String update(CompanyInfoVO vo);
	public List<CompanyInfoVO> search(CompanyInfoVO vo);
	public Integer count(CompanyInfoVO vo);
}
