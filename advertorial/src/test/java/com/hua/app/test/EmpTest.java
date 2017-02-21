package com.hua.app.test;

import java.util.List;

import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hua.app.service.EmpService;
import com.hua.app.vo.EmpVO;

public class EmpTest {
	
	private EmpService empService;
	
    @Before
    public void before(){                                                                   
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:conf/spring.xml"
                ,"classpath:conf/spring-mybatis.xml"});
        empService = (EmpService) context.getBean("empServiceImpl");
    }
     
    @Test
    public void selectFromEmp(){
    	EmpVO empVO = new EmpVO();
    	empVO.setStart(20);
    	empVO.setLimit(20);
        List<EmpVO> test = empService.selectFromEmp(empVO);
        for(int i = 0; i < test.size(); i++) {
        	JSONObject json = new JSONObject(test.get(i));
        	System.out.println(json);
        }
		
    }
}
 