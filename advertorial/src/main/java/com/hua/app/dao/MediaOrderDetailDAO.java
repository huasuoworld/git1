package com.hua.app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hua.app.vo.MediaOrderDetailVO;

@Repository(value = "mediaOrderDetailMapper") 
public interface MediaOrderDetailDAO {
	
	public String commit(MediaOrderDetailVO vo);
	public String delete(MediaOrderDetailVO vo);
	public String update(MediaOrderDetailVO vo);
	public List<MediaOrderDetailVO> search(MediaOrderDetailVO vo);
	public Integer count(MediaOrderDetailVO vo);
}
