package com.hua.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hua.app.dao.WeichatBatchPriceAdjustmentDAO;
import com.hua.app.service.WeicharBatchPriceAdjustmentService;
import com.hua.app.vo.WeichatBatchPriceAdjustmentVO;

@Service
public class WeicharBatchPriceAdjustmentServiceImpl implements WeicharBatchPriceAdjustmentService {
	
	@Autowired
	private WeichatBatchPriceAdjustmentDAO dao;

	public String commit(WeichatBatchPriceAdjustmentVO vo) {
		String str = "successful";
		try {
			dao.commit(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String delete(WeichatBatchPriceAdjustmentVO vo) {
		String str = "successful";
		try {
			dao.delete(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String update(WeichatBatchPriceAdjustmentVO vo) {
		String str = "successful";
		try {
			dao.update(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public List<WeichatBatchPriceAdjustmentVO> search(WeichatBatchPriceAdjustmentVO vo) {
		return dao.search(vo);
	}

	public Integer count(WeichatBatchPriceAdjustmentVO vo) {
		return dao.count(vo);
	}

}
