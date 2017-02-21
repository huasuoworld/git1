package com.hua.app.service;

import java.util.List;

import com.hua.app.vo.LinkTypeVO;

public interface LinkTypeService {

	public String commit(LinkTypeVO vo);
	public String delete(LinkTypeVO vo);
	public String update(LinkTypeVO vo);
	public List<LinkTypeVO> search(LinkTypeVO vo);
	public Integer count(LinkTypeVO vo);
}
