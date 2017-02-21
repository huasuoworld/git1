package com.hua.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hua.app.dao.PartnersDAO;
import com.hua.app.service.PartnersService;
import com.hua.app.vo.PartnersVO;

@Service
public class PartnersServiceImpl implements PartnersService {
	
	@Autowired
	private PartnersDAO dao;

	public String commit(PartnersVO vo) {
		String str = "successful";
		try {
			dao.commit(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String delete(PartnersVO vo) {
		String str = "successful";
		try {
			dao.delete(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String update(PartnersVO vo) {
		String str = "successful";
		try {
			dao.update(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public List<PartnersVO> search(PartnersVO vo) {
		return dao.search(vo);
	}

	public Integer count(PartnersVO vo) {
		return dao.count(vo);
	}

}
