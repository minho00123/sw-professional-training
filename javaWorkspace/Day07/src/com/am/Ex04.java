package com.am;

public class Ex04 {

	public static void main(String[] args) {
		int[] arr1=new int[] {2,4,6,8};
		
		int[] arr2=null;
		// 배열의 얕은 복사
//		arr2=arr1;
		
		// 배열의 깊은 복사
		arr2=new int[4];
		for(int i=0; i<arr2.length; i++) {
			arr2[i]=arr1[i];
		}
		
//		arr1[1]=3;
		arrPrint(arr1);
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}

	}
	
	public static void arrPrint(int[] arr2) {//int[] arr2=arr1;
		arr2[1]=3;
	}

}
