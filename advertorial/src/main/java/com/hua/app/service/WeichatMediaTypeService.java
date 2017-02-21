package com.hua.app.service;

import java.util.List;

import com.hua.app.vo.WeichatMediaTypeVO;

public interface WeichatMediaTypeService {

	public String commit(WeichatMediaTypeVO vo);
	public String delete(WeichatMediaTypeVO vo);
	public String update(WeichatMediaTypeVO vo);
	public List<WeichatMediaTypeVO> search(WeichatMediaTypeVO vo);
	public Integer count(WeichatMediaTypeVO vo);
}
