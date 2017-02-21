package com.hua.app.service;

import java.util.List;

import com.hua.app.vo.FinancialReportVO;

public interface FinancialReportService {

	public String commit(FinancialReportVO vo);
	public String delete(FinancialReportVO vo);
	public String update(FinancialReportVO vo);
	public List<FinancialReportVO> search(FinancialReportVO vo);
	public Integer count(FinancialReportVO vo);
}
