package com.am;

public class Ex11 {
	public static int speed=0;
	public static int max=0;
	public static void speedUp() {
		if(speed+15>max) {
			speed=150;
		} else {
			speed+=10;
		}
	}
	public static void speedDown() {
		if (speed-20<0) {
			speed=0;
		} else {
			speed-=10;
		}
	}
	
	public static void showSpeed() {
		System.out.println("현재속도는 "+speed+"km 입니다");
	}

	public static void main(String[] args) {
		System.out.println("아반떼 타고");
		max=150;
		showSpeed();
		for (int i=0; i < 30; i++) {
			speedUp();
			showSpeed();
		}
		
		for (int i=0; i < 30; i++) {
			speedDown();
			showSpeed();
		}
		
		System.out.println("소나타 타고");
		max=180;
		showSpeed();
		for (int i=0; i < 30; i++) {
			speedUp();
			showSpeed();
		}
		
		for (int i=0; i < 30; i++) {
			speedDown();
			showSpeed();
		}
	}

}
