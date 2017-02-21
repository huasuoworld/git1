package com.hua.app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hua.app.vo.CustomerCommentVO;

@Repository(value = "customerCommentMapper") 
public interface CustomerCommentDAO {
	
	public String commit(CustomerCommentVO vo);
	public String delete(CustomerCommentVO vo);
	public String update(CustomerCommentVO vo);
	public List<CustomerCommentVO> search(CustomerCommentVO vo);
	public Integer count(CustomerCommentVO vo);

}
