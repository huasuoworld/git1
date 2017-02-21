package com.hua.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hua.app.dao.WeichatMediaTypeDAO;
import com.hua.app.service.WeichatMediaTypeService;
import com.hua.app.vo.WeichatMediaTypeVO;

@Service
public class WeichatMediaTypeServiceImpl implements WeichatMediaTypeService {
	
	@Autowired
	private WeichatMediaTypeDAO dao;

	public String commit(WeichatMediaTypeVO vo) {
		String str = "successful";
		try {
			dao.commit(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String delete(WeichatMediaTypeVO vo) {
		String str = "successful";
		try {
			dao.delete(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String update(WeichatMediaTypeVO vo) {
		String str = "successful";
		try {
			dao.update(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public List<WeichatMediaTypeVO> search(WeichatMediaTypeVO vo) {
		return dao.search(vo);
	}

	public Integer count(WeichatMediaTypeVO vo) {
		return dao.count(vo);
	}

}
