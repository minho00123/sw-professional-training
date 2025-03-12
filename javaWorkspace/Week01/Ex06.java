class Ex06 {

	public static void main(String[] args) {
		int a;
		a = 1;
		double b;
		b = 3.14;
		char c;
		c = '@';
		boolean d = true;
		
		System.out.println("default 정수타입: " + a);
		System.out.println("default 실수타입: " + b);
		System.out.println("default 문자타입: " + c);
		System.out.println("default 불린타입: " + d);
		
		
		
		System.out.println("10진수 정수");
		byte e,x;
		e = 127;
		short f = 1;
		f = e;
		f = 128;
		x = (byte) f;
		long g = 1L;
		
		System.out.println("10진수 실수");
		float h = 0.1F;
		
		System.out.println("128 -> " + x);
		System.out.println((long) 3.14); // 3
		System.out.println((int) 2147483647L);
		System.out.println((int) 2147483648L);
		// System.out.println((long) 2147483648); // 오류!
		System.out.println((long) 2147483648L);
		
		System.out.println((char) 65); // A
		System.out.println((int) 'a'); // 97
		//short su1 = 65;
		//char ch2 = 'a';
		//ch2 = su1;
		
		//int i = 65;
		//char ch3 = 'a';
		//ch3 = i;
		//System.out.println(ch3);
		
		int su2 = 65;
		char ch4 = 'a';
		su2 = ch4;
		System.out.println(su2);
		
		System.out.println(1 + 1.0); // int가 double로 자동 형변환
		System.out.println(5 / 2); // 2
		System.out.println(5 / 2.0); //  2.5
		
		
	}
}
