package com.hua.app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hua.app.vo.WeichatMediaVO;

@Repository(value = "WeichatMediaMapper") 
public interface WeichatMediaDAO {
	
	public String commit(WeichatMediaVO vo);
	public String delete(WeichatMediaVO vo);
	public String update(WeichatMediaVO vo);
	public List<WeichatMediaVO> search(WeichatMediaVO vo);
	public Integer count(WeichatMediaVO vo);
}
