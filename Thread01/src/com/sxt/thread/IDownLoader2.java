package com.sxt.thread;

import java.net.URL;

public class IDownLoader2 implements Runnable {
		private String url; // Զ��·��
		private String name;  // ����·��
		
		
		
		public IDownLoader2(String url, String name) {
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
				IDownLoader2 td1 = new IDownLoader2("http://news.chinaxinge.com/baike/photo/big/201606/20160621190339.jpg", "1.jpg");
				IDownLoader2 td2 = new IDownLoader2("http://news.chinaxinge.com/baike/bjtx/bj09.jpg", "2.jpg");
				IDownLoader2 td3 = new IDownLoader2("http://news2.chinaxinge.com/baike/photo/small/201811/20181109131340.jpg", "3.jpg");
				
				// ���������߳�
				new Thread(td1).start(); // ����ʹ�ýӿ� ���ⵥ�̳�
				new Thread(td2).start();
				new Thread(td3).start();
		}
}
