package com.hua.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hua.app.dao.WeiboMediaTypeDAO;
import com.hua.app.service.WeiboMediaTypeService;
import com.hua.app.vo.WeiboMediaTypeVO;

@Service
public class WeiboMediaTypeServiceImpl implements WeiboMediaTypeService {
	
	@Autowired
	private WeiboMediaTypeDAO dao;

	public String commit(WeiboMediaTypeVO vo) {
		String str = "successful";
		try {
			dao.commit(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String delete(WeiboMediaTypeVO vo) {
		String str = "successful";
		try {
			dao.delete(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String update(WeiboMediaTypeVO vo) {
		String str = "successful";
		try {
			dao.update(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public List<WeiboMediaTypeVO> search(WeiboMediaTypeVO vo) {
		return dao.search(vo);
	}

	public Integer count(WeiboMediaTypeVO vo) {
		return dao.count(vo);
	}

}
