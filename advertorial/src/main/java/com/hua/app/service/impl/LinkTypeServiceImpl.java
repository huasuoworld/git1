package com.hua.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hua.app.dao.LinkTypeDAO;
import com.hua.app.service.LinkTypeService;
import com.hua.app.vo.LinkTypeVO;

@Service
public class LinkTypeServiceImpl implements LinkTypeService {
	
	@Autowired
	private LinkTypeDAO dao;

	public String commit(LinkTypeVO vo) {
		String str = "successful";
		try {
			dao.commit(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String delete(LinkTypeVO vo) {
		String str = "successful";
		try {
			dao.delete(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String update(LinkTypeVO vo) {
		String str = "successful";
		try {
			dao.update(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public List<LinkTypeVO> search(LinkTypeVO vo) {
		return dao.search(vo);
	}

	public Integer count(LinkTypeVO vo) {
		return dao.count(vo);
	}

}
