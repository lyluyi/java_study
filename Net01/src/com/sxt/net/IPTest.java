package com.sxt.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class IPTest {
		public static void main(String[] args) throws UnknownHostException {
				// ʹ��getLocalHost��������InetAddress����
				InetAddress addr = InetAddress.getLocalHost();
				
				System.out.println(addr.getHostAddress()); // 172.30.41.175
				System.out.println(addr.getHostName()); // USER-20180331MC
		}

}