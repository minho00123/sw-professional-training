package com.pm;

public class Ex02 {
	public static boolean isOkay(char[] charArr) {
		if (charArr.length != 14 || charArr[6] != '-') {
			System.out.println("입력포멧을 다시 확인하세요 (000000-0000000)");
			return false;
		}
		
		if (charArr[7] < '1' || charArr[7] > '4') {
			System.out.println("올바른 주민번호를 입력하세요");
			return false;
		}
		
		for (int i = 0; i < 6; i++) {
			if (charArr[i] < '0' || charArr[i] > '9') {
				System.out.println("숫자만 입력하세요");
				return false;
			}
		}

		for (int i = 7; i < 14; i++) {
			if (charArr[i] < '0' || charArr[i] > '9') {
				System.out.println("숫자만 입력하세요");
				return false;
			}
		}

		return true;
	}
	
	public static String changeToKorean(char[] charArr) {
		String korean = "";
		for (int i = 0; i < charArr.length; i++) {
			switch (charArr[i]) {
				case '0':
					korean += "영";
					break;
				case '1':
					korean += "일";
					break;
				case '2':
					korean += "이";
					break;
				case '3':
					korean += "삼";
					break;
				case '4':
					korean += "사";
					break;
				case '5':
					korean += "오";
					break;
				case '6':
					korean += "육";
					break;
				case '7':
					korean += "칠";
					break;
				case '8':
					korean += "팔";
					break;
				case '9':
					korean += "구";
					break;
				case '-':
					korean += "-";
					break;
			}
		}
		
		return korean;
	}

	public static void main(String[] args) {
		// 주민번호 체크기(ver 0.1.0)
		// 주민번호를 입력> 991231-1234567
		// 당신은 27세 남성입니다.
		// 주민번호를 입력> 001231-4234567
		// 당신은 26세 여성입니다.
		////////////////////////////////////////
		// 주민번호를 입력> 9912311234567
		// 입력포멧을 다시 확인하세요 (000000-0000000)
		// 주민번호를 입력> 991231-123456
		// 입력포멧을 다시 확인하세요 (000000-0000000)
		// 주민번호를 입력> a91231-1234567
		// 숫자만 입력하세요
		// 번외 : 한글지원
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.println("-------------------------------------------------------");
		System.out.println("\t\t주민번호 체크기(ver 0.1.0)");
		System.out.println("-------------------------------------------------------");
		
		boolean flag = true;
		
		while (flag) {
			System.out.print("주민번호를 입력> ");
			String input=sc.nextLine();
			char[] charArr = input.toCharArray();

			if (isOkay(charArr)) {
				int yearToday = 2025;
				int userAge = 0;
				int userYear = ((charArr[0] - '0') * 10) + (charArr[1] - '0');
				char userGenderNumber = charArr[7];
				String userGender = "남성";

				if (userYear < 26) {
					userAge = yearToday - (2000 + userYear) + 1;
				} else {
					userAge = yearToday - (1900 + userYear) + 1;
				}
				
				if (userGenderNumber == '2' || userGenderNumber == '4') {
					userGender = "여성";
				}
				
				System.out.println("당신은 " + userAge + "세 " + userGender + "입니다.");
				System.out.println(changeToKorean(charArr));

				flag = false;
			}
		}
		
		teacherCode();
	}

	
	public static void teacherCode() {
		char[] role = {'영','일','이','삼','사','오','육','칠','팔','구'};
		char[] target=new char[10];
		for(int i=0; i<target.length; i++) {
			target[i]=(char)('0'+i);
		}
		
		java.util.Scanner sc;
		sc=new java.util.Scanner(System.in);
		char gender='여';
		int age=0;
		boolean boo1=true,boo2=false;
		while(boo1) {
			boo2=false;
			System.out.print("주민번호를 입력> ");
			String input=sc.nextLine();
			char[] arr1=input.toCharArray();
			
			for(int i=0; i<arr1.length; i++) {
				for(int j=0; j<role.length; j++) {
					if(arr1[i]==role[j]) {arr1[i]=target[j];}
				}
			}
			
			for(int i=0; i<arr1.length; i++) {
				if(i!=6&&(arr1[i]<'0'||arr1[i]>'9')) {boo2=true;}
			}
			
			if(arr1[6]!='-') {
				System.out.println("입력포멧을 다시 확인하세요 (000000-0000000)");
			}else if(arr1.length!=14){
				System.out.println("입력포멧을 다시 확인하세요 (000000-0000000)");
			}else if(boo2){
				System.out.println("숫자만 입력하세요");
			}else {
				if(arr1[7]=='1'||arr1[7]=='3') {gender='남';}
				if(arr1[7]=='2'||arr1[7]=='4') {gender='여';}
				int year=1900+(arr1[0]-'0')*10+(arr1[1]-'0')*1;
				if(arr1[7]=='3'||arr1[7]=='4')year+=100;
				age=2025-year+1;
				boo1=false;
			}
		}
		System.out.println("당신은 "+age+"세 "+gender+"성입니다");
	}
}
