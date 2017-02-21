package com.hua.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hua.app.dao.MediaTypeDAO;
import com.hua.app.service.MediaTypeService;
import com.hua.app.vo.MediaTypeVO;

@Service
public class MediaTypeServiceImpl implements MediaTypeService {
	
	@Autowired
	private MediaTypeDAO dao;

	public String commit(MediaTypeVO vo) {
		String str = "successful";
		try {
			dao.commit(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String delete(MediaTypeVO vo) {
		String str = "successful";
		try {
			dao.delete(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String update(MediaTypeVO vo) {
		String str = "successful";
		try {
			dao.update(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public List<MediaTypeVO> search(MediaTypeVO vo) {
		return dao.search(vo);
	}

	public Integer count(MediaTypeVO vo) {
		return dao.count(vo);
	}

}
