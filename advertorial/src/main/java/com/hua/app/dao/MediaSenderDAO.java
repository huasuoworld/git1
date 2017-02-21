package com.hua.app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hua.app.vo.MediaSenderVO;

@Repository(value = "mediaSenderMapper") 
public interface MediaSenderDAO {
	
	public String commit(MediaSenderVO vo);
	public String delete(MediaSenderVO vo);
	public String update(MediaSenderVO vo);
	public List<MediaSenderVO> search(MediaSenderVO vo);
	public Integer count(MediaSenderVO vo);
}
