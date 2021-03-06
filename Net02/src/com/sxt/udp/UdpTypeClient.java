package com.sxt.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

/**
  *  基本类型： 发送端
 *   
 * 	1、使用DatagramSocket  指定端口 创建接收端
 * 
 * 		准备数据 将基本类型转化为字节数组 一定要转成字节数组
 * 
 *  2、 准备容器 封装成DatagramPacket包裹  需要指定目的地
 *  
 *  3、阻塞式接受包裹receive  （DatagramPacket p）
 *  
 * 	 发送包裹 send
 *  
 *  4、分析数据
 *  
 *  byte[] getData()
 *         get Length()
 *         
 * 
 * @author Administrator
 *
 */

public class UdpTypeClient {
		public static void main(String[] args) throws IOException {
				System.out.println("接收方接收中……");
				
				// 1、使用DatagramSocket 指定端口 创建接收端
				DatagramSocket server = new DatagramSocket(9999);
				
				// Address already in use: Cannot bind 同一个协议下 端口不允许重复 
				
				// 2、准备容器 封装成DatagramPacket包裹
				byte[] container = new byte[1024*60];
				DatagramPacket packet = new DatagramPacket(container, 0, container.length);
				
				// 3、阻塞式接收包裹 receive （DatagramPacket p）
				server.receive(packet); // 阻塞式
				
				// 4、 分析数据
				byte[] datas = packet.getData();
				
				int len = packet.getLength();
				System.out.println(new String(datas, 0, datas.length));
				
				// 5、 释放资源
				server.close();
				
				
				
				
				
		}
}
