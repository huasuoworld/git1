package com.hua.app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hua.app.vo.EmpVO;

/**
 * @author Administrator
 *
 */
@Repository(value = "empMapper") 
public interface EmpDAO {
	
	List<EmpVO> selectFromEmp(EmpVO empVO); 

	Integer countFromEmp(EmpVO empVO);
}
