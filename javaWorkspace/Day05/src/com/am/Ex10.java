package com.am;

public class Ex10 {
//	public static int su1=1111;
	public static int su2=2222;
	public int su3 = 3333;
	
	public static void main(String[] args) {
		int su1=1111;
		System.out.println("main su1="+su1);
		func01(su1);
//		func01();
		System.out.println("main su1="+su1);
		System.out.println("main su2="+su2);
		Ex10 me = new Ex10();
		System.out.println("main su3="+me.su3);
		me.func02();
		Ex10 me2 = new Ex10();
		System.out.println("main su3="+me2.su3);
		System.out.println("main su3="+me.su3);
	}
	
	public void func02() {
		su3++;
		System.out.println("f2 su3="+su3);
	}

	public static void func01(int su1) {
		su1++;
		su2++;
		
		System.out.println("func01 su="+su1);
	}
}
