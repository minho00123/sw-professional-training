package com.pm;
/*
 * �޼��� ������ ȣ�� ���
 * static -> static				func01();
 * static -> non-static 		��������.func01();
 * non-static -> non-static 	func01();
 * non-static -> static			func01();
 */

public class Ex02 {
	// �޼���(Ŭ�����޼���, static method)
	public static void func01() {
		System.out.println("Ŭ���� �޼���");
	}

	// �޼���(��� �޼���,�ν��Ͻ� �޼���, non-static method)
	public void func02() {
		System.out.println("��� �޼���");
		func01();
	}

	public void func02(int a) {
		int su = func03(); // non-static method������ �ٷ� ȣ�� ����
		System.out.println("su=" + su);
		return;
	}

	public int func03() {
		return 1234;
	}

	public static void main(String[] args) {
		func01();
		// ��������
		Ex02 me = new Ex02(); // ��ü ����
		me.func02();
		me.func02(1111);
		me.func03();

	}
}
