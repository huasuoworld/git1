package com.hua.app.service;

import java.util.List;

import com.hua.app.vo.WeiboMediaVO;

public interface WeiboMediaService {

	public String commit(WeiboMediaVO vo);
	public String delete(WeiboMediaVO vo);
	public String update(WeiboMediaVO vo);
	public List<WeiboMediaVO> search(WeiboMediaVO vo);
	public Integer count(WeiboMediaVO vo);
}
