package com.pm;

public class Ex18 {

	public static void main(String[] args) {
		java.util.Scanner sc;
		sc = new java.util.Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		
		System.out.println("학생성적관리프로그램(ver 0.9.0)");
		
		System.out.print("총원> ");
		int total = Integer.parseInt(sc.nextLine());
		int count = 0;
		
		while (true) {
			System.out.print("1.보기 2.입력 3.수정 4.삭제 0.종료> ");
			String input = sc.nextLine();
			if (input.equals("0")) break;
			if (input.equals("1")) {
				System.out.println("-----------------------------------------------");
				System.out.println("학번\t국어\t영어\t수학\t합계\t평균");
				System.out.println("-----------------------------------------------");
				System.out.println(sb);
			}
			if (input.equals("2")&&count < total) {
				sb.append(count++ + "\t");
				System.out.print("국어> ");
				int kor = Integer.parseInt(sc.nextLine());
				sb.append(kor + "\t");
				System.out.print("영어> ");
				int eng = Integer.parseInt(sc.nextLine());
				sb.append(eng + "\t");
				System.out.print("수학> ");
				int math = Integer.parseInt(sc.nextLine());
				sb.append(math + "\t");
				int sum = kor + eng + math;
				sb.append(sum + "\t");
				double avg = sum * 100 / 3 / 100.0;
				sb.append(avg + "\n");
			}
			if (input.equals("3")) {
				System.out.print("학번> ");
				String id = sc.nextLine();
				String[] arr = new String[count];
				
				int idx = 0;
				int updateIdx = 0;
				boolean hasId = false;
				for (int i = 0; i < count; i++) {
					arr[i] = sb.substring(idx, sb.indexOf("\n", idx) + 1);

					if (sb.substring(idx, sb.indexOf("\t", idx)).equals(id)) {
						hasId = true;
						updateIdx = idx;
					}
					idx = sb.indexOf("\n", idx) + 1;
				}
				
				if (!hasId) {
					System.out.println("수정할 학번이 없습니다.");
				} else {
					StringBuffer temp = new StringBuffer();
					temp.append(id + "\t");
					System.out.print("국어> ");
					int kor = Integer.parseInt(sc.nextLine());
					temp.append(kor + "\t");
					System.out.print("영어> ");
					int eng = Integer.parseInt(sc.nextLine());
					temp.append(eng + "\t");
					System.out.print("수학> ");
					int math = Integer.parseInt(sc.nextLine());
					temp.append(math + "\t");
					int sum = kor + eng + math;
					temp.append(sum + "\t");
					double avg = sum * 100 / 3 / 100.0;
					temp.append(avg + "\n");
					
					sb.replace(updateIdx, sb.indexOf("\n", updateIdx) + 1, temp.toString());
				}
			}
			if (input.equals("4")) {
				System.out.print("학번> ");
				String id = sc.nextLine();
				String[] arr = new String[count];
				
				int idx = 0;
				int updateIdx = 0;
				boolean hasId = false;
				for (int i = 0; i < count; i++) {
					arr[i] = sb.substring(idx, sb.indexOf("\n", idx) + 1);
					if (sb.substring(idx, sb.indexOf("\t", idx)).equals(id)) {
						hasId = true;
						updateIdx = idx;
					}
					idx = sb.indexOf("\n", idx) + 1;
				}
				
				if (!hasId) {
					System.out.println("수정할 학번이 없습니다.");
				} else {					
					sb.replace(updateIdx, sb.indexOf("\n", updateIdx) + 1, "");
				}
			}
		}

	}

}
