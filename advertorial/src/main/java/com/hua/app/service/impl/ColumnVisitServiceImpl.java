package com.hua.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hua.app.dao.ColumnVisitDAO;
import com.hua.app.vo.ColumnVisitVO;

@Service
public class ColumnVisitServiceImpl implements com.hua.app.service.ColumnVisitService {
	
	@Autowired
	private ColumnVisitDAO dao;

	public String commit(ColumnVisitVO vo) {
		String str = "successful";
		try {
			dao.commit(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String delete(ColumnVisitVO vo) {
		String str = "successful";
		try {
			dao.delete(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String update(ColumnVisitVO vo) {
		String str = "successful";
		try {
			dao.update(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public List<ColumnVisitVO> search(ColumnVisitVO vo) {
		return dao.search(vo);
	}

	public Integer count(ColumnVisitVO vo) {
		return dao.count(vo);
	}

}
