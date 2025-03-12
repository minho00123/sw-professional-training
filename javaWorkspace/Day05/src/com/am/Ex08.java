package com.am;

public class Ex08 {
	// 
	// 클래스 메서드, static 메서드, 함수...
	// static 영역 - 패키지 경로.클래스명.메서드명으로 존재
	// public static 리턴타입(void) 메서드명(매개변수...){구현;}
	//
	// 인스턴스 메서드, non-static 메서드, 멤버 메서드
	// 힙 영역 - 객체로 존재
	// public 리턴타입(void) 메서드명(매개변수...){구현;}
	
	
	// static -> static				[패키지 경로].[클래스명].func01()
	// static -> non-static			참조변수.func01() *기본 자료형을 제외한 모든 변수를 참조변수라고 한다.
	// non-static -> static 		[패키지 경로].[클래스명].func01()
	// non-static -> non-static		[this].func01()
	
	public static void main(String[] args) {
		// 메서드 - 함수
		System.out.println(com.am.Ex07.func02());
		System.out.println(Ex07.func02());
		System.out.println(com.am.Ex08.func02());
		System.out.println(Ex08.func02());
		System.out.println(func02());
		System.out.println("------------------------------------------");
		com.am.Ex08 me = new Ex08();
		System.out.println(me.func03());
		me.func04(me);
	}
	
	public static String func02() {
		return "난 아니지롱~~~";
	}
	
	public String func03() {
		return "non-static";
	}
	
	public void func04(Ex08 me) {
		com.am.Ex08 me2 = new Ex08();
		// System.out.println(this.func03());
		System.out.println(me==this);
		System.out.println(me2==this); // 레퍼런스 비교 (= 주소값 비교), 레퍼런스 비교시 같다면 동일한 객체를 가리키고 있다.
	}

}
