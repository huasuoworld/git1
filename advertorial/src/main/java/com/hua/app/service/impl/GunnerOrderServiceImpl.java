package com.hua.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hua.app.dao.GunnerOrderDAO;
import com.hua.app.service.GunnerOrderService;
import com.hua.app.vo.GunnerOrderVO;

@Service
public class GunnerOrderServiceImpl implements GunnerOrderService {
	
	@Autowired
	private GunnerOrderDAO dao;

	public String commit(GunnerOrderVO vo) {
		String str = "successful";
		try {
			dao.commit(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String delete(GunnerOrderVO vo) {
		String str = "successful";
		try {
			dao.delete(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String update(GunnerOrderVO vo) {
		String str = "successful";
		try {
			dao.update(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public List<GunnerOrderVO> search(GunnerOrderVO vo) {
		return dao.search(vo);
	}

	public Integer count(GunnerOrderVO vo) {
		return dao.count(vo);
	}

}
