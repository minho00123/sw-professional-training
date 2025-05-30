package com.pm;

import java.util.Arrays;

public class Ex06 {

	public static void main(String[] args) {
		// 로또 번호 생성기(ver 0.1.0)
		// 1. 1 ~ 45 랜덤숫자 생성
		int su=0;
		while(true) {
			su=(int)(Math.random()*1000); // 0~99.99999
			if(su>0&&su<46) break;
		}
		// 2. 값의 치환
		int a=1111;
		int b=2222;
		int temp=a;
		a=b;
		b=temp;
		System.out.println(a==2222&&b==1111);
		// 3. sort 알고리즘
		int[] arr= {3,2,1};
		int[] temp2= {0,0,0};

//		arr[0]=temp2[0];
//		if(arr[0]>temp2[1])arr[0]=temp2[1];
//		if(arr[0]>temp2[1])arr[0]=temp2[2];
		System.out.println(arr[0]);

//		arr[1]=temp2[1];
//		if(arr[1]>temp2[2])arr[1]=temp2[2];
		System.out.println(arr[1]);
		
//		arr[2]=temp2[2];
		System.out.println(arr[2]);
		
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("내 코드");
		System.out.println("----------------------------------------------------------------------------");

		System.out.println("로또 번호 생성기(ver 0.1.0)");
		
		int[] winningNumber = new int[6];
		int count = 0;

		while (count < 6) {		
			int number = (int) (Math.random() * 45) + 1;
			boolean isDuplicated = false;

			for (int i = 0; i < count; i++) {
				if (number == winningNumber[i]) {
					isDuplicated = true;
					break;
				}
			}
			
			if (!isDuplicated) {
				winningNumber[count++] = number;	
			}
		}
		
		Arrays.sort(winningNumber);
		
		for (int i = 0; i < 6; i++) {
			System.out.print(winningNumber[i] + " ");
		}
		System.out.println();
		
		System.out.println("----------------------------------------------------------------------------");
	
		int[] arr2 = new int[46];
		for (int i = 1; i <= 45; i++) {
			arr2[i] = i;
		}
		
		int[] numbers = new int[6];
		int count2 = 0;
		while (count2 < 6) {
			int randomNumber = (int) (Math.random() * 45) + 1;
			if (arr2[randomNumber] == 0) {
				continue;
			} else {
				numbers[count2] = arr2[randomNumber];
				arr2[randomNumber] = 0;
				count2++;
			}
		}
		
		Arrays.sort(numbers);
		
		for (int i = 0; i < 6; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
	}

}
