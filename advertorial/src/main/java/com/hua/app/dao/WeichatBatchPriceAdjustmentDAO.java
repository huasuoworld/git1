package com.hua.app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hua.app.vo.WeichatBatchPriceAdjustmentVO;

@Repository(value = "weichatBatchPriceAdjustmentMapper") 
public interface WeichatBatchPriceAdjustmentDAO {
	
	public String commit(WeichatBatchPriceAdjustmentVO vo);
	public String delete(WeichatBatchPriceAdjustmentVO vo);
	public String update(WeichatBatchPriceAdjustmentVO vo);
	public List<WeichatBatchPriceAdjustmentVO> search(WeichatBatchPriceAdjustmentVO vo);
	public Integer count(WeichatBatchPriceAdjustmentVO vo);
}
