package com.hua.app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hua.app.vo.AreaManagerVO;

@Repository(value = "areaManagerMapper") 
public interface AreaManagerDAO {

	public String commit(AreaManagerVO vo);
	public String delete(AreaManagerVO vo);
	public String update(AreaManagerVO vo);
	public List<AreaManagerVO> search(AreaManagerVO vo);
	public Integer count(AreaManagerVO vo);
}
