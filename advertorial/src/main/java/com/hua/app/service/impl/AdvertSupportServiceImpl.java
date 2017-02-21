package com.hua.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hua.app.dao.AdvertSupportDAO;
import com.hua.app.service.AdvertSupportService;
import com.hua.app.vo.AdvertSupportVO;

@Service
public class AdvertSupportServiceImpl implements AdvertSupportService {
	
	@Autowired
	private AdvertSupportDAO dao;

	public String commit(AdvertSupportVO vo) {
		String str = "successful";
		try {
			dao.commit(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String delete(AdvertSupportVO vo) {
		String str = "successful";
		try {
			dao.delete(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String update(AdvertSupportVO vo) {
		String str = "successful";
		try {
			dao.update(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public List<AdvertSupportVO> search(AdvertSupportVO vo) {
		return dao.search(vo);
	}

	public Integer count(AdvertSupportVO vo) {
		return dao.count(vo);
	}

}
