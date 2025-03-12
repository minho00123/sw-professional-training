class Ex13 {

	public static void main(String[] args) {
		/*
		 * while 반복문
		 * while(조건){실행문;}
		 */
		 System.out.println("before...");
		 int su = 5;
		 while (su > 0) {
			System.out.println("su = " + su--);
		 }
		 System.out.println("after...");
		 
		/*
		 * do while 반복문
		 * do{실행문;}while(조건);
		 * 단, 한 번의 실행은 보장
		 */
		 do {
			System.out.println("su = " + su--);
		 } while (su > 0);
	}

}