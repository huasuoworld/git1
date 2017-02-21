package com.hua.app.service;

import java.util.List;

import com.hua.app.vo.WeichatBatchPriceAdjustmentVO;

public interface WeicharBatchPriceAdjustmentService {

	public String commit(WeichatBatchPriceAdjustmentVO vo);
	public String delete(WeichatBatchPriceAdjustmentVO vo);
	public String update(WeichatBatchPriceAdjustmentVO vo);
	public List<WeichatBatchPriceAdjustmentVO> search(WeichatBatchPriceAdjustmentVO vo);
	public Integer count(WeichatBatchPriceAdjustmentVO vo);
}
