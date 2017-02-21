package com.hua.app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hua.app.vo.ExpressInfoVO;

@Repository(value = "expressInfoMapper") 
public interface ExpressInfoDAO {
	
	public String commit(ExpressInfoVO vo);
	public String delete(ExpressInfoVO vo);
	public String update(ExpressInfoVO vo);
	public List<ExpressInfoVO> search(ExpressInfoVO vo);
	public Integer count(ExpressInfoVO vo);

}
