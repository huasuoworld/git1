package com.hua.app.service;

import java.util.List;

import com.hua.app.vo.AdvertVO;

public interface AdvertService {

	public String commit(AdvertVO vo);
	public String delete(AdvertVO vo);
	public String update(AdvertVO vo);
	public List<AdvertVO> search(AdvertVO vo);
	public Integer count(AdvertVO vo);
}
