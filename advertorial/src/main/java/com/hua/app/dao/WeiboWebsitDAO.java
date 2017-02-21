package com.hua.app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hua.app.vo.WeiboWebsitVO;

@Repository(value = "weiboWebsitMapper") 
public interface WeiboWebsitDAO {
	
	public String commit(WeiboWebsitVO vo);
	public String delete(WeiboWebsitVO vo);
	public String update(WeiboWebsitVO vo);
	public List<WeiboWebsitVO> search(WeiboWebsitVO vo);
	public Integer count(WeiboWebsitVO vo);
}
