package com.pm;

import java.util.Scanner;

public class StudentGradeManagementProgramVer5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		int[][] gradeData = new int[count][4];
		
		System.out.println("--------------------------------------------------");
		System.out.println("\t학생성적관리프로그램(ver 0.5.0)");
		System.out.println("--------------------------------------------------");

		while (true) {
			System.out.print("1.보기 2.입력 3.수정 4.삭제 0.종료> ");
			int choice = sc.nextInt();
			
			switch (choice) {
				case 1:
					if (count == 0) {
						System.out.println("출력할 데이터가 없습니다.");
						break;
					}
					
					System.out.println("--------------------------------------------------");
					System.out.println("학번\t|국어\t|영어\t|수학\t|합계\t|평균");
					System.out.println("--------------------------------------------------");

					for (int i = 0; i < count; i++) {
						int sum = gradeData[i][1] + gradeData[i][2] + gradeData[i][3];
						double average = sum / 3;
						
						System.out.println(String.format("%d\t|%d\t|%d\t|%d\t|%d\t|%.2f\t", gradeData[i][0], gradeData[i][1], gradeData[i][2], gradeData[i][3], sum, average));
					}

					break;
				case 2:
					count++;

					int[][] temp = new int[count][4];
					
					for (int i = 0; i < gradeData.length; i++) {
						temp[i] = gradeData[i];
					}

					while (true) {
						System.out.print("학번> ");
						int id = sc.nextInt();
						boolean hasId = false;

						for (int i = 0; i < gradeData.length; i++) {
							if (id == gradeData[i][0]) {
								System.out.println("입력한 학번이 있습니다.");
								hasId = true;
								break;
							}
						}
						
						if (!hasId) {
							temp[count - 1][0] = id;
							break;
						}
					}

					while (true) {
						System.out.print("국어> ");
						int koreanGrade = sc.nextInt();

						if (koreanGrade < 0 || koreanGrade > 100) {
							System.out.println("0 ~ 100 사이의 숫자를 입력하세요.");
						} else {
							temp[count - 1][1] = koreanGrade;
							break;
						}
					}

					while (true) {
						System.out.print("영어> ");
						int englishGrade = sc.nextInt();
						if (englishGrade < 0 || englishGrade > 100) {
							System.out.println("0 ~ 100 사이의 숫자를 입력하세요.");
						} else {
							temp[count - 1][2] = englishGrade;
							break;
						}
					}

					while (true) {
						System.out.print("수학> ");
						int mathGrade = sc.nextInt();
						if (mathGrade < 0 || mathGrade > 100) {
							System.out.println("0 ~ 100 사이의 숫자를 입력하세요.");
						} else {
							temp[count - 1][3] = mathGrade;
							break;
						}
					}
				
					gradeData = temp;

					break;
				case 3:
					if (count == 0) {
						System.out.println("수정할 데이터가 없습니다.");
						break;
					}

					System.out.print("수정할 학번> ");
					int updateId = sc.nextInt();
					int updateIndex = -1;

					for (int i = 0; i < count; i++) {
						if (updateId == gradeData[i][0]) {
							updateIndex = i;
						}
					}
					
					if (updateIndex == -1) {
						System.out.println("수정할 학번이 없습니다.");
						break;
					}
					
					while (true) {
						System.out.print("국어> ");
						int koreanGrade = sc.nextInt();

						if (koreanGrade < 0 || koreanGrade > 100) {
							System.out.println("0 ~ 100 사이의 숫자를 입력하세요.");
						} else {
							gradeData[updateIndex][1] = koreanGrade;
							break;
						}
					}

					while (true) {
						System.out.print("영어> ");
						int englishGrade = sc.nextInt();
						if (englishGrade < 0 || englishGrade > 100) {
							System.out.println("0 ~ 100 사이의 숫자를 입력하세요.");
						} else {
							gradeData[updateIndex][2] = englishGrade;
							break;
						}
					}

					while (true) {
						System.out.print("수학> ");
						int mathGrade = sc.nextInt();
						if (mathGrade < 0 || mathGrade > 100) {
							System.out.println("0 ~ 100 사이의 숫자를 입력하세요.");
						} else {
							gradeData[updateIndex][3] = mathGrade;
							break;
						}
					}
					
					break;
				case 4:
					if (count == 0) {
						System.out.println("삭제할 데이터가 없습니다.");
						break;
					}
					
					System.out.print("삭제할 학번> ");
					int deleteId = sc.nextInt();
					int deleteIndex = -1;

					for (int i = 0; i < count; i++) {
						if (deleteId == gradeData[i][0]) {
							deleteIndex = i;
						}
					}
					
					if (deleteIndex == -1) {
						System.out.println("삭제할 학번이 없습니다.");
						break;
					}
					
					int[][] temp2 = new int[--count][4];
					int j = 0;
					for (int i = 0; i < gradeData.length; i++) {
						if (deleteIndex == i) {
							continue;
						}
					
						temp2[j] = gradeData[i];
						j++;
					}
					
					gradeData = temp2;
					
					System.out.println("학번 " + deleteId + " 데이터가 삭제되었습니다.");
					
					break;
				case 0:
					System.out.println("프로그램을 종료합니다.");
					return;
				default:
					System.out.println("올바른 번호를 입력하세요.");
			}
		}
	}
}
