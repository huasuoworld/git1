package com.hua.app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hua.app.vo.WebsitConfigVO;

@Repository(value = "websitConfigMapper") 
public interface WebsitConfigDAO {
	
	public String commit(WebsitConfigVO vo);
	public String delete(WebsitConfigVO vo);
	public String update(WebsitConfigVO vo);
	public List<WebsitConfigVO> search(WebsitConfigVO vo);
	public Integer count(WebsitConfigVO vo);
}
