package com.hua.app.service;

import java.util.List;

import com.hua.app.vo.BatchPriceAdjustmentWebsitVO;

public interface BatchPriceAdjustmentWebsitService {

	public String commit(BatchPriceAdjustmentWebsitVO vo);
	public String delete(BatchPriceAdjustmentWebsitVO vo);
	public String update(BatchPriceAdjustmentWebsitVO vo);
	public List<BatchPriceAdjustmentWebsitVO> search(BatchPriceAdjustmentWebsitVO vo);
	public Integer count(BatchPriceAdjustmentWebsitVO vo);
}
