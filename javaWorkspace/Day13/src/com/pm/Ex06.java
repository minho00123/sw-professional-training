package com.pm;

public class Ex06 {

	public static void main(String[] args) {
		Box<? super Pen> box = new Box<>();
//		box.setPen(new Ballpen());
//		box.setPen(new Pencil());
//		box.setPen(new Pen());
//		box.setPen(new Object());

		Box<? extends Pen> box2 = new Box<>();
//		box2.setPen(new BallPen());
//		box2.setPen(new Pencil());
//		box.setPen(new Pen());
//		box2.setPen(new Object());
	}

}
