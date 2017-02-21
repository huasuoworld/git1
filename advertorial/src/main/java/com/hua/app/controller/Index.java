package com.hua.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/index")
public class Index {
	
	@RequestMapping(value="/page",method=RequestMethod.GET) 
	public String index() {
		return "page";
	}
	
	public static void main(String[] args) {
		for(int i = 0; i < 102; i=i+30) {
			System.out.println(i/30);
		}
		System.out.println("**********"+120%20);
		System.out.println("----"+(121%20 != 0 ? 121/20+1 : 121/20));
	}
}
