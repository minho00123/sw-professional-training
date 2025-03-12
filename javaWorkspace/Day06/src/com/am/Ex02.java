package com.am;

public class Ex02 {
	
	public Ex02() {
		System.out.println("객체생성");
		this.func01();
	}
	
	public Ex02(Ex02 me) {
		me.func01();
	}

	public static void main(String[] args) {
		/*
		 * Ex02 me=new Ex02();
		 * me.func01();
		 */
		
		// new Ex02();
		
		/*
		 * Ex02 me=new Ex02();
		 * me.func02(me);
		 */
		
		Ex02 me = new Ex02();
		Ex02 me2 = new Ex02(me);
	}

	public void func02(Ex02 me) {
		me.func01();
	}
	
	public void func01() {
		System.out.println("기능호출");
	}
}
