package com.am;

import java.util.*;

public class Food {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<String> foodList = new ArrayList<String>();

		while (true) {
			// 메뉴 입력 받기
			System.out.print("메뉴 입력(0은 종료)> ");

			String input = sc.nextLine();

			if (input.equals("0")) {
				// 출력하기
				Random ran = new Random();
				System.out.println(foodList.get(ran.nextInt(foodList.size())));
				sc.close();
				return;
			}

			// 배열에 넣기
			foodList.add(input);
		}
	}

}
