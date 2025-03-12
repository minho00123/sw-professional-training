package com.am;

public class Ex13 {

	public static void main(String[] args) {
		// 학생성적을 입력받고 총점과 학점을 출력하시오
		
		// 과목은 총 3과목으로 국어,영어,수학
		// 각 과목의 만점은 100점
		
		// 합계와 평균을 구하되 평균은 소수 둘째자리 까지만 출력
		// 학점은 A부터 F까지
		// A:90이상, B:80이상, C:70이상, D:60이상, F:60미만
		
		// 학생성적관리프로그램(ver 0.1.0)
		// 국어> 90
		// 영어> 78
		// 수학> 89
		// -----------------------------------------
		// 국어 | 영어 | 수학 | 합계 | 평균 | 학점
		// -----------------------------------------
		// 90   | 78   | 89   | 000  | 00.00| B
		// -----------------------------------------

		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.println("학생성적관리프로그램(ver 0.1.0)");
		System.out.print("국어> ");
		int koreanScore = sc.nextInt();
		System.out.print("영어> ");
		int englishScore = sc.nextInt();
		System.out.print("수학> ");
		int mathScore = sc.nextInt();
		
		int sum = koreanScore + englishScore + mathScore;
		double average = sum / 3.0;
		char grade = 'A';
		
//		if (average >= 90) {
//			grade = 'A';
//		} else if (average >= 80) {
//			grade = 'B';
//		} else if (average >= 70) {
//			grade = 'C';
//		} else if (average >= 60) {
//			grade = 'D';
//		} else {
//			grade = 'F';
//		}

		switch ((int) average / 10) {
			case 10:
				grade = 'A';
				break;
			case 9:
				grade = 'A';
				break;
			case 8:
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			case 6:
				grade = 'D';
				break;
			default:
				grade = 'F';
		}
		
		System.out.println("-----------------------------------------");
		System.out.println("국어 | 영어 | 수학 | 합계 | 평균 | 학점");
		System.out.println("-----------------------------------------");
		System.out.printf("%d   | %d   | %d   | %d  | %.2f | %c%n", koreanScore, englishScore, mathScore, sum, average, grade);
		System.out.println("-----------------------------------------");
		
		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.println("---------------------강사님 코드---------------------------");
		int kor=0,eng=0,math=0,tot=0;
		System.out.println("학생성적관리프로그램(ver 0.1.0)");
		System.out.print("국어>");
		kor=sc.nextInt();
		System.out.print("영어>");
		eng=sc.nextInt();
		System.out.print("수학>");
		math=sc.nextInt();
		tot=kor+eng+math;
		
		double avg=tot*100/3/100.0;
		
		grade='A';
		
		if(tot>=90*3) {}
		else if(tot>=80*3) {grade='B';}
		else if(tot>=70*3) {grade='C';}
		else if(tot>=60*3) {grade='D';}
		else {grade='F';}
		
		grade='F';
		
		if(tot>=60*3) {grade-=2;}
		if(tot>=70*3) {grade-=1;}
		if(tot>=80*3) {grade-=1;}
		if(tot>=90*3) {grade-=1;}
		
		System.out.println("-----------------------------------------------");
		System.out.println("국어\t| 영어\t| 수학\t| 합계\t| 평균\t| 학점");
		System.out.println("-----------------------------------------------");
		System.out.println(kor+"\t"+eng+"\t"+math+"\t"+tot+"\t"+avg+"\t"+grade);
		System.out.println("-----------------------------------------------");
	}

}
