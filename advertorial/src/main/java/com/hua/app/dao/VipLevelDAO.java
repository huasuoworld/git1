package com.hua.app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hua.app.vo.VipLevelVO;

@Repository(value = "vipLevelMapper") 
public interface VipLevelDAO {
	
	public String commit(VipLevelVO vo);
	public String delete(VipLevelVO vo);
	public String update(VipLevelVO vo);
	public List<VipLevelVO> search(VipLevelVO vo);
	public Integer count(VipLevelVO vo);
}
