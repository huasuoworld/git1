package com.hua.app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hua.app.vo.WeichatMediaTypeVO;

@Repository(value = "weichatMediaTypeMapper") 
public interface WeichatMediaTypeDAO {
	
	public String commit(WeichatMediaTypeVO vo);
	public String delete(WeichatMediaTypeVO vo);
	public String update(WeichatMediaTypeVO vo);
	public List<WeichatMediaTypeVO> search(WeichatMediaTypeVO vo);
	public Integer count(WeichatMediaTypeVO vo);
}
