package com.sxt.commons;

import java.util.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;

/**
 * 
 *	д������ 
 * 
 * 
 * 
 * */
public class CIOTest04 {
		public static void main(String[] args) throws IOException {
				// д���ļ�
				FileUtils.write(new File("abbaa.txt"), "aaaavvvvbbbbbb\r\n", "UTF-8", true);
				FileUtils.writeStringToFile(new File("abbaa.txt"), "aaaavvvvbbbbbb\r\n", "UTF-8", true);
				FileUtils.writeByteArrayToFile(new File("abbaa.txt"), "aaaavvvvbbbbbb\r\n".getBytes("UTF-8"), true);
				
				// д�����б�
				List<String> datas = new ArrayList<String>();
				
				datas.add("123");
				datas.add("bbb");
				datas.add("ccc111");
				
				FileUtils.writeLines(new File("abbaa.txt"), datas, ".....", true);
		}
}