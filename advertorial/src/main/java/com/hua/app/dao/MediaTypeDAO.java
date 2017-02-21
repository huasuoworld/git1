package com.hua.app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hua.app.vo.MediaTypeVO;

@Repository(value = "mediaTypeMapper") 
public interface MediaTypeDAO {
	
	public String commit(MediaTypeVO vo);
	public String delete(MediaTypeVO vo);
	public String update(MediaTypeVO vo);
	public List<MediaTypeVO> search(MediaTypeVO vo);
	public Integer count(MediaTypeVO vo);
}
