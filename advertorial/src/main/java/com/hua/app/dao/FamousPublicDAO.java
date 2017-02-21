package com.hua.app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hua.app.vo.FamousPublicVO;

@Repository(value = "famousPublicMapper") 
public interface FamousPublicDAO {
	
	public String commit(FamousPublicVO vo);
	public String delete(FamousPublicVO vo);
	public String update(FamousPublicVO vo);
	public List<FamousPublicVO> search(FamousPublicVO vo);
	public Integer count(FamousPublicVO vo);
}
