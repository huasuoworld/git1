package com.hua.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hua.app.dao.FamousPublicDAO;
import com.hua.app.service.FamousPublicService;
import com.hua.app.vo.FamousPublicVO;

@Service
public class FamousPublicServiceImpl implements FamousPublicService {
	
	@Autowired
	private FamousPublicDAO dao;

	public String commit(FamousPublicVO vo) {
		String str = "successful";
		try {
			dao.commit(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String delete(FamousPublicVO vo) {
		String str = "successful";
		try {
			dao.delete(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String update(FamousPublicVO vo) {
		String str = "successful";
		try {
			dao.update(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public List<FamousPublicVO> search(FamousPublicVO vo) {
		return dao.search(vo);
	}

	public Integer count(FamousPublicVO vo) {
		return dao.count(vo);
	}

}
