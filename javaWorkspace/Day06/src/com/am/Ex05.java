package com.am;

public class Ex05 {

	public static void main(String[] args) {
		// 배열
		// 자료형[] 변수명=new 자료형[갯수];
		// 변수명[index] -> 호출 방법
		// 자료형이 동일한 다중의 값을 갯수만큼 담을 수 있다
		// 값을 담을 때 해당 index 누락시 자료형의 디폴트값을 갖음
		// index는
		// 		0부터 시작
		// 		연속된 숫자
		// 		마지막 index == 갯수-1
//		int[] a=new int[4];
//		a[0]=2;
//		a[1]=4;
//		a[2]=6;
//		a[3]=8;
//		int[] a=new int[4] {0,2,4,8};
//		int[] a=new int[] {2,4,6,8};
		int[] a={2,4,6,8}; // 사용하지 말 것!
		
//		for(int i=0; i<4; i++) {
//			a[i]=(i+1)*2;
//		}
		
//		System.out.println(a.length);
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
