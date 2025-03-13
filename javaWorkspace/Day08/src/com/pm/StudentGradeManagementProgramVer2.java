package com.pm;

/*
 * 학생성적관리프로그램(ver 0.2.0) - 배열
 * 
 * 3과목(국어,영어,수학)
 * 총원>3
 * 1. 입력 2.출력 0.종료> 1
 * 국어> 
 * 영어> 
 * 수학> 
 * 1. 입력 2.출력 (3.수정 4.삭제) 0.종료> 2
 * ------------------------------------------------------------
 * 학번 |국어	|영어	|수학	|합계	|평균
 * ------------------------------------------------------------
 * 1	|90		|91		|92		|000	|000
 * 
 * 1. 입력 2.출력 0.종료> 1
 * 국어> 
 * 영어> 
 * 수학> 
 * 1. 입력 2.출력 0.종료> 2
 * ------------------------------------------------------------
 * 학번 |국어	|영어	|수학	|합계	|평균
 * ------------------------------------------------------------
 * 1	|90		|91		|92		|000	|000
 * 2	|90		|91		|92		|000	|000
 * 
 */

public class StudentGradeManagementProgramVer2 {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("학생성적관리프로그램(ver 0.2.0)");
//		System.out.print("총원> ");
//		int total = sc.nextInt();
		int count = 0;
		int[][] gradeData = new int[count][4];

		while(true) {
			System.out.print("1. 입력 2.출력 3.수정 4.삭제 0.종료> ");
			int input = sc.nextInt();

			switch (input) {
				case 1:
//					if (count == total) {
//						System.out.println("입력할 공간이 없습니다.");
//						break;
//					}

					count++;
					int[][] temp = new int[count][4];
					
					for (int i = 0; i < gradeData.length; i++) {
						temp[i] = gradeData[i];
					}
					
					System.out.print("학번> ");
					temp[count - 1][0] = sc.nextInt();
					System.out.print("국어> ");
					temp[count - 1][1] = sc.nextInt();
					System.out.print("영어> ");
					temp[count - 1][2] = sc.nextInt();
					System.out.print("수학> ");
					temp[count - 1][3] = sc.nextInt();
					
					gradeData = temp;

					break;
				case 2:
					System.out.println("--------------------------------------------------");
					System.out.println("학번\t|국어\t|영어\t|수학\t|합계\t|평균");
					System.out.println("--------------------------------------------------");
					for (int i = 0; i < count; i++) {
						int sum = gradeData[i][0] + gradeData[i][1] + gradeData[i][2];
						double average = sum / 3.0;
						System.out.printf("%d\t|%d\t|%d\t|%d\t|%d\t|%.2f\t%n", gradeData[i][0], gradeData[i][1], gradeData[i][2], gradeData[i][3], sum, average);
						System.out.println("--------------------------------------------------");
					}
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
						if (gradeData[i][0] == updateId) {
							updateIndex = i;
						}
					}
					
					if (updateIndex == -1) {
						System.out.println("수정할 학번이 없습니다.");
						break;
					}
					
					System.out.print("국어> ");
					gradeData[updateIndex][1] = sc.nextInt();
					System.out.print("영어> ");
					gradeData[updateIndex][2] = sc.nextInt();
					System.out.print("수학> ");
					gradeData[updateIndex][3] = sc.nextInt();

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
						if (gradeData[i][0] == deleteId) {
							deleteIndex = i;
						}
					}
					
					if (deleteIndex == -1) {
						System.out.println("삭제할 학번이 없습니다.");
						break;
					}
					
					int[][] temp2 = new int[count][4];
					
					int j = 0;
					for (int i = 0; i < count; i++) {
						if (i == deleteIndex) {
							continue;
						}
						
						temp2[j] = gradeData[i];
					}
					
					gradeData = temp2;
					
					count--;
					break;
				case 0:
					System.out.println("프로그램을 종료합니다.");
					return;
				default:
					System.out.println("올바른 숫자를 입력하세요.");
			}
		}
	}

}
