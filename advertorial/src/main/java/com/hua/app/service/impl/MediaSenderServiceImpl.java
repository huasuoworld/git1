package com.hua.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hua.app.dao.MediaSenderDAO;
import com.hua.app.service.MediaSenderService;
import com.hua.app.vo.MediaSenderVO;

@Service
public class MediaSenderServiceImpl implements MediaSenderService {
	
	@Autowired
	private MediaSenderDAO dao;

	public String commit(MediaSenderVO vo) {
		String str = "successful";
		try {
			dao.commit(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String delete(MediaSenderVO vo) {
		String str = "successful";
		try {
			dao.delete(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String update(MediaSenderVO vo) {
		String str = "successful";
		try {
			dao.update(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public List<MediaSenderVO> search(MediaSenderVO vo) {
		return dao.search(vo);
	}

	public Integer count(MediaSenderVO vo) {
		return dao.count(vo);
	}

}
