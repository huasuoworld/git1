package com.hua.app.service;

import java.util.List;

import com.hua.app.vo.EmpVO;

public interface EmpService {
	
	public List<EmpVO> selectFromEmp(EmpVO empVO); 
	
	public Integer countFromEmp(EmpVO empVO);

}
