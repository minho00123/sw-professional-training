package com.am;

public class Ex01 {
	// 내부클래스
	// 클래스의 구성요소로 갖는 클래스
	// 종류
	// 1. static inner class, 스태틱 클래스
	// 2. non-static inner class, 인스턴스 [내부]클래스
	// 3. local class, 지역클래스
	// 4. anonymous class, 익명클래스
	
	// 1. 스태틱 클래스
	static class Inner01{}
	// 2. 인스턴스 클래스
	class Inner02{}
	
	public void func01() {
		// 3. 지역 클래스
		class Inner03{}
	}
	
	public static void main(String[] args) {
		
	}

}
