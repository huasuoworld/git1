package com.hua.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hua.app.dao.WeiboOrderDAO;
import com.hua.app.service.WeiboOrderService;
import com.hua.app.vo.WeiboOrderVO;

@Service
public class WeiboOrderServiceImpl implements WeiboOrderService {
	
	@Autowired
	private WeiboOrderDAO dao;

	public String commit(WeiboOrderVO vo) {
		String str = "successful";
		try {
			dao.commit(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String delete(WeiboOrderVO vo) {
		String str = "successful";
		try {
			dao.delete(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String update(WeiboOrderVO vo) {
		String str = "successful";
		try {
			dao.update(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public List<WeiboOrderVO> search(WeiboOrderVO vo) {
		return dao.search(vo);
	}

	public Integer count(WeiboOrderVO vo) {
		return dao.count(vo);
	}

}
