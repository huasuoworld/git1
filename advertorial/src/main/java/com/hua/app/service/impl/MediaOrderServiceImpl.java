package com.hua.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hua.app.dao.MediaOrderDAO;
import com.hua.app.service.MediaOrderService;
import com.hua.app.vo.MediaOrderVO;

@Service
public class MediaOrderServiceImpl implements MediaOrderService {
	
	@Autowired
	private MediaOrderDAO dao;

	public String commit(MediaOrderVO vo) {
		String str = "successful";
		try {
			dao.commit(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String delete(MediaOrderVO vo) {
		String str = "successful";
		try {
			dao.delete(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String update(MediaOrderVO vo) {
		String str = "successful";
		try {
			dao.update(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public List<MediaOrderVO> search(MediaOrderVO vo) {
		return dao.search(vo);
	}

	public Integer count(MediaOrderVO vo) {
		return dao.count(vo);
	}

}
