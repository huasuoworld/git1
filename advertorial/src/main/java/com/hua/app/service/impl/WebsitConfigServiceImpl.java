package com.hua.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hua.app.dao.WebsitConfigDAO;
import com.hua.app.service.WebsitConfigService;
import com.hua.app.vo.WebsitConfigVO;

@Service
public class WebsitConfigServiceImpl implements WebsitConfigService {
	
	@Autowired
	private WebsitConfigDAO dao;

	public String commit(WebsitConfigVO vo) {
		String str = "successful";
		try {
			dao.commit(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String delete(WebsitConfigVO vo) {
		String str = "successful";
		try {
			dao.delete(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String update(WebsitConfigVO vo) {
		String str = "successful";
		try {
			dao.update(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public List<WebsitConfigVO> search(WebsitConfigVO vo) {
		return dao.search(vo);
	}

	public Integer count(WebsitConfigVO vo) {
		return dao.count(vo);
	}

}
