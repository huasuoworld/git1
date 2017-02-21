package com.hua.app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hua.app.vo.AdvertVO;

@Repository(value = "advertMapper") 
public interface AdvertDAO {
	
	public String commit(AdvertVO vo);
	public String delete(AdvertVO vo);
	public String update(AdvertVO vo);
	public List<AdvertVO> search(AdvertVO vo);
	public Integer count(AdvertVO vo);

}
