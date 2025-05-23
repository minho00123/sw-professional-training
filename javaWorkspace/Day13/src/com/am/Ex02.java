package com.am;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Ball implements Comparable {
	int num;

	public Ball(int num) {
		this.num = num;
	}

	@Override
	public int compareTo(Object obj) {
//		return 0;
//		return 1;
//		return -1;
//		return this.num - ((Ball) obj).num;
		return ((Ball) obj).num - this.num;
	}

	@Override
	public String toString() {
		return "num=" + this.num;
	}
}

class Lec02 implements Comparable {

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 1;
	}

}

class Lec22 implements Comparable {

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return -1;
	}
}

public class Ex02 {

	public static void main(String[] args) {
		// HashSet
		// set - 중복불허, 순서있음
		Set set1 = null;
		set1 = new HashSet();
//		set1 = new TreeSet();

//		set1.add(new Ball(1));
//		set1.add(new Ball(3));
//		set1.add(new Ball(5));
//		set1.add(new Ball(6));
//		set1.add(new Ball(4));
//		set1.add(new Ball(2));

		set1.add(new Lec02());
		set1.add(new Lec22());

		Iterator ite = set1.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}

	}

}
