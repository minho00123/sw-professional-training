package com.pm;

public class Ex02 {

	public static void main(String[] args) {
		int[] arr1= {-2,-1,0,1,2};
//		java.util.Scanner sc;
//		sc=new java.util.Scanner(System.in);
		for(int i=0; i<arr1.length; i++) {
			try {
//				sc.nextInt();
				System.out.println(0/arr1[i]);
//			}catch(java.lang.ArithmeticException e) {
			}catch(Exception e) {
//				String msg=e.getMessage();
//				String msg=e.toString();
//				System.out.println(msg);
//				StackTraceElement[] stack=e.getStackTrace();
//				for(int j=0; j<stack.length; j++) {
//					StackTraceElement element=stack[j];
//					System.out.print(element.getClassName()+"\t");
//					System.out.print(element.getMethodName()+"\t");
//					System.out.println(element.getLineNumber());
//				}
				e.printStackTrace();
			}
//			try {
//				System.out.println(0/arr1[i]);
//			}catch(Exception e) {
//				System.out.println("에러해결");
//			}
//			try {
//				System.out.println(0/arr1[i]);
//			}catch(Throwable e) {
//				System.out.println("에러해결");
//			}
		}
	}

}
