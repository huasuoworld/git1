package com.hua.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hua.app.dao.PortalMediaDAO;
import com.hua.app.service.PortalMediaService;
import com.hua.app.vo.PortalMediaVO;

@Service
public class PortalMediaServiceImpl implements PortalMediaService {
	
	@Autowired
	private PortalMediaDAO dao;

	public String commit(PortalMediaVO vo) {
		String str = "successful";
		try {
			dao.commit(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String delete(PortalMediaVO vo) {
		String str = "successful";
		try {
			dao.delete(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String update(PortalMediaVO vo) {
		String str = "successful";
		try {
			dao.update(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public List<PortalMediaVO> search(PortalMediaVO vo) {
		return dao.search(vo);
	}

	public Integer count(PortalMediaVO vo) {
		return dao.count(vo);
	}

}
