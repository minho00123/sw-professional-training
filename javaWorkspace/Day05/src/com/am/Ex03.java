package com.am;

public class Ex03 {

	public static void main(String[] args) {
		// 조건문
		// 1. if문 - 만약 조건이 참이라면
		if(true) {System.out.println("참이라 실행");}
		if(true){}else if(true){}else if(true){}else{} // else if, else는 선택
		// 2. switch문 - 값과 같은 case는 
		switch (2) {
			case 3: System.out.println(3);break;
			case 2: System.out.println(2);break;
			case 1: System.out.println(1);break;
			default: System.out.println("몰라");break; // default 필수 아님. 선택임
		}
	}

}
