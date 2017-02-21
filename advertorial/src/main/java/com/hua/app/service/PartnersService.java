package com.hua.app.service;

import java.util.List;

import com.hua.app.vo.PartnersVO;

public interface PartnersService {

	public String commit(PartnersVO vo);
	public String delete(PartnersVO vo);
	public String update(PartnersVO vo);
	public List<PartnersVO> search(PartnersVO vo);
	public Integer count(PartnersVO vo);
}
