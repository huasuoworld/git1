package com.hua.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hua.app.dao.EmpDAO;
import com.hua.app.service.EmpService;
import com.hua.app.vo.EmpVO;


@Service
public class EmpServiceImpl implements EmpService {
	
	@Autowired
	private EmpDAO empDAO;

	public List<EmpVO> selectFromEmp(EmpVO empVO) {
		return empDAO.selectFromEmp(empVO);
	}

	public Integer countFromEmp(EmpVO empVO) {
		return empDAO.countFromEmp(empVO);
	}
}
