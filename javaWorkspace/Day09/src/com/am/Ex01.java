package com.am;

// 추상클래스
// - 추상메서드를 0개 이상 갖는 클래스
// - 상속을 통해서만 사용함을 강제하는 클래스 (non-static의 경우)
abstract class Lec01{
//	static int su1=1111;
	int su2=2222;
	
	public Lec01(String msg) {
		System.out.println(msg);
	}
	protected Lec01() {}
	Lec01(int s) {}
	private Lec01(double a) {}
	
//	public static void func03() {}
	public void func01() {}
	// 추상메서드
	// 메서드의 선언 O
	// 메서드의 구현 X
//	public abstract void func02();
//	public static abstract void func04(); // 에러!: static과 abstract는 동시에 존재할 수 없다.
}

public class Ex01 extends Lec01{

//	public void func02() {}
	
	public Ex01() {
		super("");
		System.out.println("자식객체");
	}
	
	public static void main(String[] args) {
//		Lec01 parent=new Lec01();
//		System.out.println(Lec01.su1);
//		Lec01.func03();
		Ex01 me=new Ex01();
	}

}
