package com.hua.app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hua.app.vo.InfomationListVO;

@Repository(value = "infomationListMapper") 
public interface InfomationListDAO {
	
	public String commit(InfomationListVO vo);
	public String delete(InfomationListVO vo);
	public String update(InfomationListVO vo);
	public List<InfomationListVO> search(InfomationListVO vo);
	public Integer count(InfomationListVO vo);
}
