package com.hua.app.service;

import java.util.List;

import com.hua.app.vo.WeiboWebsitVO;

public interface WeiboWebsitService {

	public String commit(WeiboWebsitVO vo);
	public String delete(WeiboWebsitVO vo);
	public String update(WeiboWebsitVO vo);
	public List<WeiboWebsitVO> search(WeiboWebsitVO vo);
	public Integer count(WeiboWebsitVO vo);
}
