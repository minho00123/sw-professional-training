package com.am;

/*
 * 접근제한자 class 클래스명 {
 * 		접근제한자 int su;
 * 		접근제한자 int su2;
 * 
 * 		public 클래스이름(){}
 * 		
 * 		public static void main(String[] args){}
 * }
 */

public class Ex01 {
	public static int su1=1111;
	static int su2=2222;
	private static int su3=3333;

	public static void func01() {} // public
	static void func02() {} // default
	private static void func03() {} // private

	public static void main(String[] args) {
		// 접근제한자
		// 접근 제한
		// (필드,메서드)
		// 1. public - 어디서든 접근 허용
		// 2. default - 동일 패키지 내에서만 접근 허용 (하위 디렉토리도 안됨)
		// 3. private - 선언된 클래스 내부에서만 접근 허용
		// (클래스)
		// - 필드와 메서드의 접근제한자에 영향을 준다.
		// - 소스코드 문서상 public 클래스는 1개 이하여야 한다.
		// 1. public - 어디서든 접근 허용
		// 2. default - 동일 패키지 내에서만 접근 허용 (하위 디렉토리도 안됨)
		// 3. private - 없음
		// (생성자)
		// 1. public - 어디서든 접근 허용
		// 2. default - 동일 패키지 내에서만 접근 허용 (하위 디렉토리도 안됨)
		// 3. private - 선언된 클래스 내부에서만 접근 허용 (객체 생성 불허)
		// public > protected >= default > private
		com.am.Ex01.func01();
		com.am.Ex01.func02();
		com.am.Ex01.func03();
		System.out.println(com.am.Ex01.su1);
		System.out.println(com.am.Ex01.su2);
		System.out.println(com.am.Ex01.su3);
		
		System.out.println(com.am.Ex03.su3);
//		System.out.println(com.am.Ex04.su4);
		
		com.am.Ex04 ex04;
		ex04=new com.am.Ex04(1111);
//		ex04=new com.am.Ex04(true);
//		ex04=new com.am.Ex04("");
		
		com.am.Ex04 ex042;
		ex042=new com.am.Ex04(1111);
		System.out.println(ex04==ex042);
		
		Ex06 ex06=Ex06.obj;
		Ex06 ex062=Ex06.obj;
		System.out.println(ex06==ex062);
//		System.out.println(ex06.su6);
//		System.out.println(ex06.su6);
//		ex06=Ex06.obj;
//		System.out.println(ex06.su6);
//		ex06=Ex06.obj;
//		System.out.println(ex06.su6);
		// 위 코드는 몇 번을 반복해도 동일한 객체를 사용한다.
	}

}
