package com.hua.app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hua.app.vo.FamousAreaVO;

@Repository(value = "famousAreaMapper") 
public interface FamousAreaDAO {
	
	public String commit(FamousAreaVO vo);
	public String delete(FamousAreaVO vo);
	public String update(FamousAreaVO vo);
	public List<FamousAreaVO> search(FamousAreaVO vo);
	public Integer count(FamousAreaVO vo);

}
