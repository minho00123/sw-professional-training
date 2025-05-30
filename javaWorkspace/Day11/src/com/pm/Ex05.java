package com.pm;

public class Ex05 {
	
	static class UserErr extends Exception{
		public UserErr() {
			super("su가 1 or 2 or 5 or 10만 가능");
		}
		public UserErr(String msg) {
			super(msg);
		}
	}

	public static int func01(int su) throws UserErr{
//		if(!(su==1||su==2||su==5||su==10)) return 0;  <- 국내 버전
		if(!(su==1||su==2||su==5||su==10))
			throw new UserErr("su가 "+su+"이므로 안됨"); // <- 해외 버전
		return 10/su;
	}// su 1 2 5 10
	
	public static void main(String[] args) {
		java.util.Scanner sc;
		sc=new java.util.Scanner(System.in);
		int input=sc.nextInt();
		try {
			int su=func01(input);
			System.out.println(su);
		}catch(UserErr e) {
			e.printStackTrace();
			// System.out.println("입력오류");
		}
//		if(su==0) System.out.println("입력오류");
	}

}
