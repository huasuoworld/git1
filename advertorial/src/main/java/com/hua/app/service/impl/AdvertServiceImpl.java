package com.hua.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hua.app.dao.AdvertDAO;
import com.hua.app.service.AdvertService;
import com.hua.app.vo.AdvertVO;

@Service
public class AdvertServiceImpl implements AdvertService {
	
	@Autowired
	private AdvertDAO dao;

	public String commit(AdvertVO vo) {
		String str = "successful";
		try {
			dao.commit(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String delete(AdvertVO vo) {
		String str = "successful";
		try {
			dao.delete(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String update(AdvertVO vo) {
		String str = "successful";
		try {
			dao.update(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public List<AdvertVO> search(AdvertVO vo) {
		return dao.search(vo);
	}

	public Integer count(AdvertVO vo) {
		return dao.count(vo);
	}

}
