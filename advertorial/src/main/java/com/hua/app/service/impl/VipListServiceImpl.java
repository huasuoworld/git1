package com.hua.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hua.app.dao.VipListDAO;
import com.hua.app.service.VipListService;
import com.hua.app.vo.VipListVO;

@Service
public class VipListServiceImpl implements VipListService {
	
	@Autowired
	private VipListDAO dao;

	public String commit(VipListVO vo) {
		String str = "successful";
		try {
			dao.commit(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String delete(VipListVO vo) {
		String str = "successful";
		try {
			dao.delete(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String update(VipListVO vo) {
		String str = "successful";
		try {
			dao.update(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public List<VipListVO> search(VipListVO vo) {
		return dao.search(vo);
	}

	public Integer count(VipListVO vo) {
		return dao.count(vo);
	}

}
