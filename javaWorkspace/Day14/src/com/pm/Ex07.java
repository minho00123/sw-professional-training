package com.pm;

import java.util.*;

public class Ex07 {
	private static int initialId = 20250001;

	public static void main(String[] args) {
		// 학생성적관리프로그램(ver 0.12.0) - use Map
		System.out.println("학생성적관리프로그램(ver 0.12.0)");
		Scanner sc = new Scanner(System.in);
		Map<String, int[]> data = new TreeMap<>();
		String[] subjects = new String[] { "국어", "영어", "수학" };

		while (true) {
			System.out.print("1.보기 2.입력 3.수정 4.삭제 0.종료> ");
			int userInput = sc.nextInt();

			if (userInput == 0) {
				System.out.println("프로그램을 종료합니다. 이용해주셔서 감사합니다.");
				sc.close();
				return;
			}

			if (userInput == 1) {
				System.out.println("--------------------------------------------------");
				System.out.println("학번\t|국어\t|영어\t|수학\t|합계\t|평균");
				System.out.println("--------------------------------------------------");

				Iterator<String> keys = data.keySet().iterator();

				while (keys.hasNext()) {
					String id = keys.next();
					int[] studentScore = data.get(id);
					int sum = studentScore[0] + studentScore[1] + studentScore[2];
					double average = (double) sum / studentScore.length;

					System.out.printf("%s|%d\t|%d\t|%d\t|%d\t|%.2f%n", id, studentScore[0], studentScore[1],
							studentScore[2], sum, average);
				}
			}

			if (userInput == 2) {
				int[] studentScore = new int[3];

				for (int i = 0; i < subjects.length; i++) {
					System.out.print(subjects[i] + "> ");
					studentScore[i] = sc.nextInt();
				}

				data.put(String.valueOf(initialId++), studentScore);
			}

			if (userInput == 3) {
				System.out.print("수정할 학번> ");
				String id = String.valueOf(sc.nextInt());

				if (data.containsKey(id)) {
					int[] newStudentScore = new int[3];

					for (int i = 0; i < subjects.length; i++) {
						System.out.print(subjects[i] + "> ");
						newStudentScore[i] = sc.nextInt();
					}

					data.replace(id, newStudentScore);
				}
			}
			if (userInput == 4) {
				System.out.print("삭제할 학번> ");
				String id = String.valueOf(sc.nextInt());

				if (data.containsKey(id)) {
					data.remove(id);
				}
			}
		}
	}

}
