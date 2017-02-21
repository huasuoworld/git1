package com.hua.app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hua.app.vo.WeiboMediaTypeVO;

@Repository(value = "weiboMediaTypeMapper") 
public interface WeiboMediaTypeDAO {
	
	public String commit(WeiboMediaTypeVO vo);
	public String delete(WeiboMediaTypeVO vo);
	public String update(WeiboMediaTypeVO vo);
	public List<WeiboMediaTypeVO> search(WeiboMediaTypeVO vo);
	public Integer count(WeiboMediaTypeVO vo);
}
