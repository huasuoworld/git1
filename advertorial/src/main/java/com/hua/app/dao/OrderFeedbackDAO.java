package com.hua.app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hua.app.vo.OrderFeedbackVO;

@Repository(value = "orderFeedbackMapper") 
public interface OrderFeedbackDAO {
	
	public String commit(OrderFeedbackVO vo);
	public String delete(OrderFeedbackVO vo);
	public String update(OrderFeedbackVO vo);
	public List<OrderFeedbackVO> search(OrderFeedbackVO vo);
	public Integer count(OrderFeedbackVO vo);
}
