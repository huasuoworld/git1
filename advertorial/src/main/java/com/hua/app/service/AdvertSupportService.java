package com.hua.app.service;

import java.util.List;

import com.hua.app.vo.AdvertSupportVO;

public interface AdvertSupportService {

	public String commit(AdvertSupportVO vo);
	public String delete(AdvertSupportVO vo);
	public String update(AdvertSupportVO vo);
	public List<AdvertSupportVO> search(AdvertSupportVO vo);
	public Integer count(AdvertSupportVO vo);
}
