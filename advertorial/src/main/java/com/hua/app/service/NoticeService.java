package com.hua.app.service;

import java.util.List;

import com.hua.app.vo.NoticeVO;

public interface NoticeService {

	public String commit(NoticeVO vo);
	public String delete(NoticeVO vo);
	public String update(NoticeVO vo);
	public List<NoticeVO> search(NoticeVO vo);
	public Integer count(NoticeVO vo);
}
