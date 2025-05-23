package com.am;
// 부모클래스, super class

class Ex777{}

class Ex77 {
	int su1 = 1111;
	
	public void func01() {
		// this.func02(); // 부모는 자식의 기능을 사용할 수 없다.
		System.out.println("부모의 기능");
	}
}
// 자식클래스
public class Ex07 extends Ex77 {
	
	public void func02() {
		System.out.println("자식의 기능");
	}

	public static void main(String[] args) {
		// 상속
		// 모든 클래스는 부모클래스를 상속받음
		// 특별히 상속이 없으면 최상위의 Object 클래스를 상속
		// 단일 상속
		
		Ex77 parent = new Ex77();
		Ex07 me = new Ex07();
		parent.func01();
		me.func01();
		me.func02();
		System.out.println(parent.su1);
		System.out.println(me.su1);
	}

}
