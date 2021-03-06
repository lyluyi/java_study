package com.sxt.thread;

import java.net.URL;

public class TDownLoader extends Thread {
		private String url; // 远程路径
		private String name;  // 存贮路径
		
		
		
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
				
				// 启动三个线程
				td1.start(); // 自己会调run方法执行  但是直接调用run方法并不是开启多线程 只是方法的执行
				td2.start();
				td3.start();
		}
}
