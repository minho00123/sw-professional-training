package com.am;

class Ex100{
	int su=111;
	
	public Ex100(String msg) {
		
	}
	
	public void func01() {
		System.out.println("�θ���"+su);
	}
}

public class Ex10 extends Ex100 {
	int su=222;
	
	public Ex10() {
		super("aaa"); // �ڵ� �� ��ܿ� ��ġ�ؾ� �Ѵ�.
	}

	public Ex10(int a) {
		this();
	}

	public void func01() {
//		super.func01();
		System.out.println("�ڽı��"+super.su);
		System.out.println("�ڽı��"+this.su);
	}
	public static void main(String[] args) {
		Ex10 me=new Ex10();
		me.func01();
	}

}
