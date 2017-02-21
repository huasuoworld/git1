package com.hua.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hua.app.dao.AdminListDAO;
import com.hua.app.service.AdminListService;
import com.hua.app.vo.AdminListVO;

@Service
public class AdminListServiceImpl implements AdminListService {
	
	@Autowired
	private AdminListDAO dao;

	public String commit(AdminListVO vo) {
		String str = "successful";
		try {
			dao.commit(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String delete(AdminListVO vo) {
		String str = "successful";
		try {
			dao.delete(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String update(AdminListVO vo) {
		String str = "successful";
		try {
			dao.update(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public List<AdminListVO> search(AdminListVO vo) {
		return dao.search(vo);
	}

	public Integer count(AdminListVO vo) {
		return dao.count(vo);
	}

}
