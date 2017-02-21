package com.hua.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hua.app.dao.WeiboOrderDetailDAO;
import com.hua.app.service.WeiboOrderDetailService;
import com.hua.app.vo.WeiboOrderDetailVO;

@Service
public class WeiboOrderDetailServiceImpl implements WeiboOrderDetailService {
	
	@Autowired
	private WeiboOrderDetailDAO dao;

	public String commit(WeiboOrderDetailVO vo) {
		String str = "successful";
		try {
			dao.commit(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String delete(WeiboOrderDetailVO vo) {
		String str = "successful";
		try {
			dao.delete(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String update(WeiboOrderDetailVO vo) {
		String str = "successful";
		try {
			dao.update(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public List<WeiboOrderDetailVO> search(WeiboOrderDetailVO vo) {
		return dao.search(vo);
	}

	public Integer count(WeiboOrderDetailVO vo) {
		return dao.count(vo);
	}

}
