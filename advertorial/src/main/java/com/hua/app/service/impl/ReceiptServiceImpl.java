package com.hua.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hua.app.dao.ReceiptDAO;
import com.hua.app.service.ReceiptService;
import com.hua.app.vo.ReceiptVO;

@Service
public class ReceiptServiceImpl implements ReceiptService {
	
	@Autowired
	private ReceiptDAO dao;

	public String commit(ReceiptVO vo) {
		String str = "successful";
		try {
			dao.commit(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String delete(ReceiptVO vo) {
		String str = "successful";
		try {
			dao.delete(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String update(ReceiptVO vo) {
		String str = "successful";
		try {
			dao.update(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public List<ReceiptVO> search(ReceiptVO vo) {
		return dao.search(vo);
	}

	public Integer count(ReceiptVO vo) {
		return dao.count(vo);
	}

}
