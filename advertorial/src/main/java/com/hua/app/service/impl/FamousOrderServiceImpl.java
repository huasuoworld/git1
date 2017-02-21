package com.hua.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hua.app.dao.FamousOrderDAO;
import com.hua.app.service.FamousOrderService;
import com.hua.app.vo.FamousOrderVO;

@Service
public class FamousOrderServiceImpl implements FamousOrderService {
	
	@Autowired
	private FamousOrderDAO dao;

	public String commit(FamousOrderVO vo) {
		String str = "successful";
		try {
			dao.commit(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String delete(FamousOrderVO vo) {
		String str = "successful";
		try {
			dao.delete(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String update(FamousOrderVO vo) {
		String str = "successful";
		try {
			dao.update(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public List<FamousOrderVO> search(FamousOrderVO vo) {
		return dao.search(vo);
	}

	public Integer count(FamousOrderVO vo) {
		return dao.count(vo);
	}

}
