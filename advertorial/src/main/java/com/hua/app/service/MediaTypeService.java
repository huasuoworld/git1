package com.hua.app.service;

import java.util.List;

import com.hua.app.vo.MediaTypeVO;

public interface MediaTypeService {

	public String commit(MediaTypeVO vo);
	public String delete(MediaTypeVO vo);
	public String update(MediaTypeVO vo);
	public List<MediaTypeVO> search(MediaTypeVO vo);
	public Integer count(MediaTypeVO vo);
}
