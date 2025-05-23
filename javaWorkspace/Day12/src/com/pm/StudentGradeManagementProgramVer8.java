package com.pm;

import java.util.*;

public class StudentGradeManagementProgramVer8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] subjects = new String[] { "국어", "영어", "수학" };
//		ArrayList data = new ArrayList();
		LinkedList data = new LinkedList();
		int count = 0;

		System.out.println("--------------------------------------------------");
		System.out.println("\t학생성적관리프로그램(ver 0.8.0)");
		System.out.println("--------------------------------------------------");

		while (true) {
			System.out.print("1.보기 2.입력 3.수정 4.삭제 0.종료> ");
			int userInput = sc.nextInt();

			switch (userInput) {
			case 0:
				System.out.println("프로그램을 종료합니다. 이용해주셔서 감사합니다.");
				sc.close();
				return;
			case 1:
				System.out.println("--------------------------------------------------");
				System.out.println("학번\t|국어\t|영어\t|수학\t|합계\t|평균");
				System.out.println("--------------------------------------------------");
				
				for (int i = 0; i < data.size(); i++) {
					int[] studentData = (int[]) data.get(i);
					
					int sum = studentData[1] + studentData[2] + studentData[3];
					double average = sum / 3.0;
					
					
					System.out.println(String.format("%d|%d\t|%d\t|%d\t|%d\t|%.2f\t", studentData[0], studentData[1], studentData[2], studentData[3], sum, average));
				}
				
				break;
			case 2:
				int[] studentData = new int[4];
				studentData[0] = 20250001 + data.size();

				for (int i = 0; i < subjects.length; i++) {
					System.out.print(subjects[i] + "> ");
					studentData[i + 1] = sc.nextInt();
				}
				
				data.add(studentData);

				break;
			case 3:
				System.out.print("수정할 학번> ");
				int updateId = sc.nextInt();
				
				for (int i = 0; i < data.size(); i++) {
					int[] studentData2 = (int[]) data.get(i);
					int id = studentData2[0];
					if (id == updateId) {
						for (int j = 1; j < subjects.length + 1; j++) {
							System.out.print(subjects[j - 1] + "> ");
							studentData2[j] = sc.nextInt();
						}
					}
				}
				
				break;
				
			case 4:
				System.out.print("삭제할 학번> ");
				int deleteId = sc.nextInt();
				
				for (int i = 0; i < data.size(); i++) {
					int id = ((int[]) (data.get(i)))[0];
					if (id == deleteId) {
						data.remove(i);
					}
				}

				break;
			default:
				System.out.println("올바른 숫자를 입력해주세요.");
			}
		}

	}

}
