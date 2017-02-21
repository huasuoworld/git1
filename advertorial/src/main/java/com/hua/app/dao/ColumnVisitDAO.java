package com.hua.app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hua.app.vo.ColumnVisitVO;

@Repository(value = "columnVisitMapper") 
public interface ColumnVisitDAO {
	
	public String commit(ColumnVisitVO vo);
	public String delete(ColumnVisitVO vo);
	public String update(ColumnVisitVO vo);
	public List<ColumnVisitVO> search(ColumnVisitVO vo);
	public Integer count(ColumnVisitVO vo);

}
