package com.hua.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hua.app.dao.CustomerCommentDAO;
import com.hua.app.service.CustomerCommentService;
import com.hua.app.vo.CustomerCommentVO;

@Service
public class CustomerCommentServiceImpl implements CustomerCommentService {
	
	@Autowired
	private CustomerCommentDAO dao;

	public String commit(CustomerCommentVO vo) {
		String str = "successful";
		try {
			dao.commit(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String delete(CustomerCommentVO vo) {
		String str = "successful";
		try {
			dao.delete(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String update(CustomerCommentVO vo) {
		String str = "successful";
		try {
			dao.update(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public List<CustomerCommentVO> search(CustomerCommentVO vo) {
		return dao.search(vo);
	}

	public Integer count(CustomerCommentVO vo) {
		return dao.count(vo);
	}

}
