package com.hua.app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hua.app.vo.NoticeVO;

@Repository(value = "noticeMapper") 
public interface NoticeDAO {
	
	public String commit(NoticeVO vo);
	public String delete(NoticeVO vo);
	public String update(NoticeVO vo);
	public List<NoticeVO> search(NoticeVO vo);
	public Integer count(NoticeVO vo);
}
