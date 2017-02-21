package com.hua.app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hua.app.vo.WeiboMediaVO;

@Repository(value = "weiboMediaMapper") 
public interface WeiboMediaDAO {
	
	public String commit(WeiboMediaVO vo);
	public String delete(WeiboMediaVO vo);
	public String update(WeiboMediaVO vo);
	public List<WeiboMediaVO> search(WeiboMediaVO vo);
	public Integer count(WeiboMediaVO vo);
}
