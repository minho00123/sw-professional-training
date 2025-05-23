package com.am;

// 인터페이스
// 오직 추상메서드만을 갖는 ...
// 다음의 키워드 생략이 가능 (public, abstract, static)
// 필드, 생성자 (X)
// 1. 다형성 극대화
// 2. 협업
// 3. 인덱스
// 4. 존재유무
// 5. 네이밍 축약
interface Inter05{}
// 다중 상속처럼 할 수 있게 만들어준다.
// 인터페이스의 활용은 열려있다.
interface Inter01 extends Inter02{
	public static int su1=1111;
	public int su2=2222; // static 키워드 생략가능
	int su3=3333; // public 키워드 생략가능

	public abstract void func01();
//	public void func02() {}; // 메서드의 구현을 가질 수 없다.
	public void func02(); // abstract 키워드 생략가능
	void func03(); // public 키워드 생략가능
}
interface Inter02{
	void func01();
}
interface Inter03{
	void func02();
}

public class Ex04 extends Object implements Inter02,Inter03{

	public static void main(String[] args) {
		Ex04 me=new Ex04();
		me.func01();
		Object me2=new Ex04();
//		me2.func01(); // 호출 불가능
		Inter02 me3=new Ex04();
		me3.func01();
		Inter03 me4=new Ex04();
		me4.func02();
		
	}

	@Override
	public void func01() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void func02() {
		// TODO Auto-generated method stub
		
	}

}
