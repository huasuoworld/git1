package com.hua.app.service;

import java.util.List;

import com.hua.app.vo.FamousAreaVO;

public interface FamousAreaService {

	public String commit(FamousAreaVO vo);
	public String delete(FamousAreaVO vo);
	public String update(FamousAreaVO vo);
	public List<FamousAreaVO> search(FamousAreaVO vo);
	public Integer count(FamousAreaVO vo);
}
