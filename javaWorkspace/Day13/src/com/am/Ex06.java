package com.am;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ex06 {

	public static void main(String[] args) {
		// 제네릭 - 제약
		// 1.5 ~
		// E,K,V,T,... <- 제네릭으로 작성되었다는 문자
		// 제네릭은 반드시 참조변수 타입이어야 한다.

		List<Integer> list = new ArrayList<Integer>();
		list.add(1111);
		list.add(2222);
		list.add(3333);
		list.add(4444);
		list.add(5555);
//		list.add(3.14);
		
		list.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			}
		});

		for (int i = 0; i < list.size(); i++) {
			int msg = list.get(i);
			System.out.println(msg);
		}
	}

}
