package com.am;
// 이 문서상의 내용은 패키지 위에 있다.


public class Ex02 {
	// 클래스의 구성요소
	// 메서드 - 모든 일은 메서드 안에서 이루어진다.
	
	public static void main(String[] args) {
		System.out.print("출력");
		System.out.println("출력");
		// 변수의 사용은 반드시 선언과 초기화가 이루어져야만 사용가능
		int a;  		// 변수 선언(메모리를 어떻게 사용할지)
						// "자료형 변수명;" 형태로 이루어지는데 자료형은 메모리 크기를 결정 짓는 요소이다.
		a=1111; 		// 변수 초기화(메모리 최초 값의 대입)
		a=2222;
		a=(int)3.14;	// 강제형변환
		
		double b=3.14;  // 선언과 초기화가 동시에 이루어질 수 있음
		b=1.0;
		b=2;			// 자동형변환 (2(int) -> 2.0(double))
		
		boolean boo;
		boo=true;
		
		char ch;		// 약속패턴 메모리상 숫자, 출력은 문자로
		ch='A';			// 문자는 숫자로 되어있다. 이 숫자가 어떻게 문자가 될지는 최종적으로 프로그램이 정한다.
		ch='a'+1;		// ch=97+1; -> ch=98; -> ch='b';
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(boo);
		System.out.println(ch);
		
		int x=5,y=2;	// 서로 다른 자료형끼리는 연산이 불가능. 다를 경우 서로 자료형을 맞춘 후에 연산
		// System.out.println((x+y)*x/y-x);
		
		x++; // x=x+1; 사칙연산보다 더 우선순위에 있다. 실제는 비트 연산을 수행
		x--; // x=x-1;
		
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y); // 나머지 연산자
	}

	public static void func01() {
		System.out.println("call...");
	}

}
