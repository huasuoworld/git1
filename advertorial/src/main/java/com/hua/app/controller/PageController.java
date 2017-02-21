package com.hua.app.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hua.app.service.EmpService;
import com.hua.app.vo.EmpVO;

@Controller
@RequestMapping(value = "/page")
public class PageController {

	@Resource
	private EmpService empService;

	@RequestMapping(value = "/go", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> index(EmpVO empVO) {
		
		Map<String, Object> map = new HashMap<String, Object>(); 
		List<EmpVO> test = empService.selectFromEmp(empVO);
		Integer count = empService.countFromEmp(empVO);
		System.out.println(test.size());
		StringBuffer str = new StringBuffer();

		map.put("list", test);
		map.put("count", count);
		
		str.append(new JSONObject(map));

		return map;
	}

}
