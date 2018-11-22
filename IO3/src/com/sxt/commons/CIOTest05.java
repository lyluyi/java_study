package com.sxt.commons;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

// �ļ�copy

public class CIOTest05 {
		public static void main(String[] args) throws IOException {
				
				// �����ļ�
				FileUtils.copyFile(new File("aaa.txt"), new File("abc-copy-aaa.txt"));
				
				// �����ļ���Ŀ¼��
				FileUtils.copyFileToDirectory(new File("aaa.txt"), new File("src"));
				
				// ����Ŀ¼��Ŀ¼
				FileUtils.copyDirectoryToDirectory(new File("src"), new File("lib"));
				
				// ����Ŀ¼
				FileUtils.copyDirectory(new File("src"), new File("lib"));
				
				// ����URL ����
				String src = "https://i10.hoopchina.com.cn/hupuapp/bbs/129985693435159/thread_129985693435159_20180821091515_s_145746_w_640_h_833_94179.jpg?x-oss-process=image/resize,w_800/format,webp";
				FileUtils.copyURLToFile(new URL(src), new File("1.jpg"));
				
				// �����ַ���
				String datas = IOUtils.toString(new URL("http://www.163.com"), "GBK");
				System.out.println(datas);
		}
}
