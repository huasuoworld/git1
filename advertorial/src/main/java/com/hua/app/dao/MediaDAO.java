package com.hua.app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hua.app.vo.MediaVO;

// @Repository(value = "mediaMapper") 
public interface MediaDAO {
	
	public String commit(MediaVO vo);
	public String delete(MediaVO vo);
	public String update(MediaVO vo);
	public List<MediaVO> search(MediaVO vo);
	public Integer count(MediaVO vo);
}
