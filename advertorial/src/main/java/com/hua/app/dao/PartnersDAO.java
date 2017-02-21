package com.hua.app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hua.app.vo.PartnersVO;

@Repository(value = "partnersMapper") 
public interface PartnersDAO {
	
	public String commit(PartnersVO vo);
	public String delete(PartnersVO vo);
	public String update(PartnersVO vo);
	public List<PartnersVO> search(PartnersVO vo);
	public Integer count(PartnersVO vo);
}
