package com.hua.app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hua.app.vo.WeiboOrderDetailVO;

@Repository(value = "WeiboOrderDetailMapper") 
public interface WeiboOrderDetailDAO {
	
	public String commit(WeiboOrderDetailVO vo);
	public String delete(WeiboOrderDetailVO vo);
	public String update(WeiboOrderDetailVO vo);
	public List<WeiboOrderDetailVO> search(WeiboOrderDetailVO vo);
	public Integer count(WeiboOrderDetailVO vo);
}
