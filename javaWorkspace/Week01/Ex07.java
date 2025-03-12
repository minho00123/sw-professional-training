class Ex07 {

	public static void main(String[] args) {
		int su1;
		su1 = 1;
		System.out.println(su1);
		su1++; // su1 = su1 + 1;
		System.out.println(su1);
		++su1; // su1 = su1 + 1;
		System.out.println(su1);
		
		int su2;
		su2 = 1;
		System.out.println(su2);
		System.out.println(su2++);
		System.out.println(su2);
		
		byte su = 0;
		su++;
		System.out.println(su);
		su++;
		System.out.println(su);
		su++;
		System.out.println(su);
		
		//byte su = 0;
		//su = su + 1; // 에러 발생
		//su = su + (byte) 1; // 에러 발생
		
		byte su3 = 127, su4 = 1;
		System.out.println(su3 + su4); // 128; 우리가 사용하는 시스템은 int로 연산을 수행하므로 -128이 안나옴.
		
		byte su5 = 127;
		su5++; // 증감 연산자는 비트의 증감을 이용
		System.out.println(su5); // -128
		
		/*
		 내부는
		 주석
		 입니다.
		 
		 유니코드 문법은 주석보다 먼저 실행됩니다
		 따라서 주석 안에 유니코드 문법 사용은 불가합니다(\\u 불가)
		 */
	}

}