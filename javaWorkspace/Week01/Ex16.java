/*
메서드(클래스 메서드)
public static 리턴타입(void;return타입 없는 경우) 메서드명(매개변수){실행문;[return;]}

1. 클래스의 구성요소 - 반드시 클래스 안에 존재
2. 생성과 호출이 필요
3. 메서드명의 중복을 불가()
4. 메서드명의 명명규칙은 네이밍 규칙과 동일(첫글자를 소문자로)
5. 매개변수의 의의 - 호출시 값을 전달(단, 반드시 일치)
6. 모든 메서드는 리턴이 존재(생략시, 메서드 끝에 자동으로 생성)
7. 메서드는 리턴 값을 갖을 수 있음. 이 경우 void 대신 자료형 명시

메서드 사용 이유
- 메서드는 반복적인 코드를 처리할 때 사용한다. 반복할 때 비 규칙적인 규칙이 있을 경우 사용하기 좋다.

메서드 오버로드
- 메서드의 이름은 원칙적으로 중복 불가하나 특수한 상황시 메서드명 중복을 일부 허용함(유무,갯수,타입)
*/

class Ex16 {

	public static void main(String[] args) { // main 메서드
		System.out.println("before...");
		func01(3);
		func02();
		int su = func03();
		
		int a = 1;
		for (int i = 0; i < 9; i++) {
			gugudan(a++);
		}
		System.out.println("After..." + su);
	} // main end
	
	public static void func01(int a) {
		for (int i = 0; i < a; i++) {
			System.out.println("func01 실행");
		}
	} // func01 end
	
	public static void func02() {
		System.out.println("func02 실행");
		int su = 3;
		if (su > 0) {
			return;
		}
		func03();
	} // func02 end
	
	public static int func03() {
		System.out.println("func03 실행");
		return 1234;
	} // func03 end

	// 메서드 오버로드
	public static void func04(){}
	// 1. 매개변수 유무를 통한 중복허용
	public static void func04(int a){}
	// 2. 매개변수의 서로 다른 갯수 통한 중복허용
	public static void func04(int a, int b){}
	// 3. 매개변수 타입을 달리하여 중복허용
	public static void func04(String a){}
	
	public static void gugudan(int a) {
		System.out.println("2x"+a+"\t"+"3x"+a);
	}
} // class end