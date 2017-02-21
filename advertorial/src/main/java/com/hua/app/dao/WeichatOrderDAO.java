package com.hua.app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hua.app.vo.WeichatOrderVO;

@Repository(value = "WeichatOrderMapper") 
public interface WeichatOrderDAO {
	
	public String commit(WeichatOrderVO vo);
	public String delete(WeichatOrderVO vo);
	public String update(WeichatOrderVO vo);
	public List<WeichatOrderVO> search(WeichatOrderVO vo);
	public Integer count(WeichatOrderVO vo);
}
