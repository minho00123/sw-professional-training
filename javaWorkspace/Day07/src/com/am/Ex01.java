package com.am;

public class Ex01 {
	Ex01 me2; // Ex01 me2=null
	public static String msg=null; // String�� Ŭ�����̱� ������ ����Ʈ���� null�̴�.
	public static String msg2=""; // msg2=""�� ��ü�� ������, item(����)�� ����. msg=null�� ��ü�� ����.(=�ּҰ��� ����)
	
	public Ex01() {
//		System.out.println("��ü ����");
//		System.out.print("�Ű����� ");
//		System.out.println("����");
		// this()�� ������ �� ��ܿ� ��ġ
		// System.out.println("��ü ���� ����"); // ���� �߻�!
		this("����");
		System.out.println(this);
	}
	public Ex01(int su) {
//		System.out.println("��ü ����");
//		System.out.print("�Ű����� ");
//		System.out.println("����:"+su);
		// System.out.println("��ü ���� ����"); // ���� �߻�!
		this("����:"+su);
		System.out.println("���� �� ����");
	}
	public Ex01(String msg) {
		// this(); // ���� �߻�! this()�� ȣ���� ���� ��� ������ �� �ϳ��� this()�� ����� �Ѵ�.
		System.out.println("��ü�� �����Ǵ� ������");
		System.out.println("��ü ����");
		System.out.print("�Ű����� ");
		System.out.println(msg);
	}

	public static void main(String[] args) {
		// char ch='\u0000'; // null
		Ex01 me=null; // ���� ������ ����Ʈ ���� null�̴�. char�� ����Ʈ ���� null�� �ٸ� ���̴�. char�� null�� ����, ���� ������ null�� Ű���� null�̴�.
		me=new Ex01("java"); // ���������� Ÿ���� Ŭ�����̴�.
		me=new Ex01(1111);
		me=new Ex01();
		// msg.length(); // ���� �߻�!
		// msg2.length(); // ���� �߻� X
	}

}
