package com.am;

/*
 * 클래스 구성요소
 * 
 * 1. 메서드
 * 2. 필드
 * 3. 생성자
 * 	모든 클래스는 생성자가 존재함
 * 	이름이 반드시 클래스명
 * 	return 값이 없고, static일 수가 없다.
 * 	오버로드 통해 다중 생성자가 가능
 * 	주요기능 - 객체 생성시점에 하고자 하는 일 명세(필드값의 초기화)
 * 	public 클래스명(매개변수..){코드;}
 * 
 * 
 */

public class Ex01 {
	public static final int a=2222; // 전역변수 - final 상수형 변수
//	public int a=3333; // 전역끼리는 겹칠 수가 없다.
	public int b=3333;
	public final int c;
	
	public Ex01() {
		// default 생성자
		// 코드상 클래스에 생성자가 없을 경우
		// 컴파일러는 디폴트 생성자를 자동생성
		c=4444;
	}
	
	public Ex01(int a) {
		c=a;
		return;
	}
	
	public static void main(String[] args) {
		/*
		 * final int a; // 지역변수 - final: 상수형 변수를 만들 때 사용한다.
		 * a=1111;
		 * // a=2222; // 값의 변경을 불허
		 * System.out.println("a="+a);
		 * func02(3333);
		 * func02(4444);
		 */
		
		int a = 1111;
		System.out.println("a="+a); // 1111
		System.out.println("com.am.Ex01.a="+com.am.Ex01.a); // 2222
		
		Ex01 me;
		me=new Ex01();
		System.out.println("c="+me.c);
	}
	
	public static void func02(final int c) {
		/*
		 * // c++; // 수정 불가능
		 * System.out.println("c="+c);
		 */
	}

	public static void func01() {
		/* 
		 * System.out.println(b);
		 * // b++;
		 * // a++;
		 */
	}

}
