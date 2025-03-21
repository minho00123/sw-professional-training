package com.pm;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// 주민번호 체크기(ver 0.9.0)
		// 주민번호> 000000-0000000
		// 당신은 00세 0성입니다.
		
		System.out.println("주민번호 체크기(ver 0.9.0)");
		Scanner sc = new Scanner(System.in);
	
		while (true) {
			System.out.print("주민번호> ");
			String input = sc.nextLine();
			String[] splittedInput = input.split("-");
			
			if (input.length() != 14) {
				System.out.println("올바른 번호를 입력하세요. Ex. 000000-0000000");
			} else if (splittedInput[0].length() != 6) {
				System.out.println("올바른 번호를 입력하세요. Ex. 000000-0000000");
			} else if (splittedInput[1].length() != 7) {
				System.out.println("올바른 번호를 입력하세요. Ex. 000000-0000000");
			} else {
				char gender = '남';
				char genderNumber = splittedInput[1].charAt(0);
				
				if (genderNumber == '2' || genderNumber == '4') {
					gender = '여';
				}
				
				int year = Integer.valueOf(splittedInput[0].substring(0, 2));
				int age = genderNumber == '3' || genderNumber == '4' ? 2025 - (2000 + year) + 1 : 2025 - (1900 + year) + 1;
				
				System.out.println("당신은 " + age + "세 " + gender + "성입니다.");
				
				return;
			}
			
		}
		
		
		// -----------------------------------------------------------------------------------------------------------------------------
		// 강사님 코드
		
		int age=0;
		final char[] gender= {'남','여'};
		int genderIdx=0;
		System.out.println("주민번호 체크기(ver 0.9.0)");
		String input=null;
		while(true) {
			System.out.print("주민번호>");
			input=sc.nextLine();
			String[] arr=input.trim().split("-");
			// 중간에 -이 들어가는지
			if(arr.length!=1)continue;
			// - 이전 6자리
			if(arr[0].length()!=6)continue;
			// - 다음 7자리
			if(arr[1].length()!=7)continue;
			// 숫자로만 구성
			final boolean[] arr2= {false, false};
			for(int i=0; i<arr.length; i++) {
				char[] temp=arr[i].toCharArray();
				for(int j=0; j<temp.length; j++) {
					if(!Character.isDigit(temp[j]))arr2[i]=true;
				}
			}
			if(arr2[0]||arr2[1])continue;
			
			if(arr[1].charAt(0)=='2'||arr[1].charAt(0)=='4')genderIdx=1;
			int year=Integer.parseInt(19+arr[0].substring(0,2));
			age=2025-year+1;
			if(arr[1].charAt(0)=='3'||arr[1].charAt(0)=='4')age-=100;
			
			break;
		}
		System.out.println("당신은 "+age+"세 "+gender[genderIdx]+"성입니다");

	}

}
