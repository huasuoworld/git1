package com.hua.app.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.codehaus.jackson.map.ObjectMapper;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hua.app.service.InfomationTypeService;
import com.hua.app.vo.InfomationTypeVO;

@Controller
@RequestMapping(value = "/infomationType")
public class InfomationTypeController {

	@Resource
	private InfomationTypeService service;
	
	@RequestMapping(value="/enter",method=RequestMethod.GET) 
	public String enter() {
		return "infomationType";
	}
	
	@RequestMapping(value="/add",method=RequestMethod.GET) 
	public String add() {
		return "infomationTypeADD";
	}
	
	//{message:"success",list:{did:"1"},count:20}
	@RequestMapping(value = "/search", method = RequestMethod.POST)
	@ResponseBody
	public String search(InfomationTypeVO vo) {
		List<InfomationTypeVO> list = service.search(vo);
		Integer count = service.count(vo);
		
		StringBuffer str = new StringBuffer();
		Map<String, Object> map = new HashMap<String, Object>(); 
		try {
			ObjectMapper obj = new ObjectMapper();
			map.put("list", obj.writeValueAsString(list));
			map.put("count", count);
			str.append(obj.writeValueAsString(map));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return str.toString();
	}
	
	@RequestMapping(value = "/commit", method = RequestMethod.POST)
	@ResponseBody
	public String commit(InfomationTypeVO vo) {
		
		return service.commit(vo);
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	@ResponseBody
	public String delete(InfomationTypeVO vo) {
		if(vo.getDid().indexOf(",") != -1) {
			vo.setDid_(vo.getDid().split(","));
			vo.setDid(null);
		}
		return service.delete(vo);
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	@ResponseBody
	public String update(InfomationTypeVO vo) {
		
		return service.update(vo);
	}
	


}
