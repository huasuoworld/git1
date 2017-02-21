package com.hua.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hua.app.dao.MediaDAO;
import com.hua.app.service.MediaService;
import com.hua.app.vo.MediaVO;

@Service
public class MediaServiceImpl implements MediaService {

	public String commit(MediaVO vo) {
		String str = "successful";
		try {
			//dao.commit(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String delete(MediaVO vo) {
		String str = "successful";
		try {
			//dao.delete(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String update(MediaVO vo) {
		String str = "successful";
		try {
			//dao.update(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public List<MediaVO> search(MediaVO vo) {
		//dao.search(vo)
		return null;
	}

	public Integer count(MediaVO vo) {
		//dao.count(vo)
		return null;
	}

}
