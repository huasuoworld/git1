package com.hua.app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hua.app.vo.FamousOrderDetailVO;

@Repository(value = "famousOrderDetailMapper") 
public interface FamousOrderDetailDAO {
	
	public String commit(FamousOrderDetailVO vo);
	public String delete(FamousOrderDetailVO vo);
	public String update(FamousOrderDetailVO vo);
	public List<FamousOrderDetailVO> search(FamousOrderDetailVO vo);
	public Integer count(FamousOrderDetailVO vo);

}
