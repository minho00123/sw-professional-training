/*
	class 클래스명{요소들}
	
	- 한 문서에서 여러 개의 클래스를 정의할 수 있지만 하지 말 것.
	- 클래스 이름으로 키워드는 피할 것.
	
	package: 환경에 대한 정의이다.(문서에 대한 정의)
	
*/

// package com;
package com.naver;

class Ex19{
	public static void main(String[] args) {
		// String me = "hello"; // 에러!
		
		Ex16.gugudan(2);
	}
}
// class Ex199{}
// class String{}

class Ex16 {
	public static void gugudan(int a) {
		System.out.println("난 구구단 아니지롱~~");
	}
}