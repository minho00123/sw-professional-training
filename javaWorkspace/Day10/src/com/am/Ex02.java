package com.am;

public class Ex02 {

	public static void main(String[] args) {
		// return (생성자 메서드) - // 메모리 기준으로 호출한 쪽으로 돌아가는 것
		// break (반복문, switch문) - 반복과 조건(switch에 한)의 탈출
		// continue (반복문) - continue이하를 무시하고 처음으로 돌아감
		
		System.out.println("시작");
		func01();
		System.out.println("종료");
//		return;
	}
	public static void func01() {
		for(int i=0; i<10; i++) {
			if(i>5)break;
			switch ('a') {case 1:break;}
			System.out.println("i="+i);
		}
		switch ('a') {
			case 1:
				
				break;
			case 2:
				
				break;
			default:
				break;
		}
		System.out.println("일단종료");
//		return;
	}
	public static void func02() {
		for(int i=0; i<10; i++) {
			if(i>5)return;
			System.out.println("i="+i);
		}
		System.out.println("일단종료");
//		return;
	}
	public static void func03() {
		for(int i=0; i<10; i++) {
			if(i>5)continue;
			System.out.println("i="+i);
		}
//		return;
	}

}
