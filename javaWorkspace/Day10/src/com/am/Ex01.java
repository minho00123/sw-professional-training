package com.am;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] argsJ) {
		// 학생성적관리프로그램(ver 0.7.0)
		// 1. 보기 2. 입력 [3. 수정 4. 삭제] 0. 종료>
		// 무결성 (0~100)
		// 동적할당
		
		int count = 0;
		int[][] data = new int[count][4];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생성적관리프로그램(ver 0.7.0)");
		
		while (true) {
			System.out.print("1. 보기 2. 입력 3. 수정 4. 삭제 0. 종료> ");
			int input = sc.nextInt();

			if (input == 0) {
				System.out.println("프로그램을 종료합니다. 이용해주셔서 감사합니다.");
				return;
			}

			if (input == 1) {
				if (count == 0) {
					System.out.println("출력할 데이터가 없습니다.");
				} else {
					System.out.println("------------------------------------------------");
					System.out.println("학번\t|국어\t|영어\t|수학\t|합계\t|평균\t");
					System.out.println("------------------------------------------------");
					
					for (int i = 0; i < count; i++) {
						int sum = data[i][1] + data[i][2] + data[i][3];
						double average = sum / 3.0;
						
						System.out.printf("%d\t|%d\t|%d\t|%d\t|%d\t|%.2f\t%n", data[i][0], data[i][1], data[i][2], data[i][3], sum, average);
					}
					
				}
			}
			
			if (input == 2) {
				count++;
				
				int[][] temp = new int[count][4];
				
				for (int i = 0; i < data.length; i++) {
					temp[i] = data[i];
				}

				System.out.print("학번> ");
				temp[count - 1][0] = sc.nextInt();
				
				boolean isOkay = false;
				
				while (!isOkay) {
					System.out.print("국어> ");
					int koreanScore = sc.nextInt();
					
					if (koreanScore < 0 || koreanScore > 100) {
						System.out.println("0 ~ 100 사이의 숫자를 입력하세요.");
					} else {
						temp[count - 1][1] = koreanScore;
						isOkay = true;
					}
				}
				
				isOkay = false;
				
				while (!isOkay) {
					System.out.print("영어> ");
					int englishScore = sc.nextInt();
					
					if (englishScore < 0 || englishScore > 100) {
						System.out.println("0 ~ 100 사이의 숫자를 입력하세요.");
					} else {
						temp[count - 1][2] = englishScore;
						isOkay = true;
					}
				}
				
				isOkay = false;
				
				while (!isOkay) {
					System.out.print("수학> ");
					int mathScore = sc.nextInt();
					
					if (mathScore < 0 || mathScore > 100) {
						System.out.println("0 ~ 100 사이의 숫자를 입력하세요.");
					} else {
						temp[count - 1][3] = mathScore;
						isOkay = true;
					}
				}
				
				data = temp;
			}
			
			if (input == 3) {
				System.out.print("학번> ");
				int id = sc.nextInt();
			}
			
			if (input == 4) {
				System.out.print("학번> ");
				int id = sc.nextInt();
			}
		}
		
	}
}
