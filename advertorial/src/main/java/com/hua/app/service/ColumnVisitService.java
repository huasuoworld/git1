package com.hua.app.service;

import java.util.List;

import com.hua.app.vo.ColumnVisitVO;

public interface ColumnVisitService {

	public String commit(ColumnVisitVO vo);
	public String delete(ColumnVisitVO vo);
	public String update(ColumnVisitVO vo);
	public List<ColumnVisitVO> search(ColumnVisitVO vo);
	public Integer count(ColumnVisitVO vo);
}
