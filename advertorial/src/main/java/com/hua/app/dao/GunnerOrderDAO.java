package com.hua.app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hua.app.vo.GunnerOrderVO;

@Repository(value = "gunnerOrderMapper") 
public interface GunnerOrderDAO {
	
	public String commit(GunnerOrderVO vo);
	public String delete(GunnerOrderVO vo);
	public String update(GunnerOrderVO vo);
	public List<GunnerOrderVO> search(GunnerOrderVO vo);
	public Integer count(GunnerOrderVO vo);
}
