package com.hua.app.test;

import java.util.List;

import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hua.app.service.AdminListService;
import com.hua.app.vo.AdminListVO;

public class AdminListTest {
	
	private AdminListService adminListService;
	
    @Before
    public void before() {                                                                   
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:conf/spring.xml"
                ,"classpath:conf/spring-mybatis.xml"});
        adminListService = (AdminListService) context.getBean("adminListServiceImpl");
    }
   
  /*  @Test
    public void search() {
    	AdminListVO adminListVO = new AdminListVO();
    	adminListVO.setStart(0);
    	adminListVO.setLimit(20);
        List<AdminListVO> test = adminListService.search(adminListVO);
        for(int i = 0; i < test.size(); i++) {
        	JSONObject json = new JSONObject(test.get(i));
        	System.out.println(json);
        }
    }*/
    @Test
    public void commit() {
    	  
    	AdminListVO commitVO = new AdminListVO();
    	commitVO.setVip_id("1");
    	commitVO.setUser_("1");
    	commitVO.setAdmin_name("1");
    	commitVO.setTelephone("1");
    	commitVO.setQqnumber("1");
    	commitVO.setRole_id("1");
    	commitVO.setPassword("1");
    	commitVO.setLast_update_by("1");
    	
    	adminListService.commit(commitVO);
    }
    /*
    @Test
	public void delete() {
    	AdminListVO deleteVO = new AdminListVO();
    	deleteVO.setDid("1");
    	
    	adminListService.delete(deleteVO);
    }
    @Test
	public void update() {
    	AdminListVO updateVO = new AdminListVO();
    	updateVO.setDid("2");
    	updateVO.setLast_update_by("221");
    	
    	adminListService.update(updateVO);
    }*/


}
