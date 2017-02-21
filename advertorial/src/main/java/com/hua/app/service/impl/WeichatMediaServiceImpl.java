package com.hua.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hua.app.dao.WeichatMediaDAO;
import com.hua.app.service.WeichatMediaService;
import com.hua.app.vo.WeichatMediaVO;

@Service
public class WeichatMediaServiceImpl implements WeichatMediaService {
	
	@Autowired
	private WeichatMediaDAO dao;

	public String commit(WeichatMediaVO vo) {
		String str = "successful";
		try {
			dao.commit(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String delete(WeichatMediaVO vo) {
		String str = "successful";
		try {
			dao.delete(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String update(WeichatMediaVO vo) {
		String str = "successful";
		try {
			dao.update(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public List<WeichatMediaVO> search(WeichatMediaVO vo) {
		return dao.search(vo);
	}

	public Integer count(WeichatMediaVO vo) {
		return dao.count(vo);
	}

}
