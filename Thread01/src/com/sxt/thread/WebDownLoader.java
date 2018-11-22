package com.sxt.thread;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;

// 下载图片

public class WebDownLoader {

		public void downlaod(String url, String name) {
				try {
						FileUtils.copyURLToFile(new URL(url), new File(name));
				} catch (MalformedURLException e) {
						e.printStackTrace();
				} catch (IOException e) {
						System.out.println("不合法的URL");
						e.printStackTrace();
				}
		}
}
