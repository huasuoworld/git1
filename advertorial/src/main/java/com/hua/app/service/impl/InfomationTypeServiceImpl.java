package com.hua.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hua.app.dao.InfomationTypeDAO;
import com.hua.app.service.InfomationTypeService;
import com.hua.app.vo.InfomationTypeVO;

@Service
public class InfomationTypeServiceImpl implements InfomationTypeService {
	
	@Autowired
	private InfomationTypeDAO dao;

	public String commit(InfomationTypeVO vo) {
		String str = "successful";
		try {
			dao.commit(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String delete(InfomationTypeVO vo) {
		String str = "successful";
		try {
			dao.delete(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String update(InfomationTypeVO vo) {
		String str = "successful";
		try {
			dao.update(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public List<InfomationTypeVO> search(InfomationTypeVO vo) {
		return dao.search(vo);
	}

	public Integer count(InfomationTypeVO vo) {
		return dao.count(vo);
	}

}
