package com.am;

public class Ex13 {

	public static void main(String[] args) {
		// �л������� �Է¹ް� ������ ������ ����Ͻÿ�
		
		// ������ �� 3�������� ����,����,����
		// �� ������ ������ 100��
		
		// �հ�� ����� ���ϵ� ����� �Ҽ� ��°�ڸ� ������ ���
		// ������ A���� F����
		// A:90�̻�, B:80�̻�, C:70�̻�, D:60�̻�, F:60�̸�
		
		// �л������������α׷�(ver 0.1.0)
		// ����> 90
		// ����> 78
		// ����> 89
		// -----------------------------------------
		// ���� | ���� | ���� | �հ� | ��� | ����
		// -----------------------------------------
		// 90   | 78   | 89   | 000  | 00.00| B
		// -----------------------------------------

		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.println("�л������������α׷�(ver 0.1.0)");
		System.out.print("����> ");
		int koreanScore = sc.nextInt();
		System.out.print("����> ");
		int englishScore = sc.nextInt();
		System.out.print("����> ");
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
		System.out.println("���� | ���� | ���� | �հ� | ��� | ����");
		System.out.println("-----------------------------------------");
		System.out.printf("%d   | %d   | %d   | %d  | %.2f | %c%n", koreanScore, englishScore, mathScore, sum, average, grade);
		System.out.println("-----------------------------------------");
		
		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.println("---------------------����� �ڵ�---------------------------");
		int kor=0,eng=0,math=0,tot=0;
		System.out.println("�л������������α׷�(ver 0.1.0)");
		System.out.print("����>");
		kor=sc.nextInt();
		System.out.print("����>");
		eng=sc.nextInt();
		System.out.print("����>");
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
		System.out.println("����\t| ����\t| ����\t| �հ�\t| ���\t| ����");
		System.out.println("-----------------------------------------------");
		System.out.println(kor+"\t"+eng+"\t"+math+"\t"+tot+"\t"+avg+"\t"+grade);
		System.out.println("-----------------------------------------------");
	}

}
