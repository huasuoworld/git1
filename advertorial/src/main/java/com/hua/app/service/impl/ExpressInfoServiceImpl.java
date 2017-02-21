package com.hua.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hua.app.dao.ExpressInfoDAO;
import com.hua.app.service.ExpressInfoService;
import com.hua.app.vo.ExpressInfoVO;

@Service
public class ExpressInfoServiceImpl implements ExpressInfoService {
	
	@Autowired
	private ExpressInfoDAO dao;

	public String commit(ExpressInfoVO vo) {
		String str = "successful";
		try {
			dao.commit(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String delete(ExpressInfoVO vo) {
		String str = "successful";
		try {
			dao.delete(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String update(ExpressInfoVO vo) {
		String str = "successful";
		try {
			dao.update(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public List<ExpressInfoVO> search(ExpressInfoVO vo) {
		return dao.search(vo);
	}

	public Integer count(ExpressInfoVO vo) {
		return dao.count(vo);
	}

}
