package com.hua.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hua.app.dao.WeichatOrderDetailDAO;
import com.hua.app.service.WeichatOrderDetailService;
import com.hua.app.vo.WeichatOrderDetailVO;

@Service
public class WeichatOrderDetailServiceImpl implements WeichatOrderDetailService {
	
	@Autowired
	private WeichatOrderDetailDAO dao;

	public String commit(WeichatOrderDetailVO vo) {
		String str = "successful";
		try {
			dao.commit(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String delete(WeichatOrderDetailVO vo) {
		String str = "successful";
		try {
			dao.delete(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String update(WeichatOrderDetailVO vo) {
		String str = "successful";
		try {
			dao.update(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public List<WeichatOrderDetailVO> search(WeichatOrderDetailVO vo) {
		return dao.search(vo);
	}

	public Integer count(WeichatOrderDetailVO vo) {
		return dao.count(vo);
	}

}
