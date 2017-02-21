package com.hua.app.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Word {

	public static String getValue(String key) {
		Properties props = new Properties();
		InputStream in = null;
		try {
			in =  new FileInputStream(Word.class.getClassLoader().getResource("").getPath()+"conf/word.properties");
			props.load(in);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return props.getProperty(key);
	}
	
	public static void main(String[] args) {
		System.out.println(Word.getValue("hello"));
	}
}
