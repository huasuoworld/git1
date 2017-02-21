package com.hua.app.service;

import java.util.List;

import com.hua.app.vo.CustomerCommentVO;

public interface CustomerCommentService {

	public String commit(CustomerCommentVO vo);
	public String delete(CustomerCommentVO vo);
	public String update(CustomerCommentVO vo);
	public List<CustomerCommentVO> search(CustomerCommentVO vo);
	public Integer count(CustomerCommentVO vo);
}
