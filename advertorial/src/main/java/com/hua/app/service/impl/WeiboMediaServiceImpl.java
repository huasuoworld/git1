package com.hua.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hua.app.dao.WeiboMediaDAO;
import com.hua.app.service.WeiboMediaService;
import com.hua.app.vo.WeiboMediaVO;

@Service
public class WeiboMediaServiceImpl implements WeiboMediaService {
	
	@Autowired
	private WeiboMediaDAO dao;

	public String commit(WeiboMediaVO vo) {
		String str = "successful";
		try {
			dao.commit(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String delete(WeiboMediaVO vo) {
		String str = "successful";
		try {
			dao.delete(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String update(WeiboMediaVO vo) {
		String str = "successful";
		try {
			dao.update(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public List<WeiboMediaVO> search(WeiboMediaVO vo) {
		return dao.search(vo);
	}

	public Integer count(WeiboMediaVO vo) {
		return dao.count(vo);
	}

}
