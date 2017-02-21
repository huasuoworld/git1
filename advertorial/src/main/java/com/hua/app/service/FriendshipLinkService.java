package com.hua.app.service;

import java.util.List;

import com.hua.app.vo.FriendshipLinkVO;

public interface FriendshipLinkService {

	public String commit(FriendshipLinkVO vo);
	public String delete(FriendshipLinkVO vo);
	public String update(FriendshipLinkVO vo);
	public List<FriendshipLinkVO> search(FriendshipLinkVO vo);
	public Integer count(FriendshipLinkVO vo);
}
