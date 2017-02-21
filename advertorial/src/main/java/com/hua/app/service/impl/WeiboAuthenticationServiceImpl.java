package com.hua.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hua.app.dao.WeiboAuthenticationDAO;
import com.hua.app.service.WeiboAuthenticationService;
import com.hua.app.vo.WeiboAuthenticationVO;

@Service
public class WeiboAuthenticationServiceImpl implements WeiboAuthenticationService {
	
	@Autowired
	private WeiboAuthenticationDAO dao;

	public String commit(WeiboAuthenticationVO vo) {
		String str = "successful";
		try {
			dao.commit(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String delete(WeiboAuthenticationVO vo) {
		String str = "successful";
		try {
			dao.delete(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String update(WeiboAuthenticationVO vo) {
		String str = "successful";
		try {
			dao.update(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public List<WeiboAuthenticationVO> search(WeiboAuthenticationVO vo) {
		return dao.search(vo);
	}

	public Integer count(WeiboAuthenticationVO vo) {
		return dao.count(vo);
	}

}
