package com.hua.app.service;

import java.util.List;

import com.hua.app.vo.WebsitConfigVO;

public interface WebsitConfigService {

	public String commit(WebsitConfigVO vo);
	public String delete(WebsitConfigVO vo);
	public String update(WebsitConfigVO vo);
	public List<WebsitConfigVO> search(WebsitConfigVO vo);
	public Integer count(WebsitConfigVO vo);
}
