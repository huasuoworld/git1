package com.hua.app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hua.app.vo.WeiboBatchPriceAdjustmentVO;

@Repository(value = "weiboBatchPriceAdjustmentMapper") 
public interface WeiboBatchPriceAdjustmentDAO {
	
	public String commit(WeiboBatchPriceAdjustmentVO vo);
	public String delete(WeiboBatchPriceAdjustmentVO vo);
	public String update(WeiboBatchPriceAdjustmentVO vo);
	public List<WeiboBatchPriceAdjustmentVO> search(WeiboBatchPriceAdjustmentVO vo);
	public Integer count(WeiboBatchPriceAdjustmentVO vo);
}
