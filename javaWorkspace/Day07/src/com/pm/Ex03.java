package com.pm;
class Car{}
public class Ex03 {

	public static void main(String[] args) {
		java.lang.String msg="hello world";
		String msg1=new String(); // ""(�� ���ڿ�)
		String msg2=new String(new char[] {'a','b','c'});
		String msg3=new String(new byte[] {65,66,67});
		String msg4=new String(msg);
		java.lang.System.out.println(msg1);
		java.lang.System.out.println(String.CASE_INSENSITIVE_ORDER);
//		System.out.println(new Car());
//		System.out.println(new Car());
//		System.out.println(new Car());
		System.out.println(msg.charAt(1));
		System.out.println(msg.concat("!!!"));
		System.out.println(msg);
		String msg5="ja";
		String msg6="va";
		String msg7="java";
		String msg8="java";
		String msg9="ja"+"va";
		String msg10=msg5+msg6;
		String msg11="ja".concat("va");
		System.out.println(msg7==msg8);
		System.out.println(msg7==msg9);
		System.out.println(msg7==msg10);
		System.out.println(msg7==msg11);
	}

}
