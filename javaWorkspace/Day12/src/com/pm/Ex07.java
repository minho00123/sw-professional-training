package com.pm;

import java.util.Stack;

public class Ex07 {

	public static void main(String[] args) {
//		java.util.List = new Stack();
		Stack stack = new Stack();
		stack.push("첫번째");
		stack.push("두번째");
		stack.push("세번째");
		stack.push("네번째");
		System.out.println(stack.search("네번째")); // 나오는 순서를 반환
		while (!stack.isEmpty()) {
			System.out.println(stack.peek());
			stack.pop();
		}
		System.out.println(stack.search("네번째"));
	}

}
