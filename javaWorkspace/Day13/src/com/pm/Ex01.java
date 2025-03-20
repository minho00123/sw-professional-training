package com.pm;

//class Pen {
//	public void work() {
//		System.out.println("글을 작성합니다");
//	}
//}

//interface Pen {
//	void work();
//}

class Pen {
	public void work() {
		System.out.println("기본기능");
	}
}

class Ballpen extends Pen {

	public void work() {
		System.out.println("글을 작성합니다");
	}
}

class Pencil extends Pen {
	public void work() {
		System.out.println("그림도 그립니다");
	}
}

class Signpen extends Pen {
	public void work() {
		System.out.println("싸인합니다");
	}
}

// T, E, K, V... 등으로 많이 쓰인다.
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
