package com.hua.app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hua.app.vo.WeiboOrderVO;

@Repository(value = "weiboOrderMapper") 
public interface WeiboOrderDAO {
	
	public String commit(WeiboOrderVO vo);
	public String delete(WeiboOrderVO vo);
	public String update(WeiboOrderVO vo);
	public List<WeiboOrderVO> search(WeiboOrderVO vo);
	public Integer count(WeiboOrderVO vo);
}
