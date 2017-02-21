package com.hua.app.service;

import java.util.List;

import com.hua.app.vo.MediaVO;

public interface MediaService {

	public String commit(MediaVO vo);
	public String delete(MediaVO vo);
	public String update(MediaVO vo);
	public List<MediaVO> search(MediaVO vo);
	public Integer count(MediaVO vo);
}
