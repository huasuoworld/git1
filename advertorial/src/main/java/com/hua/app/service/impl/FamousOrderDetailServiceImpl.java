package com.hua.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hua.app.dao.FamousOrderDetailDAO;
import com.hua.app.service.FamousOrderDetailService;
import com.hua.app.vo.FamousOrderDetailVO;

@Service
public class FamousOrderDetailServiceImpl implements FamousOrderDetailService {
	
	@Autowired
	private FamousOrderDetailDAO dao;

	public String commit(FamousOrderDetailVO vo) {
		String str = "successful";
		try {
			dao.commit(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String delete(FamousOrderDetailVO vo) {
		String str = "successful";
		try {
			dao.delete(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String update(FamousOrderDetailVO vo) {
		String str = "successful";
		try {
			dao.update(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public List<FamousOrderDetailVO> search(FamousOrderDetailVO vo) {
		return dao.search(vo);
	}

	public Integer count(FamousOrderDetailVO vo) {
		return dao.count(vo);
	}

}
