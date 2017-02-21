package com.hua.app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hua.app.vo.InfomationTypeVO;

@Repository(value = "infomationTypeMapper") 
public interface InfomationTypeDAO {
	
	public String commit(InfomationTypeVO vo);
	public String delete(InfomationTypeVO vo);
	public String update(InfomationTypeVO vo);
	public List<InfomationTypeVO> search(InfomationTypeVO vo);
	public Integer count(InfomationTypeVO vo);
}
