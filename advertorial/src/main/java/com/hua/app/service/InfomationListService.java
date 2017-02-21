package com.hua.app.service;

import java.util.List;

import com.hua.app.vo.InfomationListVO;

public interface InfomationListService {

	public String commit(InfomationListVO vo);
	public String delete(InfomationListVO vo);
	public String update(InfomationListVO vo);
	public List<InfomationListVO> search(InfomationListVO vo);
	public Integer count(InfomationListVO vo);
}
