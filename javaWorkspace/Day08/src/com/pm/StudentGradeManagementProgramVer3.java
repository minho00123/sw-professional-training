package com.pm;

/*
 * 학생성적관리프로그램(ver 0.3.0) - 문자열
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

public class StudentGradeManagementProgramVer3 {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("학생성적관리프로그램(ver 0.3.0)");
		String gradeData = "";
		int count = 0;
		
		while(true) {
			System.out.print("1. 입력 2.출력 0.종료> ");
			int input = sc.nextInt();

			switch (input) {
				case 1:
					System.out.print("국어> ");
					int koreanGrade = sc.nextInt();
					System.out.print("영어> ");
					int englishGrade = sc.nextInt();
					System.out.print("수학> ");
					int mathGrade = sc.nextInt();
					
					int sum = koreanGrade + englishGrade + mathGrade;
					double average = (sum / 3) * 100 / 100.0;
					
					gradeData += (String.valueOf(count + 1) + "\t|" +
								  String.valueOf(koreanGrade) + "\t|" +
								  String.valueOf(englishGrade) + "\t|" +
								  String.valueOf(mathGrade) + "\t|" +
								  String.valueOf(sum) + "\t|" +
								  String.valueOf(average) + "\t\n" +
								  "--------------------------------------------------\n");

					count++;
					break;
				case 2:
					System.out.println("--------------------------------------------------");
					System.out.println("학번\t|국어\t|영어\t|수학\t|합계\t|평균");
					System.out.println("--------------------------------------------------");
					System.out.println(gradeData);
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
