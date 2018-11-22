package com.sxt.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

/**
 * �������̣�
 * 
  *   ���ն�
 *   
 * 	1��ʹ��DatagramSocket  ָ���˿� �������ն�
 * 
 * 	׼������ һ��Ҫת���ֽ�����
 * 
 *  2�� ׼������ ��װ��DatagramPacket����  ��Ҫָ��Ŀ�ĵ�
 *  
 *  3������ʽ���ܰ���receive  ��DatagramPacket p��
 *  
 * 	 ���Ͱ��� send
 *  
 *  4����������
 *  
 *  byte[] getData()
 *         get Length()
 * 
 * @author Administrator
 *
 */

public class UdpServer {
		public static void main(String[] args) throws IOException {
				System.out.println("���ͷ������С���");
				
				// 1�� ʹ��DatagramSocket ָ���˿� �������Ͷ�
				DatagramSocket client = new DatagramSocket();
				
				// 2�� ׼������ ����ת��Ϊ�ֽ�����
				String data = "dsadsa������";
				
				byte[] datas = data.getBytes();
				
				// 3�� ��װ��DatagramPacket���� ��Ҫָ��Ŀ�ĵ�
				DatagramPacket packet = new DatagramPacket(datas, 0, datas.length, new InetSocketAddress("localhost", 9999));
				
				// 4�� ���Ͱ���send ��DatagramPacket p��
				client.send(packet);
				
				// 5�� �ͷ���Դ
				client.close();
				
				
		}
}