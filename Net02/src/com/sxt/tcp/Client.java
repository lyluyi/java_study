package com.sxt.tcp;

import java.io.IOException;
import java.net.*;
import java.net.Socket;

/**
 *
  *   熟悉流程
  *   
  *   创建客户端
  *   1、建立连接 使用Socket创建客户端 + 服务的地址和端口
  *   2、操作： 输入 输出流操作
  *   3、释放资源
 * 
 * @author Administrator
 *
 */

public class Client {
		public static void main(String[] args) throws IOException {
				//1、建立连接 使用Socket创建客户端 + 服务的地址和端口
				
				Socket client = new Socket("localhost", 8888);
				
				// 2、操作： 输入 输出流操作
				
				// 3、释放资源
				
				
		}
		


}
