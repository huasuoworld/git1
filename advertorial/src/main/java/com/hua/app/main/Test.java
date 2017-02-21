package com.hua.app.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

import org.springframework.web.filter.DelegatingFilterProxy;
import org.springframework.web.util.Log4jConfigListener;

public class Test {
	
	 public static void main(String[] args) {
		
		 getFileNameDesc();
	 }
	  
	 public static void write() {
			StringBuffer sbStr = new StringBuffer();
			Date date = new Date();
			DateFormat format2 = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss"); 
			
			File file = new File(new StringBuffer("C:/Users/Administrator/Desktop/").append(format2.format(date)).append(".data").toString());
			
			sbStr.append("test");
			try {
				//FileOutputStream fos = new FileOutputStream(file);
				if(!file.exists()) {
					file.createNewFile();
				}
				
				//fos.write(sbStr.toString().getBytes("UTF-8"));
			} catch (Exception e) {
				e.printStackTrace();
			}
	 }
	 
	 public static void read() {
		 File file = new File("C:/Users/Administrator/Desktop/test.data");
		 BufferedReader reader = null;
		 try {
			 reader = new BufferedReader(new FileReader(file));
			 String tempString = null;
			 while((tempString = reader.readLine()) != null) {
				 System.out.println(tempString);
			 }
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
		}
	 }
	 
	 public static void getFileNameDesc() {
		 File path = new File("/data");
		//�г���Ŀ¼�������ļ����ļ���
		File[] files = path.listFiles();
		//�����ļ�����޸����ڵ�������
		Arrays.sort(files, new Comparator<File>() {
		   public int compare(File file1, File file2) {
		      return (int)(file2.lastModified()-file1.lastModified());
		   }
		});
		//ȡ����һ��(�������޸ĵ�)�ļ�����ӡ�ļ���
		System.out.println(files[0].getName());
	 }

}
