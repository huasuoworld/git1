package com.hua.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hua.app.dao.WeichatOrderDAO;
import com.hua.app.service.WeichatOrderService;
import com.hua.app.vo.WeichatOrderVO;

@Service
public class WeichatOrderServiceImpl implements WeichatOrderService {
	
	@Autowired
	private WeichatOrderDAO dao;

	public String commit(WeichatOrderVO vo) {
		String str = "successful";
		try {
			dao.commit(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String delete(WeichatOrderVO vo) {
		String str = "successful";
		try {
			dao.delete(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String update(WeichatOrderVO vo) {
		String str = "successful";
		try {
			dao.update(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public List<WeichatOrderVO> search(WeichatOrderVO vo) {
		return dao.search(vo);
	}

	public Integer count(WeichatOrderVO vo) {
		return dao.count(vo);
	}

}
