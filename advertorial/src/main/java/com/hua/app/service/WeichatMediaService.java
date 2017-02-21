package com.hua.app.service;

import java.util.List;

import com.hua.app.vo.WeichatMediaVO;

public interface WeichatMediaService {

	public String commit(WeichatMediaVO vo);
	public String delete(WeichatMediaVO vo);
	public String update(WeichatMediaVO vo);
	public List<WeichatMediaVO> search(WeichatMediaVO vo);
	public Integer count(WeichatMediaVO vo);
}
