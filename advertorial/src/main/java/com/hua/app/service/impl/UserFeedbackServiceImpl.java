package com.hua.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hua.app.dao.UserFeedbackDAO;
import com.hua.app.service.UserFeedbackService;
import com.hua.app.vo.UserFeedbackVO;

@Service
public class UserFeedbackServiceImpl implements UserFeedbackService {
	
	@Autowired
	private UserFeedbackDAO dao;

	public String commit(UserFeedbackVO vo) {
		String str = "successful";
		try {
			dao.commit(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String delete(UserFeedbackVO vo) {
		String str = "successful";
		try {
			dao.delete(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String update(UserFeedbackVO vo) {
		String str = "successful";
		try {
			dao.update(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public List<UserFeedbackVO> search(UserFeedbackVO vo) {
		return dao.search(vo);
	}

	public Integer count(UserFeedbackVO vo) {
		return dao.count(vo);
	}

}
