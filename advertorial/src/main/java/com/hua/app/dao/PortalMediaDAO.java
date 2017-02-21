package com.hua.app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hua.app.vo.PortalMediaVO;

@Repository(value = "portalMediaMapper") 
public interface PortalMediaDAO {
	
	public String commit(PortalMediaVO vo);
	public String delete(PortalMediaVO vo);
	public String update(PortalMediaVO vo);
	public List<PortalMediaVO> search(PortalMediaVO vo);
	public Integer count(PortalMediaVO vo);
}
