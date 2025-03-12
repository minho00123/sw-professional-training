package com.am;

public class Ex08 {
	// 
	// Ŭ���� �޼���, static �޼���, �Լ�...
	// static ���� - ��Ű�� ���.Ŭ������.�޼�������� ����
	// public static ����Ÿ��(void) �޼����(�Ű�����...){����;}
	//
	// �ν��Ͻ� �޼���, non-static �޼���, ��� �޼���
	// �� ���� - ��ü�� ����
	// public ����Ÿ��(void) �޼����(�Ű�����...){����;}
	
	
	// static -> static				[��Ű�� ���].[Ŭ������].func01()
	// static -> non-static			��������.func01() *�⺻ �ڷ����� ������ ��� ������ ����������� �Ѵ�.
	// non-static -> static 		[��Ű�� ���].[Ŭ������].func01()
	// non-static -> non-static		[this].func01()
	
	public static void main(String[] args) {
		// �޼��� - �Լ�
		System.out.println(com.am.Ex07.func02());
		System.out.println(Ex07.func02());
		System.out.println(com.am.Ex08.func02());
		System.out.println(Ex08.func02());
		System.out.println(func02());
		System.out.println("------------------------------------------");
		com.am.Ex08 me = new Ex08();
		System.out.println(me.func03());
		me.func04(me);
	}
	
	public static String func02() {
		return "�� �ƴ�����~~~";
	}
	
	public String func03() {
		return "non-static";
	}
	
	public void func04(Ex08 me) {
		com.am.Ex08 me2 = new Ex08();
		// System.out.println(this.func03());
		System.out.println(me==this);
		System.out.println(me2==this); // ���۷��� �� (= �ּҰ� ��), ���۷��� �񱳽� ���ٸ� ������ ��ü�� ����Ű�� �ִ�.
	}

}
