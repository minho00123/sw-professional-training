package com.pm;

public class Ex04 {
	
	public static void func01(){
		int a=0; int b=0;
		if(a==0&&b==0) {
			throw new RuntimeException();
		}
		int su=a/b;
	}

	public static void main(String[] args) {
//		int[] arr1= {-2,-1,0,1,2};
//		int su=0/arr1[2];

//		try {
//			Class.forName("com.pm.Ex04");
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
		
		try {
			func01();			
		}catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}

}
