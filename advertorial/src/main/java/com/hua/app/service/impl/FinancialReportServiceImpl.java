package com.hua.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hua.app.dao.FinancialReportDAO;
import com.hua.app.service.FinancialReportService;
import com.hua.app.vo.FinancialReportVO;

@Service
public class FinancialReportServiceImpl implements FinancialReportService {
	
	@Autowired
	private FinancialReportDAO dao;

	public String commit(FinancialReportVO vo) {
		String str = "successful";
		try {
			dao.commit(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String delete(FinancialReportVO vo) {
		String str = "successful";
		try {
			dao.delete(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String update(FinancialReportVO vo) {
		String str = "successful";
		try {
			dao.update(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public List<FinancialReportVO> search(FinancialReportVO vo) {
		return dao.search(vo);
	}

	public Integer count(FinancialReportVO vo) {
		return dao.count(vo);
	}

}
