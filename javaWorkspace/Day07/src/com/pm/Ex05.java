package com.pm;

public class Ex05 {

	public static void main(String[] args) {
		String msg="ABCD abcd ABCD abcd ABCD";
		String msg2="";
		
		System.out.println(msg.contains("BC"));
		System.out.println(msg.contains("BCd"));
		System.out.println(msg.hashCode());
		System.out.println(msg2.hashCode());
		System.out.println(msg.isEmpty());
		System.out.println(msg2.isEmpty());
		System.out.println(msg2.length()==0);
		System.out.println(msg2.length()!=0);
		System.out.println(msg.indexOf("BC"));
		System.out.println(msg.lastIndexOf("BC"));
		System.out.println(msg.indexOf("BC",5));
		System.out.println(msg.lastIndexOf("BC",20));
		System.out.println(msg.indexOf("Z"));
		System.out.println(msg.subSequence(5,9));
		
		String result=String.valueOf(1234);
		String result2=String.valueOf(3.14);
		String result3=String.valueOf(true);
		String result4=String.valueOf(new char[] {'a','b','c'});
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}

}
