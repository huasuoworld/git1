package com.hua.app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hua.app.vo.FriendshipLinkVO;

@Repository(value = "friendshipLinkMapper") 
public interface FriendshipLinkDAO {
	
	public String commit(FriendshipLinkVO vo);
	public String delete(FriendshipLinkVO vo);
	public String update(FriendshipLinkVO vo);
	public List<FriendshipLinkVO> search(FriendshipLinkVO vo);
	public Integer count(FriendshipLinkVO vo);
}
