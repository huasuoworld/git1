package com.hua.app.service;

import java.util.List;

import com.hua.app.vo.WeiboMediaTypeVO;

public interface WeiboMediaTypeService {

	public String commit(WeiboMediaTypeVO vo);
	public String delete(WeiboMediaTypeVO vo);
	public String update(WeiboMediaTypeVO vo);
	public List<WeiboMediaTypeVO> search(WeiboMediaTypeVO vo);
	public Integer count(WeiboMediaTypeVO vo);
}
