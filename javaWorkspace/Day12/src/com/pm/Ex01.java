package com.pm;

public class Ex01 {

	public static void main(String[] args) {
		java.util.ArrayList list = new java.util.ArrayList();
//		java.util.LinkedList list = new java.util.LinkedList();
		long before = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			list.add("item"+i);
		}
		String msg="";
		for(int i=0; i<1000000; i++) {
			msg+=list.get(i).toString();
		}
		long after = System.currentTimeMillis();
		System.out.println("걸린시간:" + (after - before) + "ms");
		System.out.println("걸린시간:" + (after - before)/1000.0 + "s");
	}

}
