package com.sxt.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

/**
  *   ��ν���  ���Ͷ�
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
 * 
 * @author Administrator
 *
 */

public class UdpTalkClient {
		public static void main(String[] args) throws IOException {
				System.out.println("���շ������С���");
				
				// 1��ʹ��DatagramSocket ָ���˿� �������ն�
				DatagramSocket server = new DatagramSocket(9999);
				
				// Address already in use: Cannot bind ͬһ��Э���� �˿ڲ������ظ� 
				
				while (true) {
						// 2��׼������ ��װ��DatagramPacket����
						byte[] container = new byte[1024*60];
						DatagramPacket packet = new DatagramPacket(container, 0, container.length);
						
						// 3������ʽ���հ��� receive ��DatagramPacket p��
						server.receive(packet); // ����ʽ
						
						// 4�� ��������
						byte[] datas = packet.getData();
						
						int len = packet.getLength();
						
						String data = new String(datas, 0, datas.length);
						System.out.println(data);
						
						if (data.equals("bye")) {
								break;
						}
						
				}
				
			
				// 5�� �ͷ���Դ
				server.close();
				
				
				
				
				
		}
}