package com.pm;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// 100일 계산 프로그램
		// 날짜를 입력받고 100일을 알려주는 프로그램
		Scanner sc = new Scanner(System.in);

//		System.out.println("100일 계산 프로그램");
//		System.out.print("년도(0000)> ");
//		int inputYear = sc.nextInt();
//		System.out.print("월> ");
//		int inputMonth = sc.nextInt();
//		System.out.print("일> ");
//		int inputDate = sc.nextInt();
//		Date date = new Date();
//		date.setYear(inputYear - 1900);
//		date.setMonth(inputMonth - 1);
//		date.setDate(inputDate + 100);
//		System.out.println(
//				"100일 후 날짜는 " + (date.getYear() + 1900) + "년 " + date.getMonth() + "월 " + (date.getDate()) + "일 입니다.");
//
//		System.out.println(
//				"--------------------------------------------------------------------------------------------------------------");
//		System.out.println("강사님 코드");

//		System.out.print("년>");
//		int y = sc.nextInt();
//		System.out.print("월>");
//		int m = sc.nextInt();
//		System.out.print("일>");
//		int d = sc.nextInt();
		System.out.print("년.월.일>");
		String input = sc.nextLine();
//		input = input.replace(".", "");
		String[] arr = input.split("\\.");
		int y = Integer.parseInt(arr[0]);
		int m = Integer.parseInt(arr[1]);
		int d = Integer.parseInt(arr[2]);

//		GregorianCalendar gc = new GregorianCalendar(y, m - 1, d);
//		gc.add(GregorianCalendar.DATE, 100);

		Date date1 = new Date(y - 1900, m - 1, d);
		long after = date1.getTime() + 100 * 24 * 60 * 60 * 1000L;
		date1.setTime(after);

		SimpleDateFormat sdf = new SimpleDateFormat("yy.MM.dd");

//		String msg = sdf.format(gc.getTime());
		String msg = sdf.format(date1);
		System.out.println(msg);
	}

}
