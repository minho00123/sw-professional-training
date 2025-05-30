package com.am;

public class Ex01 extends Thread {
	static int sum;
	int begin, end;

	public Ex01(int begin, int end) {
		this.begin = begin;
		this.end = end;
	}

	public static void main(String[] args) {
		// 1~1000
		// 1~500 - Thread 1
		// 501~1000 - Thread 2
		Ex01 me1 = new Ex01(1, 5000);
		Ex01 me2 = new Ex01(5001, 10000);
		me1.start();
		me2.start();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("sum=" + sum);
	}

	public static synchronized void hap(int a, int b) {
		for (int i = a; i <= b; i++) {
//			int temp = sum + i;
//			sum = temp;
			sum += i;
		}
	}

	public static synchronized void hap2(int a) {
		int temp = sum + a;
		sum = temp;
	}

	static Object key = new Object();

	public void hap3(int a, int b) {
		for (int i = a; i <= b; i++) {
			synchronized (key) {
//				int temp = sum + i;
//				sum = temp;
				sum += i;
			}
		}
	}

	@Override
	public void run() {
//		hap(begin, end);

//		for (int i = begin; i <= end; i++) {
//			hap2(i);
//		}

		hap3(begin, end);
	}
}
