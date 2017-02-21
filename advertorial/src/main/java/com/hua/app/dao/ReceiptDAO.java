package com.hua.app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hua.app.vo.ReceiptVO;

@Repository(value = "receiptMapper") 
public interface ReceiptDAO {
	
	public String commit(ReceiptVO vo);
	public String delete(ReceiptVO vo);
	public String update(ReceiptVO vo);
	public List<ReceiptVO> search(ReceiptVO vo);
	public Integer count(ReceiptVO vo);
}
