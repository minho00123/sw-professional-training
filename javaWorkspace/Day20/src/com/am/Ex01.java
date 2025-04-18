package com.am;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ex01 {

	public static void main(String[] args) {
		java.net.InetAddress[] addrs;
//		byte[] arr1 = { (byte) 172, 30, 1, 100 }; // 공인 아이피
		byte[] arr1 = { 127, 0, 0, 1 }; // 자신을 나타내는 아이피
		try {
//			addr = InetAddress.getByName("google.com");
//			addr = InetAddress.getByName("localhost");
//			addr = InetAddress.getByAddress(arr1);

//			System.out.println(addr.getHostName());
//			System.out.println(addr.getHostAddress());

			addrs = InetAddress.getAllByName("naver.com");

			for (int i = 0; i < addrs.length; i++) {
				InetAddress addr = addrs[i];
				System.out.println(addr.getHostName());
				System.out.println(addr.getHostAddress());
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
