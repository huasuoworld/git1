package com.hua.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hua.app.dao.BatchPriceAdjustmentWebsitDAO;
import com.hua.app.service.BatchPriceAdjustmentWebsitService;
import com.hua.app.vo.BatchPriceAdjustmentWebsitVO;

@Service
public class BatchPriceAdjustmentWebsitServiceImpl implements BatchPriceAdjustmentWebsitService {
	
	@Autowired
	private BatchPriceAdjustmentWebsitDAO dao;

	public String commit(BatchPriceAdjustmentWebsitVO vo) {
		String str = "successful";
		try {
			dao.commit(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String delete(BatchPriceAdjustmentWebsitVO vo) {
		String str = "successful";
		try {
			dao.delete(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public String update(BatchPriceAdjustmentWebsitVO vo) {
		String str = "successful";
		try {
			dao.update(vo);
		} catch(Exception e) {
			str = "fail";
		}
		return str;
	}

	public List<BatchPriceAdjustmentWebsitVO> search(BatchPriceAdjustmentWebsitVO vo) {
		return dao.search(vo);
	}

	public Integer count(BatchPriceAdjustmentWebsitVO vo) {
		return dao.count(vo);
	}

}
