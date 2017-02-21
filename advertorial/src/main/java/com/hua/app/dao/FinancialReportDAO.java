package com.hua.app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hua.app.vo.FinancialReportVO;

@Repository(value = "financialReportMapper") 
public interface FinancialReportDAO {
	
	public String commit(FinancialReportVO vo);
	public String delete(FinancialReportVO vo);
	public String update(FinancialReportVO vo);
	public List<FinancialReportVO> search(FinancialReportVO vo);
	public Integer count(FinancialReportVO vo);
}
