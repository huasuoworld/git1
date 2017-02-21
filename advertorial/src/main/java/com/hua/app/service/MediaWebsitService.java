package com.hua.app.service;

import java.util.List;

import com.hua.app.vo.MediaWebsitVO;

public interface MediaWebsitService {

	public String commit(MediaWebsitVO vo);
	public String delete(MediaWebsitVO vo);
	public String update(MediaWebsitVO vo);
	public List<MediaWebsitVO> search(MediaWebsitVO vo);
	public Integer count(MediaWebsitVO vo);
}
