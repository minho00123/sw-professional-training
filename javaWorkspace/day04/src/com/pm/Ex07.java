package com.pm;
import java.util.Scanner;

/*
 * Q5.
 * -----------------------------------
 * 가위 바위 보 게임(ver 0.1.0)
 * -----------------------------------
 * 가위(1),바위(2),보(3),종료(0)> 1
 * 당신:가위		컴퓨터:바위
 * 졌습니다
 * 
 * 가위(1),바위(2),보(3),종료(0)> 1
 * 당신:가위		컴퓨터:보
 * 이겼습니다
 * 
 * 가위(1),바위(2),보(3),종료(0)> 0
 * 누적 승률
 * 1승 0무 1패
 * 이용해주셔서 감사합니다
 */

public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Q5.");
		System.out.println("--------------------------------------");
		System.out.println("가위 바위 보 게임(ver 0.1.0)");
		System.out.println("--------------------------------------");
		int operationNumber;
		int winCount = 0;
		int loseCount = 0;
		int drawCount = 0;

		do {
			System.out.print("가위(1),바위(2),보(3),종료(0)> ");
			operationNumber = sc.nextInt();
			
			switch (operationNumber) {
				case 1:
					int result = decideWinner(1);
					if (result == 0) {
						loseCount++;
						System.out.println("당신:가위    컴퓨터:바위");
						System.out.println("졌습니다.");
					} else if (result == 1) {
						drawCount++;
						System.out.println("당신:가위    컴퓨터:가위");
						System.out.println("비겼습니다.");
					} else if (result == 2) {
						winCount++;
						System.out.println("당신:가위    컴퓨터:보");
						System.out.println("이겼습니다.");
					}
					break;
				case 2:
					result = decideWinner(2);
					if (result == 0) {
						loseCount++;
						System.out.println("당신:바위    컴퓨터:보");
						System.out.println("졌습니다.");
					} else if (result == 1) {
						drawCount++;
						System.out.println("당신:바위    컴퓨터:바위");
						System.out.println("비겼습니다.");
					} else if (result == 2) {
						winCount++;
						System.out.println("당신:바위    컴퓨터:가위");
						System.out.println("이겼습니다.");
					}
					break;
				case 3:
					result = decideWinner(3);
					if (result == 0) {
						loseCount++;
						System.out.println("당신:보    컴퓨터:가위");
						System.out.println("졌습니다.");
					} else if (result == 1) {
						drawCount++;
						System.out.println("당신:보    컴퓨터:보");
						System.out.println("비겼습니다.");
					} else if (result == 2) {
						winCount++;
						System.out.println("당신:보    컴퓨터:바위");
						System.out.println("이겼습니다.");
					}
					break;
				case 0:
					System.out.println("누적 승률");
					System.out.printf("%d승 %d무 %d패%n", winCount, drawCount, loseCount);
					System.out.println("이용해주셔서 감사합니다");
					break;
				default:
					System.out.println("올바른 숫자를 입력하세요.");
			}
		} while (operationNumber != 0);
		
		
		System.out.println("----------------------- 강사님 코드 --------------------");
		String title="--------------------------------------\r\n" + 
				"가위 바위 보 게임(ver 0.1.0)\r\n" + 
				"--------------------------------------";
		String menu="가위(1),바위(2),보(3),종료(0)> ";
		int a=0,b=0,c=0;
		boolean boo=true,boo2=true;
//		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println(title);
		while(boo) {
		System.out.print(menu);
			int input=sc.nextInt();
			int com=0;
			while(boo2) {
				double ran=Math.random();
				com=(int)(ran*10);
				if(com==1||com==2||com==3) {
					boo2=false;
				}
			}
			boo2=true;
			System.out.println("com="+com);
			if(input==0) {boo=false;}
			if(input==1) {
				System.out.print("당신:가위	");
			}
			if(input==2) {
				System.out.print("당신:바위	");
			}
			if(input==3) {
				System.out.print("당신:보	");
			}
			if(com==1) {
				System.out.println("com:가위	");
			}
			if(com==2) {
				System.out.println("com:바위	");
			}
			if(com==3) {
				System.out.println("com:보	");
			}
			if(input==com) {
				b++;
				System.out.println("비겼음");
			}else if(input==1&&com==3||input==2&&com==1||input==3&&com==2){
				a++;
				System.out.println("이겼음");
			}else{
				c++;
				System.out.println("졌음");
			}
			
		}
		System.out.println(a+"승 "+b+"무 "+c+"패");
		System.out.println("이용해주셔서 감사합니다");
	}

	public static int getComputerNumber() {
		// int r = (int)(Math.random()*3+1);
		return (int) Math.ceil(Math.random()*3);
	}
	
	public static int decideWinner(int user) {
		int computer = getComputerNumber();
		if (user == 1) {
			if (computer == 2) {
				return 0;
			} else if (computer == 3) {
				return 2;
			}
		} else if (user == 2) {
			if (computer == 1) {
				return 2;
			} else if (computer == 3) {
				return 0;
			}
		} else if (user == 3) {
			if (computer == 1) {
				return 0;
			} else if (computer == 2) {
				return 2;
			}
		}
		
		return 1;
	}
}
