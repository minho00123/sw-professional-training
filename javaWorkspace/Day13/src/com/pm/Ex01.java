package com.pm;

//class Pen {
//	public void work() {
//		System.out.println("���� �ۼ��մϴ�");
//	}
//}

//interface Pen {
//	void work();
//}

class Pen {
	public void work() {
		System.out.println("�⺻���");
	}
}

class Ballpen extends Pen {

	public void work() {
		System.out.println("���� �ۼ��մϴ�");
	}
}

class Pencil extends Pen {
	public void work() {
		System.out.println("�׸��� �׸��ϴ�");
	}
}

class Signpen extends Pen {
	public void work() {
		System.out.println("�����մϴ�");
	}
}

// T, E, K, V... ������ ���� ���δ�.
class Box<T> {
	private T pen;

	public void setPen(T pen) {
		this.pen = pen;
	}

	public T getPen() {
		return this.pen;
	}
}

public class Ex01 {

	public static void main(String[] args) {
//		Pencil pen2 = new Pencil();
//		Ballpen pen = new Ballpen();

		Box<Pen> box = new Box<Pen>();

		box.setPen(new Signpen());

		Pen my = box.getPen();

		my.work();
	}

}
