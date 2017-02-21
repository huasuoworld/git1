package com.hua.app.service;

import java.util.List;

import com.hua.app.vo.OrderFeedbackVO;

public interface OrderFeedbackService {

	public String commit(OrderFeedbackVO vo);
	public String delete(OrderFeedbackVO vo);
	public String update(OrderFeedbackVO vo);
	public List<OrderFeedbackVO> search(OrderFeedbackVO vo);
	public Integer count(OrderFeedbackVO vo);
}
