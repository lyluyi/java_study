package com.sxt.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

// ����ԭ��

public class SpiderTest01 {

		public static void main(String[] args) throws IOException {
				// ��ȡURL
				URL url = new URL("https://www.jd.com");
				
				// ������Դ
				InputStream is = url.openStream();
				BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
				
				String msg = null;
				
				while (null!=(msg=br.readLine())) {
						System.out.println(msg);
				}
				br.close();
				
				// ����
				
				
		}
}