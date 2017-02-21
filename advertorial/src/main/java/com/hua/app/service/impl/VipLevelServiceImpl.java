package com.hua.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hua.app.dao.VipLevelDAO;
import com.hua.app.service.VipLevelService;
import com.hua.app.vo.VipLevelVO;

@Service
public class VipLevelServiceImpl implements VipLevelService {
	
	@Autowired
	private VipLevelDAO dao;

	public String commit(VipLevelVO vo) {
		String str = "successful";
		try {
			dao.commit(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String delete(VipLevelVO vo) {
		String str = "successful";
		try {
			dao.delete(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String update(VipLevelVO vo) {
		String str = "successful";
		try {
			dao.update(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public List<VipLevelVO> search(VipLevelVO vo) {
		return dao.search(vo);
	}

	public Integer count(VipLevelVO vo) {
		return dao.count(vo);
	}

}
