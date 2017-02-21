package com.hua.app.service;

import java.util.List;

import com.hua.app.vo.FamousPublicVO;

public interface FamousPublicService {

	public String commit(FamousPublicVO vo);
	public String delete(FamousPublicVO vo);
	public String update(FamousPublicVO vo);
	public List<FamousPublicVO> search(FamousPublicVO vo);
	public Integer count(FamousPublicVO vo);
}
