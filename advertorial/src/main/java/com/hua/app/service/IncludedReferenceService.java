package com.hua.app.service;

import java.util.List;

import com.hua.app.vo.IncludedReferenceVO;

public interface IncludedReferenceService {

	public String commit(IncludedReferenceVO vo);
	public String delete(IncludedReferenceVO vo);
	public String update(IncludedReferenceVO vo);
	public List<IncludedReferenceVO> search(IncludedReferenceVO vo);
	public Integer count(IncludedReferenceVO vo);
}
