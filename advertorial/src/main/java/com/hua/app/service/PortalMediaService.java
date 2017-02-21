package com.hua.app.service;

import java.util.List;

import com.hua.app.vo.PortalMediaVO;

public interface PortalMediaService {

	public String commit(PortalMediaVO vo);
	public String delete(PortalMediaVO vo);
	public String update(PortalMediaVO vo);
	public List<PortalMediaVO> search(PortalMediaVO vo);
	public Integer count(PortalMediaVO vo);
}
