package com.sxt.commons;

import java.io.File;
import java.util.Collection;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.DirectoryFileFilter;
import org.apache.commons.io.filefilter.EmptyFileFilter;
import org.apache.commons.io.filefilter.FileFileFilter;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.apache.commons.io.filefilter.SuffixFileFilter;

/**
 * 
  * �г�  ����ڵ�
 * 
 * 
 * 
 * */
public class CIOTest02 {
		public static void main(String[] args) {
			Collection<File> files = FileUtils.listFiles(new File("D:/workspace/IO3"), EmptyFileFilter.NOT_EMPTY, null);
			for (File file : files) {
					System.out.println(file.getAbsolutePath());
			}
/**
 * 
 * EmptyFileFilter.NOT_EMPTY  ��Ϊ�յ��ļ�
 * 
 * DirectoryFileFilter.INSTANCE  ������һ���Ĳ���
 * 
 * */			
//			 files = FileUtils.listFiles(new File("D:/workspace/IO3"), EmptyFileFilter.NOT_EMPTY, DirectoryFileFilter.INSTANCE);
			files = FileUtils.listFiles(new File("D:/workspace/IO3"), FileFilterUtils.or(new SuffixFileFilter("java"), new SuffixFileFilter("class")), DirectoryFileFilter.INSTANCE);
			 for (File file : files) {
						System.out.println(file.getAbsolutePath());
			 }
			 
		}
}