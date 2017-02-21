package com.hua.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hua.app.dao.InfomationListDAO;
import com.hua.app.service.InfomationListService;
import com.hua.app.vo.InfomationListVO;

@Service
public class InfomationListServiceImpl implements InfomationListService {
	
	@Autowired
	private InfomationListDAO dao;

	public String commit(InfomationListVO vo) {
		String str = "successful";
		try {
			dao.commit(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String delete(InfomationListVO vo) {
		String str = "successful";
		try {
			dao.delete(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String update(InfomationListVO vo) {
		String str = "successful";
		try {
			dao.update(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public List<InfomationListVO> search(InfomationListVO vo) {
		return dao.search(vo);
	}

	public Integer count(InfomationListVO vo) {
		return dao.count(vo);
	}

}
