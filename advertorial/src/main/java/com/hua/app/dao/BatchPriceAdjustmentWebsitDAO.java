package com.hua.app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hua.app.vo.BatchPriceAdjustmentWebsitVO;

@Repository(value = "batchPriceAdjustmentWebsitMapper") 
public interface BatchPriceAdjustmentWebsitDAO {
	
	public String commit(BatchPriceAdjustmentWebsitVO vo);
	public String delete(BatchPriceAdjustmentWebsitVO vo);
	public String update(BatchPriceAdjustmentWebsitVO vo);
	public List<BatchPriceAdjustmentWebsitVO> search(BatchPriceAdjustmentWebsitVO vo);
	public Integer count(BatchPriceAdjustmentWebsitVO vo);

}
