package com.hua.app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hua.app.vo.MediaWebsitVO;

@Repository(value = "mediaWebsitMapper") 
public interface MediaWebsitDAO {
	
	public String commit(MediaWebsitVO vo);
	public String delete(MediaWebsitVO vo);
	public String update(MediaWebsitVO vo);
	public List<MediaWebsitVO> search(MediaWebsitVO vo);
	public Integer count(MediaWebsitVO vo);
}
