package com.pm;

public class Ex01 {
	
	public static String uppercase(String msg) {
		char[] arr1=msg.toCharArray();
		int gap='A'-'a';
		for(int i=0; i<arr1.length; i++) {
			if (arr1[i] >= 'a' && arr1[i] <= 'z') {
				arr1[i]+=gap;
			}
		}
		
		return new String(arr1);
	}
	
	public static String concat(String str1, String str2) {
		int str1Length = str1.length();
		int str2Length = str2.length();
		char[] result = new char[str1Length + str2Length];
		char[] str1Arr = str1.toCharArray();
		char[] str2Arr = str2.toCharArray();
		
		for (int i = 0; i < str1Length; i++) {
			result[i] = str1Arr[i];
		}
		
		for (int i = str1Length; i < result.length; i++) {
			result[i] = str2Arr[i - str2Length];
		}
		
		return new String(result);
	}
	
	public static String concatByTeacher(String msg1, String msg2) {
		char[] arr1=msg1.toCharArray(); // 0~length-1
		char[] arr2=msg2.toCharArray();
		char[] arr3=new char[arr1.length+arr2.length];
		
		for(int i=0; i<arr1.length; i++) {
			arr3[i]=arr1[i];
		}
		for(int i=0; i<arr2.length; i++) {
			arr3[i+arr1.length]=arr2[i];
		}
		
		return new String(arr3);
	}

	public static void main(String[] args) {
		String msg="java1234";
		
		char[] charArr = msg.toCharArray();
		
		for (int i = 0; i < charArr.length; i++) {
			if (charArr[i] >= 'a' && charArr[i] <= 'z') {
				charArr[i] = (char) (charArr[i] - ('a' - 'A'));
			}
		}
		
		String str = new String(charArr);
		
		System.out.println(str);

		//--------------- ����� �ڵ� ------------------------
		char[] arr1=msg.toCharArray();
		int gap='A'-'a';
		for(int i=0; i<arr1.length; i++) {
			if (arr1[i] >= 'a' && arr1[i] <= 'z') {
				arr1[i]+=gap;
			}
		}
		
		System.out.println(new String(arr1));
		
//		String result=uppercase(msg);
		// String result2=msg.toUpperCase();
//		System.out.println(result);
		// System.out.println(result2);
		
		
		String msg1="ja";
		String msg2="va";
		// String result=msg1+msg2;
//		String result=msg1.concat(msg2);
		
		System.out.println(concat(msg1, msg2));
		System.out.println(concatByTeacher(msg1, msg2));
		
		String msg3="java";
		System.out.println(msg3==msg1+msg2);
		System.out.println(msg1==msg1+msg2);
		
		String msg5="a";
		for(int i=0; i<20; i++) {
			msg5+=i;
		}
		System.out.println(msg5);
	}

}
