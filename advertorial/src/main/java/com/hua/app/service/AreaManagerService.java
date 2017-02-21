package com.hua.app.service;

import java.util.List;

import com.hua.app.vo.AreaManagerVO;

public interface AreaManagerService {

	public String commit(AreaManagerVO vo);
	public String delete(AreaManagerVO vo);
	public String update(AreaManagerVO vo);
	public List<AreaManagerVO> search(AreaManagerVO vo);
	public Integer count(AreaManagerVO vo);
}
