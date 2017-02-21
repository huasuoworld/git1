package com.hua.app.data;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.map.ObjectMapper;

import com.hua.app.vo.AdminListVO;

public class Test {

	public static void main(String[] args) {
		String did = "11,12";
		String[] dids = did.split(",");
		for(String abc : dids) {
			System.out.println(abc);
		}
	}

}
