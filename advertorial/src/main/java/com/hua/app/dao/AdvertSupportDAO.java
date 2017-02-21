package com.hua.app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hua.app.vo.AdvertSupportVO;

@Repository(value = "advertSupportMapper") 
public interface AdvertSupportDAO {
	
	public String commit(AdvertSupportVO vo);
	public String delete(AdvertSupportVO vo);
	public String update(AdvertSupportVO vo);
	public List<AdvertSupportVO> search(AdvertSupportVO vo);
	public Integer count(AdvertSupportVO vo);

}
