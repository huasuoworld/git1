package com.hua.app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hua.app.vo.UserFeedbackVO;

@Repository(value = "userFeedbackMapper") 
public interface UserFeedbackDAO {
	
	public String commit(UserFeedbackVO vo);
	public String delete(UserFeedbackVO vo);
	public String update(UserFeedbackVO vo);
	public List<UserFeedbackVO> search(UserFeedbackVO vo);
	public Integer count(UserFeedbackVO vo);
}
