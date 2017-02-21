package com.hua.app.service;

import java.util.List;

import com.hua.app.vo.WeiboOrderVO;

public interface WeiboOrderService {

	public String commit(WeiboOrderVO vo);
	public String delete(WeiboOrderVO vo);
	public String update(WeiboOrderVO vo);
	public List<WeiboOrderVO> search(WeiboOrderVO vo);
	public Integer count(WeiboOrderVO vo);
}
