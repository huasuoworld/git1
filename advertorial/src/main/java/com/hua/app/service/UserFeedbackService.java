package com.hua.app.service;

import java.util.List;

import com.hua.app.vo.UserFeedbackVO;

public interface UserFeedbackService {

	public String commit(UserFeedbackVO vo);
	public String delete(UserFeedbackVO vo);
	public String update(UserFeedbackVO vo);
	public List<UserFeedbackVO> search(UserFeedbackVO vo);
	public Integer count(UserFeedbackVO vo);
}
