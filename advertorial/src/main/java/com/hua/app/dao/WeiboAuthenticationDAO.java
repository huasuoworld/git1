package com.hua.app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hua.app.vo.WeiboAuthenticationVO;

@Repository(value = "weiboAuthenticationMapper") 
public interface WeiboAuthenticationDAO {
	
	public String commit(WeiboAuthenticationVO vo);
	public String delete(WeiboAuthenticationVO vo);
	public String update(WeiboAuthenticationVO vo);
	public List<WeiboAuthenticationVO> search(WeiboAuthenticationVO vo);
	public Integer count(WeiboAuthenticationVO vo);
}
