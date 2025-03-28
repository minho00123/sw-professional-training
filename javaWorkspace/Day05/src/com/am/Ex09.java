package com.am;

// 클래스의 구성요소
// 1. 메서드(객체의 기능을 담당)
// 2. 변수(객체 속성)
// 전역변수의 역할
// 선언과 초기화가 동시에 존재해야함
// 단, 코드 선언만 이루어질 경우 디폴트값으로 초기화함.
// 2-1 클래스변수, static
// 2-2 멤버필드, non-static

// static -> static				[패키지 경로].[클래스명].변수명
// static -> non-static			참조변수.변수명 *기본 자료형을 제외한 모든 변수를 참조변수라고 한다.
// non-static -> static 		[패키지 경로].[클래스명].변수명
// non-static -> non-static		[this].변수명

public class Ex09 {
	public static int su1=1111;
	public int su2=2222;
	// public static int su3; // 선언과 초기화를 따로 하면 불가능
	// su3=3333;
	public static int su3;

	public static void main(String[] args) {
		System.out.println(com.am.Ex09.su1);
		Ex09 me=new Ex09();
		System.out.println(me.su2);
		System.out.println(com.am.Ex09.su3);
	}

}
