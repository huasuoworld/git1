package com.hua.app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hua.app.vo.RechargeRecordVO;

@Repository(value = "rechargeRecordMapper") 
public interface RechargeRecordDAO {
	
	public String commit(RechargeRecordVO vo);
	public String delete(RechargeRecordVO vo);
	public String update(RechargeRecordVO vo);
	public List<RechargeRecordVO> search(RechargeRecordVO vo);
	public Integer count(RechargeRecordVO vo);
}
