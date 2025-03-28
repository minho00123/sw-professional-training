package com.pm;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ex02 {

	public static void main(String[] args) {
		GregorianCalendar cal = null;
		cal = new GregorianCalendar(2002, 4, 1, 1, 2, 3);
		cal.add(GregorianCalendar.HOUR_OF_DAY, -23);
		System.out.println(cal.get(GregorianCalendar.YEAR));
		System.out.println(cal.get(GregorianCalendar.MONTH) + 1 + "월");
		System.out.println(cal.get(GregorianCalendar.DAY_OF_MONTH) + "일");
		System.out.println(cal.get(GregorianCalendar.DATE) + "일");
		System.out.println(cal.get(GregorianCalendar.HOUR_OF_DAY) + "시");
		System.out.println(cal.get(GregorianCalendar.MINUTE) + "분");
		System.out.println(cal.get(GregorianCalendar.SECOND) + "초");
	}

}
