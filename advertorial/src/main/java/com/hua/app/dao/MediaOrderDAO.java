package com.hua.app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hua.app.vo.MediaOrderVO;

@Repository(value = "mediaOrderMapper") 
public interface MediaOrderDAO {
	
	public String commit(MediaOrderVO vo);
	public String delete(MediaOrderVO vo);
	public String update(MediaOrderVO vo);
	public List<MediaOrderVO> search(MediaOrderVO vo);
	public Integer count(MediaOrderVO vo);
}
