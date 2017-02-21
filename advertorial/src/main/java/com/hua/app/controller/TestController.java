package com.hua.app.controller;

import java.util.List;

import javax.annotation.Resource;

import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hua.app.service.EmpService;
import com.hua.app.vo.EmpVO;

@Controller
@RequestMapping(value="/test")
public class TestController {
	
	@Resource  
    private EmpService empService;

	@RequestMapping(value="/{id}",method=RequestMethod.POST) 
	@ResponseBody
	public String index(@PathVariable("id") Long id) {
		EmpVO empVO = new EmpVO();
        List<EmpVO> test = empService.selectFromEmp(empVO);
        System.out.println(test.size());
        StringBuffer str = new StringBuffer();
        for(int i = 0; i < test.size(); i++) {
			JSONObject json = new JSONObject(test.get(i));
			str.append(json);
			str.append("</br>");
        }
		return str.toString();
	}
}
 