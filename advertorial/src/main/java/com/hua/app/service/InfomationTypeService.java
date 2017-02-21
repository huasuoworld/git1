package com.hua.app.service;

import java.util.List;

import com.hua.app.vo.InfomationTypeVO;

public interface InfomationTypeService {

	public String commit(InfomationTypeVO vo);
	public String delete(InfomationTypeVO vo);
	public String update(InfomationTypeVO vo);
	public List<InfomationTypeVO> search(InfomationTypeVO vo);
	public Integer count(InfomationTypeVO vo);
}
