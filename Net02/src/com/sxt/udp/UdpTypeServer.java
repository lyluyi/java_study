package com.sxt.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

/**
 * 基本流程：
 * 
  *   基本类型 ：接收端
 *   
 * 	1、使用DatagramSocket  指定端口 创建接收端
 * 
 * 
 * 
 *  2、 准备容器 封装成DatagramPacket包裹  需要指定目的地
 *  
 *  3、阻塞式接受包裹receive  （DatagramPacket p）
 *  
 * 	 	发送包裹 send
 *  
 *  4、分析数据  将对应字节数组还原为对应的类型即可
 *  
 *  byte[] getData()
 *         get Length()
 * 
 * @author Administrator
 *
 */

public class UdpTypeServer {
		public static void main(String[] args) throws IOException {
				System.out.println("发送方启动中……");
				
				// 1、 使用DatagramSocket 指定端口 创建发送端
				DatagramSocket client = new DatagramSocket();
				
				// 2、 准备数据 并且转化为字节数组
				String data = "dsadsa哈哈哈";
				
				byte[] datas = data.getBytes();
				
				// 3、 封装成DatagramPacket包裹 需要指定目的地
				DatagramPacket packet = new DatagramPacket(datas, 0, datas.length, new InetSocketAddress("localhost", 9999));
				
				// 4、 发送包裹send （DatagramPacket p）
				client.send(packet);
				
				// 5、 释放资源
				client.close();
				
				
		}
}
