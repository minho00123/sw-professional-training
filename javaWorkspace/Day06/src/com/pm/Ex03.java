package com.pm;

public class Ex03 {

	public static void main(String[] args) {
		// CRUD
//		String msg="ABCDabcd1234";
//		
//		System.out.println(msg.length());
//		System.out.println(msg.contains("bc"));
//		System.out.println(msg.charAt(4));
//		msg=msg.replace("abcd", "aBCd");
//		System.out.println(msg);
//		msg=msg.replace("aBC", "a");
//		System.out.println(msg);
//		msg=msg.concat("!@#$");
//		System.out.println(msg);
//		
//		System.out.println(msg.contains("bc"));
		
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
	
		System.out.println("-------------------------------------------------------");
		System.out.println("\t\t주민번호 체크기(ver 0.1.0)");
		System.out.println("-------------------------------------------------------");
		String role = "영일이삼사오육칠팔구";
		String target = "0123456789";
		
		java.util.Scanner sc;
		sc=new java.util.Scanner(System.in);
		char gender='여';
		int age=0;
		boolean boo1=true,boo2=false;
		while(boo1) {
			boo2=false;
			System.out.print("주민번호를 입력> ");
			String input=sc.nextLine();
			String temp="";

			for(int i=0; i<input.length(); i++) {
				for(int j=0; j<role.length(); j++) {
					if(input.charAt(i)==role.charAt(j)) {temp+=target.charAt(j);}
				}
				if(input.charAt(i)=='-') {temp+='-';}
			}

			input=temp;
			
			for(int i=0; i<input.length(); i++) {
				if(i!=6&&(input.charAt(i)<'0'||input.charAt(i)>'9')) {boo2=true;}
			}
			
			if(input.charAt(6)!='-') {
				System.out.println("입력포멧을 다시 확인하세요 (000000-0000000)");
			}else if(input.length()!=14){
				System.out.println("입력포멧을 다시 확인하세요 (000000-0000000)");
			}else if(boo2){
				System.out.println("숫자만 입력하세요");
			}else {
				if(input.charAt(7)=='1'||input.charAt(7)=='3') {gender='남';}
				if(input.charAt(7)=='2'||input.charAt(7)=='4') {gender='여';}
				int year=1900+(input.charAt(0)-'0')*10+(input.charAt(1)-'0')*1;
				if(input.charAt(7)=='3'||input.charAt(7)=='4')year+=100;
				age=2025-year+1;
				boo1=false;
			}
		}
		System.out.println("당신은 "+age+"세 "+gender+"성입니다");
	
	}

}
