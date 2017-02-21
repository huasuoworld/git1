package com.hua.app.service;

import java.util.List;

import com.hua.app.vo.WeiboOrderDetailVO;

public interface WeiboOrderDetailService {

	public String commit(WeiboOrderDetailVO vo);
	public String delete(WeiboOrderDetailVO vo);
	public String update(WeiboOrderDetailVO vo);
	public List<WeiboOrderDetailVO> search(WeiboOrderDetailVO vo);
	public Integer count(WeiboOrderDetailVO vo);
}
