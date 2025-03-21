package com.pm;

import java.util.Scanner;

public class StudentGradeManagementProgramVer6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		String gradeData = "";
		
		System.out.println("--------------------------------------------------");
		System.out.println("\t학생성적관리프로그램(ver 0.6.0)");
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
					System.out.println(gradeData);

					break;
				case 2:
					count++;
					String id;
					int koreanGrade;
					int englishGrade;
					int mathGrade;
					
					String[] splittedData = gradeData.split("\n");

					while (true) {
						System.out.print("학번> ");
						id = sc.next();
						boolean hasId = false;

						for (int i = 0; i < splittedData.length; i++) {
							String[] items = splittedData[i].split("\\|");
							if (id.equals(items[0].trim())) {
								System.out.println("입력한 학번이 있습니다.");
								hasId = true;
								break;
							}
						}
						
						if (!hasId) {
							gradeData += id + "\t|";
							break;
						}
					}

					while (true) {
						System.out.print("국어> ");
						koreanGrade = sc.nextInt();

						if (koreanGrade < 0 || koreanGrade > 100) {
							System.out.println("0 ~ 100 사이의 숫자를 입력하세요.");
						} else {
							gradeData += koreanGrade + "\t|";
							break;
						}
					}

					while (true) {
						System.out.print("영어> ");
						englishGrade = sc.nextInt();
						if (englishGrade < 0 || englishGrade > 100) {
							System.out.println("0 ~ 100 사이의 숫자를 입력하세요.");
						} else {
							gradeData += englishGrade + "\t|";
							break;
						}
					}

					while (true) {
						System.out.print("수학> ");
						mathGrade = sc.nextInt();
						if (mathGrade < 0 || mathGrade > 100) {
							System.out.println("0 ~ 100 사이의 숫자를 입력하세요.");
						} else {
							gradeData += mathGrade + "\t|";
							break;
						}
					}
					
					int sum = koreanGrade + englishGrade + mathGrade;
					double average = sum / 3 * 100 / 100.0;
					
					gradeData += sum + "\t|" + average + "\n";

					break;
				case 3:
					if (count == 0) {
						System.out.println("수정할 데이터가 없습니다.");
						break;
					}
					
					String[] splittedData2 = gradeData.split("\n");

					System.out.print("수정할 학번> ");
					String updateId = sc.next();
					int updateIndex = -1;

					for (int i = 0; i < splittedData2.length; i++) {
						String[] items = splittedData2[i].split("\\|");
						if (updateId.equals(items[0].trim())) {
							updateIndex = i;
						}
					}
					
					if (updateIndex == -1) {
						System.out.println("수정할 학번이 없습니다.");
						break;
					}
					
					String temp = updateId + "\t|";
					int koreanGrade2;
					int englishGrade2;
					int mathGrade2;
					
					while (true) {
						System.out.print("국어> ");
						koreanGrade2 = sc.nextInt();

						if (koreanGrade2 < 0 || koreanGrade2 > 100) {
							System.out.println("0 ~ 100 사이의 숫자를 입력하세요.");
						} else {
							temp += koreanGrade2 + "\t|";
							break;
						}
					}

					while (true) {
						System.out.print("영어> ");
						englishGrade2 = sc.nextInt();
						if (englishGrade2 < 0 || englishGrade2 > 100) {
							System.out.println("0 ~ 100 사이의 숫자를 입력하세요.");
						} else {
							temp += englishGrade2 + "\t|";
							break;
						}
					}

					while (true) {
						System.out.print("수학> ");
						mathGrade2 = sc.nextInt();
						if (mathGrade2 < 0 || mathGrade2 > 100) {
							System.out.println("0 ~ 100 사이의 숫자를 입력하세요.");
						} else {
							temp += mathGrade2 + "\t|";
							break;
						}
					}
					
					int sum2 = koreanGrade2 + englishGrade2 + mathGrade2;
					double average2 = sum2 / 3 * 100 / 100.0;
					temp += sum2 + "\t|" + average2 + "\n";
					
					gradeData = "";
					for (int i = 0; i < updateIndex; i++) {
						gradeData += splittedData2[i] + "\n";
					}
					
					gradeData += temp;
					
					for (int i = updateIndex + 1; i < splittedData2.length; i++) {
						gradeData += splittedData2[i] + "\n";
					}
					
					break;
				case 4:
					if (count == 0) {
						System.out.println("삭제할 데이터가 없습니다.");
						break;
					}
					
					String[] splittedData3 = gradeData.split("\n");
					
					System.out.print("삭제할 학번> ");
					String deleteId = sc.next();
					int deleteIndex = -1;

					for (int i = 0; i < splittedData3.length; i++) {
						String[] items = splittedData3[i].split("\\|");
						if (deleteId.equals(items[0].trim())) {
							deleteIndex = i;
						}
					}
					
					if (deleteIndex == -1) {
						System.out.println("수정할 학번이 없습니다.");
						break;
					}
		
					gradeData = "";
					for (int i = 0; i < splittedData3.length; i++) {
						if (i == deleteIndex) {
							continue;
						}
						gradeData += splittedData3[i] + "\n";
					}
					
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
