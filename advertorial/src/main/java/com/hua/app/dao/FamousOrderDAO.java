package com.hua.app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hua.app.vo.FamousOrderVO;

@Repository(value = "famousOrderMapper") 
public interface FamousOrderDAO {
	
	public String commit(FamousOrderVO vo);
	public String delete(FamousOrderVO vo);
	public String update(FamousOrderVO vo);
	public List<FamousOrderVO> search(FamousOrderVO vo);
	public Integer count(FamousOrderVO vo);

}
