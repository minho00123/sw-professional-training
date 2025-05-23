package com.pm;

import java.util.*;

class Student implements Comparable<Student> {
	int id;
	int koreanScore;
	int englishScore;
	int mathScore;

	public void setId(int id) {
		this.id = id;
	}

	public void setKoreanScore(int koreanScore) {
		this.koreanScore = koreanScore;
	}

	public void setEnglishScore(int englishScore) {
		this.englishScore = englishScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}

	@Override
	public int compareTo(Student student) {
		return student.id - this.id;
	}
}

public class Ex08 {

	public static void main(String[] args) {
		// 학생성적관리프로그램(ver 0.11.0)
		// SET
		// 내림차순 학번
		// 중복불허 - 학번 - 존재하는 학생입니다

		System.out.println("학생성적관리프로그램(ver 0.11.0)");
		Scanner sc = new Scanner(System.in);
		Set<Student> data = new TreeSet<Student>();
		int initialId = 20250001;

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

				Iterator<Student> studentsData = data.iterator();
				while (studentsData.hasNext()) {
					Student studentData = studentsData.next();
					int sum = studentData.koreanScore + studentData.englishScore + studentData.mathScore;
					double average = (double) sum / 3;
					System.out.println(String.format("%d|%d\t|%d\t|%d\t|%d\t|%.2f\t", studentData.id,
							studentData.koreanScore, studentData.englishScore, studentData.mathScore, sum, average));
				}
			}
			if (userInput == 2) {
				Student student = new Student();
				student.setId(initialId++);

				System.out.print("국어> ");
				student.setKoreanScore(sc.nextInt());
				System.out.print("영어> ");
				student.setEnglishScore(sc.nextInt());
				System.out.print("수학> ");
				student.setMathScore(sc.nextInt());

				boolean isAdded = data.add(student);

				if (!isAdded) {
					System.out.println("존재하는 학생입니다.");
				}
			}
			if (userInput == 3) {
				System.out.print("수정할 학번> ");
				int updateId = sc.nextInt();

				Iterator<Student> studentsData = data.iterator();
				while (studentsData.hasNext()) {
					Student studentData = studentsData.next();
					if (studentData.id == updateId) {
						System.out.print("국어> ");
						studentData.setKoreanScore(sc.nextInt());
						System.out.print("영어> ");
						studentData.setEnglishScore(sc.nextInt());
						System.out.print("수학> ");
						studentData.setMathScore(sc.nextInt());
					}
				}
			}
			if (userInput == 4) {
				System.out.print("삭제할 학번> ");
				int deleteId = sc.nextInt();

				Iterator<Student> studentsData = data.iterator();

				while (studentsData.hasNext()) {
					Student studentData = studentsData.next();
					if (studentData.id == deleteId) {
						studentsData.remove();
					}
				}
			}
		}

	}

}
