package com.hua.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hua.app.dao.RechargeRecordDAO;
import com.hua.app.service.RechargeRecordService;
import com.hua.app.vo.RechargeRecordVO;

@Service
public class RechargeRecordServiceImpl implements RechargeRecordService {
	
	@Autowired
	private RechargeRecordDAO dao;

	public String commit(RechargeRecordVO vo) {
		String str = "successful";
		try {
			dao.commit(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String delete(RechargeRecordVO vo) {
		String str = "successful";
		try {
			dao.delete(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String update(RechargeRecordVO vo) {
		String str = "successful";
		try {
			dao.update(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public List<RechargeRecordVO> search(RechargeRecordVO vo) {
		return dao.search(vo);
	}

	public Integer count(RechargeRecordVO vo) {
		return dao.count(vo);
	}

}
