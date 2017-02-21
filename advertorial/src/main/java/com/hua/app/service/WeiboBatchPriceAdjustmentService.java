package com.hua.app.service;

import java.util.List;

import com.hua.app.vo.WeiboBatchPriceAdjustmentVO;

public interface WeiboBatchPriceAdjustmentService {

	public String commit(WeiboBatchPriceAdjustmentVO vo);
	public String delete(WeiboBatchPriceAdjustmentVO vo);
	public String update(WeiboBatchPriceAdjustmentVO vo);
	public List<WeiboBatchPriceAdjustmentVO> search(WeiboBatchPriceAdjustmentVO vo);
	public Integer count(WeiboBatchPriceAdjustmentVO vo);
}
