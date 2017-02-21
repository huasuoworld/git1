package com.hua.app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hua.app.vo.LinkTypeVO;

@Repository(value = "linkTypeMapper") 
public interface LinkTypeDAO {
	
	public String commit(LinkTypeVO vo);
	public String delete(LinkTypeVO vo);
	public String update(LinkTypeVO vo);
	public List<LinkTypeVO> search(LinkTypeVO vo);
	public Integer count(LinkTypeVO vo);
}
