package com.sxt.tcp;

import java.io.IOException;
import java.net.*;
import java.net.Socket;

/**
 *
  *   ��Ϥ����
  *   
  *   ����������
  *   1��ָ���˿� ʹ��ServerSocket����������
  *   2������ʽ�ȴ�����accept
  *   3�������� ���� ���������
  *   4���ͷ���Դ
 * 
 * @author Administrator
 *
 */

public class Server {
		public static void main(String[] args) throws IOException {
//			*   1��ָ���˿� ʹ��ServerSocket����������
				 
				ServerSocket server = new ServerSocket(8888);
				
//			  *   2������ʽ�ȴ�����accept
				
				Socket client = server.accept();
				System.out.println("һ���ͻ��˽���������");
				
//			  *   3�������� ���� ���������
				
				
//			  *   4���ͷ���Դ
		}
		


}