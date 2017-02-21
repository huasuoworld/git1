package com.hua.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hua.app.dao.FriendshipLinkDAO;
import com.hua.app.service.FriendshipLinkService;
import com.hua.app.vo.FriendshipLinkVO;

@Service
public class FriendshipLinkServiceImpl implements FriendshipLinkService {
	
	@Autowired
	private FriendshipLinkDAO dao;

	public String commit(FriendshipLinkVO vo) {
		String str = "successful";
		try {
			dao.commit(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String delete(FriendshipLinkVO vo) {
		String str = "successful";
		try {
			dao.delete(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String update(FriendshipLinkVO vo) {
		String str = "successful";
		try {
			dao.update(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public List<FriendshipLinkVO> search(FriendshipLinkVO vo) {
		return dao.search(vo);
	}

	public Integer count(FriendshipLinkVO vo) {
		return dao.count(vo);
	}

}
