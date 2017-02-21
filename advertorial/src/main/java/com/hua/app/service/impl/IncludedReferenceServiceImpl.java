package com.hua.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hua.app.dao.IncludedReferenceDAO;
import com.hua.app.service.IncludedReferenceService;
import com.hua.app.vo.IncludedReferenceVO;

@Service
public class IncludedReferenceServiceImpl implements IncludedReferenceService {
	
	@Autowired
	private IncludedReferenceDAO dao;

	public String commit(IncludedReferenceVO vo) {
		String str = "successful";
		try {
			dao.commit(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String delete(IncludedReferenceVO vo) {
		String str = "successful";
		try {
			dao.delete(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String update(IncludedReferenceVO vo) {
		String str = "successful";
		try {
			dao.update(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public List<IncludedReferenceVO> search(IncludedReferenceVO vo) {
		return dao.search(vo);
	}

	public Integer count(IncludedReferenceVO vo) {
		return dao.count(vo);
	}

}
