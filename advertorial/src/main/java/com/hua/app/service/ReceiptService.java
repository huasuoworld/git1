package com.hua.app.service;

import java.util.List;

import com.hua.app.vo.ReceiptVO;

public interface ReceiptService {

	public String commit(ReceiptVO vo);
	public String delete(ReceiptVO vo);
	public String update(ReceiptVO vo);
	public List<ReceiptVO> search(ReceiptVO vo);
	public Integer count(ReceiptVO vo);
}
