package com.pm;

public class Ex01 {

	public static void main(String[] args) {
		com.am.Ex01.func01();
//		com.am.Ex01.func02(); // 패키지가 달라 접근 불허
//		com.am.Ex01.func03();
		System.out.println(com.am.Ex01.su1);
//		System.out.println(com.am.Ex01.su2);
//		System.out.println(com.am.Ex01.su3);
		
		System.out.println(com.am.Ex03.su3);
//		System.out.println(com.am.Ex04.su4); // 패키지가 달라 접근 불허
	}

}
