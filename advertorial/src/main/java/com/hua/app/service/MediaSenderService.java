package com.hua.app.service;

import java.util.List;

import com.hua.app.vo.MediaSenderVO;

public interface MediaSenderService {

	public String commit(MediaSenderVO vo);
	public String delete(MediaSenderVO vo);
	public String update(MediaSenderVO vo);
	public List<MediaSenderVO> search(MediaSenderVO vo);
	public Integer count(MediaSenderVO vo);
}
