package com.hua.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hua.app.dao.AreaManagerDAO;
import com.hua.app.vo.AreaManagerVO;

@Service
public class AreaManagerServiceImpl implements com.hua.app.service.AreaManagerService {
	
	@Autowired
	private AreaManagerDAO dao;

	public String commit(AreaManagerVO vo) {
		String str = "successful";
		try {
			dao.commit(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String delete(AreaManagerVO vo) {
		String str = "successful";
		try {
			dao.delete(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String update(AreaManagerVO vo) {
		String str = "successful";
		try {
			dao.update(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public List<AreaManagerVO> search(AreaManagerVO vo) {
		return dao.search(vo);
	}

	public Integer count(AreaManagerVO vo) {
		return dao.count(vo);
	}

}
