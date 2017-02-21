package com.hua.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hua.app.dao.FamousAreaDAO;
import com.hua.app.service.FamousAreaService;
import com.hua.app.vo.FamousAreaVO;

@Service
public class FamousAreaServiceImpl implements FamousAreaService {
	
	@Autowired
	private FamousAreaDAO dao;

	public String commit(FamousAreaVO vo) {
		String str = "successful";
		try {
			dao.commit(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String delete(FamousAreaVO vo) {
		String str = "successful";
		try {
			dao.delete(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String update(FamousAreaVO vo) {
		String str = "successful";
		try {
			dao.update(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public List<FamousAreaVO> search(FamousAreaVO vo) {
		return dao.search(vo);
	}

	public Integer count(FamousAreaVO vo) {
		return dao.count(vo);
	}

}
