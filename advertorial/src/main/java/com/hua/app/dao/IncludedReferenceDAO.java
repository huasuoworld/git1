package com.hua.app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hua.app.vo.IncludedReferenceVO;

@Repository(value = "includedReferenceMapper") 
public interface IncludedReferenceDAO {
	
	public String commit(IncludedReferenceVO vo);
	public String delete(IncludedReferenceVO vo);
	public String update(IncludedReferenceVO vo);
	public List<IncludedReferenceVO> search(IncludedReferenceVO vo);
	public Integer count(IncludedReferenceVO vo);
}
