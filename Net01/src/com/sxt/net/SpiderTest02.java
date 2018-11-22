package com.sxt.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

// 爬虫原理 + 模拟浏览器

public class SpiderTest02 {

		public static void main(String[] args) throws IOException {
				// 获取URL
				URL url = new URL("https://www.dianping.com");
				
				// 设置Http协议 
				HttpURLConnection conn = (HttpURLConnection) url.openConnection();
				
				conn.setRequestMethod("GET"); // 设置请求方式
				
				// 模拟成浏览器
				conn.setRequestProperty("User-Agent","Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/68.0.3440.106 Safari/537.36");
				
				// 下载资源
				BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
				
				String msg = null;
				
				while (null!=(msg=br.readLine())) {
						System.out.println(msg);
				}
				br.close();
				
				// 分析
				
				
		}
}
