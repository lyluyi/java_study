package com.sxt.thread;

import java.net.URL;

public class TDownLoader extends Thread {
		private String url; // Զ��·��
		private String name;  // ����·��
		
		
		
		public TDownLoader(String url, String name) {
				super();
				this.url = url;
				this.name = name;
		}



		@Override
		public void run () {
				WebDownLoader wd = new WebDownLoader();
				wd.downlaod(url, name);
		}
		
		public static void main(String[] args) {
				TDownLoader td1 = new TDownLoader("http://news.chinaxinge.com/baike/photo/big/201606/20160621190339.jpg", "1.jpg");
				TDownLoader td2 = new TDownLoader("http://news.chinaxinge.com/baike/bjtx/bj09.jpg", "2.jpg");
				TDownLoader td3 = new TDownLoader("http://news2.chinaxinge.com/baike/photo/small/201811/20181109131340.jpg", "3.jpg");
				
				// ���������߳�
				td1.start(); // �Լ����run����ִ��  ����ֱ�ӵ���run���������ǿ������߳� ֻ�Ƿ�����ִ��
				td2.start();
				td3.start();
		}
}