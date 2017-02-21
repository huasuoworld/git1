package com.hua.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hua.app.dao.PackageManagerDAO;
import com.hua.app.service.PackageManagerService;
import com.hua.app.vo.PackageManagerVO;

@Service
public class PackageManagerServiceImpl implements PackageManagerService {
	
	@Autowired
	private PackageManagerDAO dao;

	public String commit(PackageManagerVO vo) {
		String str = "successful";
		try {
			dao.commit(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String delete(PackageManagerVO vo) {
		String str = "successful";
		try {
			dao.delete(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String update(PackageManagerVO vo) {
		String str = "successful";
		try {
			dao.update(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public List<PackageManagerVO> search(PackageManagerVO vo) {
		return dao.search(vo);
	}

	public Integer count(PackageManagerVO vo) {
		return dao.count(vo);
	}

}
