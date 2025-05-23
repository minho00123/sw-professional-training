package com.am;

public class Ex02 implements Runnable {
	static int sum;

	public static void main(String[] args) {
		// 1~1000
		// 1~500 - Thread 1
		// 501~1000 - Thread 2
		Ex02 me = new Ex02();

		Thread me1 = new Thread(me, "me1");
		Thread me2 = new Thread(me, "me2");

		me1.start();
		me2.start();

		try {
			me1.join(); // me1 끝나기전까지 lock
			me2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("sum=" + sum);
	}

	public void hap(int a, int b) {
		for (int i = a; i <= b; i++) {
			synchronized (this) {
				sum += i;
			}
		}
	}

	@Override
	public void run() {
		Thread thr = Thread.currentThread();
		if (thr.getName().equals("me1")) {
			hap(1, 500);
		} else if (thr.getName().equals("me2")) {
			hap(501, 1000);
		}
	}
}
