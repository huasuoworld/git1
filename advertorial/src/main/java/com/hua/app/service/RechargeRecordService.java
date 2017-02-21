package com.hua.app.service;

import java.util.List;

import com.hua.app.vo.RechargeRecordVO;

public interface RechargeRecordService {

	public String commit(RechargeRecordVO vo);
	public String delete(RechargeRecordVO vo);
	public String update(RechargeRecordVO vo);
	public List<RechargeRecordVO> search(RechargeRecordVO vo);
	public Integer count(RechargeRecordVO vo);
}
