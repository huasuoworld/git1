package com.hua.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hua.app.dao.CompanyInfoDAO;
import com.hua.app.service.CompanyInfoService;
import com.hua.app.vo.CompanyInfoVO;

@Service
public class CompanyInfoServiceImpl implements CompanyInfoService {
	
	@Autowired
	private CompanyInfoDAO dao;

	public String commit(CompanyInfoVO vo) {
		String str = "successful";
		try {
			dao.commit(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String delete(CompanyInfoVO vo) {
		String str = "successful";
		try {
			dao.delete(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String update(CompanyInfoVO vo) {
		String str = "successful";
		try {
			dao.update(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public List<CompanyInfoVO> search(CompanyInfoVO vo) {
		return dao.search(vo);
	}

	public Integer count(CompanyInfoVO vo) {
		return dao.count(vo);
	}

}
