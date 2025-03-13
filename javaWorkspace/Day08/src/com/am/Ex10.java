package com.am;

class Ex100{
	int su=111;
	
	public Ex100(String msg) {
		
	}
	
	public void func01() {
		System.out.println("부모기능"+su);
	}
}

public class Ex10 extends Ex100 {
	int su=222;
	
	public Ex10() {
		super("aaa"); // 코드 맨 상단에 위치해야 한다.
	}

	public Ex10(int a) {
		this();
	}

	public void func01() {
//		super.func01();
		System.out.println("자식기능"+super.su);
		System.out.println("자식기능"+this.su);
	}
	public static void main(String[] args) {
		Ex10 me=new Ex10();
		me.func01();
	}

}
