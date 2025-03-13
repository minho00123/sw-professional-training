package com.pm;

/*
 * �л������������α׷�(ver 0.2.0) - �迭
 * 
 * 3����(����,����,����)
 * �ѿ�>3
 * 1. �Է� 2.��� 0.����> 1
 * ����> 
 * ����> 
 * ����> 
 * 1. �Է� 2.��� (3.���� 4.����) 0.����> 2
 * ------------------------------------------------------------
 * �й� |����	|����	|����	|�հ�	|���
 * ------------------------------------------------------------
 * 1	|90		|91		|92		|000	|000
 * 
 * 1. �Է� 2.��� 0.����> 1
 * ����> 
 * ����> 
 * ����> 
 * 1. �Է� 2.��� 0.����> 2
 * ------------------------------------------------------------
 * �й� |����	|����	|����	|�հ�	|���
 * ------------------------------------------------------------
 * 1	|90		|91		|92		|000	|000
 * 2	|90		|91		|92		|000	|000
 * 
 */

public class StudentGradeManagementProgramVer2 {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("�л������������α׷�(ver 0.2.0)");
//		System.out.print("�ѿ�> ");
//		int total = sc.nextInt();
		int count = 0;
		int[][] gradeData = new int[count][4];

		while(true) {
			System.out.print("1. �Է� 2.��� 3.���� 4.���� 0.����> ");
			int input = sc.nextInt();

			switch (input) {
				case 1:
//					if (count == total) {
//						System.out.println("�Է��� ������ �����ϴ�.");
//						break;
//					}

					count++;
					int[][] temp = new int[count][4];
					
					for (int i = 0; i < gradeData.length; i++) {
						temp[i] = gradeData[i];
					}
					
					System.out.print("�й�> ");
					temp[count - 1][0] = sc.nextInt();
					System.out.print("����> ");
					temp[count - 1][1] = sc.nextInt();
					System.out.print("����> ");
					temp[count - 1][2] = sc.nextInt();
					System.out.print("����> ");
					temp[count - 1][3] = sc.nextInt();
					
					gradeData = temp;

					break;
				case 2:
					System.out.println("--------------------------------------------------");
					System.out.println("�й�\t|����\t|����\t|����\t|�հ�\t|���");
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
						System.out.println("������ �����Ͱ� �����ϴ�.");
						break;
					}
				
					System.out.print("������ �й�> ");
					int updateId = sc.nextInt();
					int updateIndex = -1;
					
					for (int i = 0; i < count; i++) {
						if (gradeData[i][0] == updateId) {
							updateIndex = i;
						}
					}
					
					if (updateIndex == -1) {
						System.out.println("������ �й��� �����ϴ�.");
						break;
					}
					
					System.out.print("����> ");
					gradeData[updateIndex][1] = sc.nextInt();
					System.out.print("����> ");
					gradeData[updateIndex][2] = sc.nextInt();
					System.out.print("����> ");
					gradeData[updateIndex][3] = sc.nextInt();

					break;
				case 4:
					if (count == 0) {
						System.out.println("������ �����Ͱ� �����ϴ�.");
						break;
					}
					
					System.out.print("������ �й�> ");
					int deleteId = sc.nextInt();
					int deleteIndex = -1;
					
					for (int i = 0; i < count; i++) {
						if (gradeData[i][0] == deleteId) {
							deleteIndex = i;
						}
					}
					
					if (deleteIndex == -1) {
						System.out.println("������ �й��� �����ϴ�.");
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
					System.out.println("���α׷��� �����մϴ�.");
					return;
				default:
					System.out.println("�ùٸ� ���ڸ� �Է��ϼ���.");
			}
		}
	}

}
