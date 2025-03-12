package com.am;

public class Ex01 {
	Ex01 me2; // Ex01 me2=null
	public static String msg=null; // String은 클래스이기 때문에 디폴트값이 null이다.
	public static String msg2=""; // msg2=""는 객체가 있지만, item(문자)가 없다. msg=null은 객체가 없다.(=주소값이 없다)
	
	public Ex01() {
//		System.out.println("객체 생성");
//		System.out.print("매개변수 ");
//		System.out.println("없음");
		// this()는 생성자 맨 상단에 위치
		// System.out.println("객체 생성 이전"); // 오류 발생!
		this("없음");
		System.out.println(this);
	}
	public Ex01(int su) {
//		System.out.println("객체 생성");
//		System.out.print("매개변수 ");
//		System.out.println("숫자:"+su);
		// System.out.println("객체 생성 이전"); // 오류 발생!
		this("숫자:"+su);
		System.out.println("이후 일 진행");
	}
	public Ex01(String msg) {
		// this(); // 오류 발생! this()를 호출할 때는 적어도 생성자 중 하나는 this()가 없어야 한다.
		System.out.println("객체가 생성되는 생성자");
		System.out.println("객체 생성");
		System.out.print("매개변수 ");
		System.out.println(msg);
	}

	public static void main(String[] args) {
		// char ch='\u0000'; // null
		Ex01 me=null; // 참조 변수의 디폴트 값은 null이다. char의 디폴트 값인 null과 다른 값이다. char의 null은 문자, 참조 변수의 null은 키워드 null이다.
		me=new Ex01("java"); // 참조변수의 타입은 클래스이다.
		me=new Ex01(1111);
		me=new Ex01();
		// msg.length(); // 오류 발생!
		// msg2.length(); // 오류 발생 X
	}

}
