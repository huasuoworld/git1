package com.hua.app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hua.app.vo.WeichatOrderDetailVO;

@Repository(value = "weichatOrderDetailMapper") 
public interface WeichatOrderDetailDAO {
	
	public String commit(WeichatOrderDetailVO vo);
	public String delete(WeichatOrderDetailVO vo);
	public String update(WeichatOrderDetailVO vo);
	public List<WeichatOrderDetailVO> search(WeichatOrderDetailVO vo);
	public Integer count(WeichatOrderDetailVO vo);
}
