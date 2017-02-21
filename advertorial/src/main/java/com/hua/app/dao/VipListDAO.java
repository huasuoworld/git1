package com.hua.app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hua.app.vo.VipListVO;

@Repository(value = "vipListMapper") 
public interface VipListDAO {
	
	public String commit(VipListVO vo);
	public String delete(VipListVO vo);
	public String update(VipListVO vo);
	public List<VipListVO> search(VipListVO vo);
	public Integer count(VipListVO vo);
}
