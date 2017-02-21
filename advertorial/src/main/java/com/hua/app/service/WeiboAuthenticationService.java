package com.hua.app.service;

import java.util.List;

import com.hua.app.vo.WeiboAuthenticationVO;

public interface WeiboAuthenticationService {

	public String commit(WeiboAuthenticationVO vo);
	public String delete(WeiboAuthenticationVO vo);
	public String update(WeiboAuthenticationVO vo);
	public List<WeiboAuthenticationVO> search(WeiboAuthenticationVO vo);
	public Integer count(WeiboAuthenticationVO vo);
}
