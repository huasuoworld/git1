package com.hua.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hua.app.dao.OrderFeedbackDAO;
import com.hua.app.service.OrderFeedbackService;
import com.hua.app.vo.OrderFeedbackVO;

@Service
public class OrderFeedbackServiceImpl implements OrderFeedbackService {
	
	@Autowired
	private OrderFeedbackDAO dao;

	public String commit(OrderFeedbackVO vo) {
		String str = "successful";
		try {
			dao.commit(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String delete(OrderFeedbackVO vo) {
		String str = "successful";
		try {
			dao.delete(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String update(OrderFeedbackVO vo) {
		String str = "successful";
		try {
			dao.update(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public List<OrderFeedbackVO> search(OrderFeedbackVO vo) {
		return dao.search(vo);
	}

	public Integer count(OrderFeedbackVO vo) {
		return dao.count(vo);
	}

}
