package com.hua.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hua.app.dao.MediaWebsitDAO;
import com.hua.app.service.MediaWebsitService;
import com.hua.app.vo.MediaWebsitVO;

@Service
public class MediaWebsitServiceImpl implements MediaWebsitService {
	
	@Autowired
	private MediaWebsitDAO dao;

	public String commit(MediaWebsitVO vo) {
		String str = "successful";
		try {
			dao.commit(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String delete(MediaWebsitVO vo) {
		String str = "successful";
		try {
			dao.delete(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String update(MediaWebsitVO vo) {
		String str = "successful";
		try {
			dao.update(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public List<MediaWebsitVO> search(MediaWebsitVO vo) {
		return dao.search(vo);
	}

	public Integer count(MediaWebsitVO vo) {
		return dao.count(vo);
	}

}
