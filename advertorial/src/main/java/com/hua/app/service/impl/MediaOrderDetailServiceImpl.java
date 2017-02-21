package com.hua.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hua.app.dao.MediaOrderDetailDAO;
import com.hua.app.service.MediaOrderDetailService;
import com.hua.app.vo.MediaOrderDetailVO;

@Service
public class MediaOrderDetailServiceImpl implements MediaOrderDetailService {
	
	@Autowired
	private MediaOrderDetailDAO dao;

	public String commit(MediaOrderDetailVO vo) {
		String str = "successful";
		try {
			dao.commit(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String delete(MediaOrderDetailVO vo) {
		String str = "successful";
		try {
			dao.delete(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String update(MediaOrderDetailVO vo) {
		String str = "successful";
		try {
			dao.update(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public List<MediaOrderDetailVO> search(MediaOrderDetailVO vo) {
		return dao.search(vo);
	}

	public Integer count(MediaOrderDetailVO vo) {
		return dao.count(vo);
	}

}
