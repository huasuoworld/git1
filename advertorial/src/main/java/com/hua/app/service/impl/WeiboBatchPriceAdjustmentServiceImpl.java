package com.hua.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hua.app.dao.WeiboBatchPriceAdjustmentDAO;
import com.hua.app.service.WeiboBatchPriceAdjustmentService;
import com.hua.app.vo.WeiboBatchPriceAdjustmentVO;

@Service
public class WeiboBatchPriceAdjustmentServiceImpl implements WeiboBatchPriceAdjustmentService {
	
	@Autowired
	private WeiboBatchPriceAdjustmentDAO dao;

	public String commit(WeiboBatchPriceAdjustmentVO vo) {
		String str = "successful";
		try {
			dao.commit(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String delete(WeiboBatchPriceAdjustmentVO vo) {
		String str = "successful";
		try {
			dao.delete(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String update(WeiboBatchPriceAdjustmentVO vo) {
		String str = "successful";
		try {
			dao.update(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public List<WeiboBatchPriceAdjustmentVO> search(WeiboBatchPriceAdjustmentVO vo) {
		return dao.search(vo);
	}

	public Integer count(WeiboBatchPriceAdjustmentVO vo) {
		return dao.count(vo);
	}

}
