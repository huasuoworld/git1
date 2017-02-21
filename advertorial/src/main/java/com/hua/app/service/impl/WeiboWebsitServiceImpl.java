package com.hua.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hua.app.dao.WeiboWebsitDAO;
import com.hua.app.service.WeiboWebsitService;
import com.hua.app.vo.WeiboWebsitVO;

@Service
public class WeiboWebsitServiceImpl implements WeiboWebsitService {
	
	@Autowired
	private WeiboWebsitDAO dao;

	public String commit(WeiboWebsitVO vo) {
		String str = "successful";
		try {
			dao.commit(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String delete(WeiboWebsitVO vo) {
		String str = "successful";
		try {
			dao.delete(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String update(WeiboWebsitVO vo) {
		String str = "successful";
		try {
			dao.update(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public List<WeiboWebsitVO> search(WeiboWebsitVO vo) {
		return dao.search(vo);
	}

	public Integer count(WeiboWebsitVO vo) {
		return dao.count(vo);
	}

}
