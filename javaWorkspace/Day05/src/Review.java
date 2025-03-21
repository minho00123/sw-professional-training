/*
 * Q1. 구구단 출력(포멧을 그림처럼)
 * 
 * Q2.
 * A
 * BC
 * DEF
 * GHIJ
 * 
 * Q3. 가위 바위 보 게임(ver 0.1.0)
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
import java.util.Scanner;

public class Review {

	public static void main(String[] args) {
		System.out.println("Q1.");
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.print(j+"x"+i+"= ");
			}
			System.out.println();
		}
		
		System.out.println("---------------------------------------------");
		System.out.println("Q2.");
		char c = 'A';
		for (char i = 0; i < 4; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print((char) (c++));
			}
			System.out.println();
		}
		
		System.out.println("---------------------------------------------");
		System.out.println("Q3.");
		int winCount = 0;
		int drawCount = 0;
		int loseCount = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-------------------------------");
		System.out.println("가위 바위 보 게임(ver 0.1.0)");
		System.out.println("-------------------------------");
		
		while (true) {
			System.out.print("가위(1),바위(2),보(3),종료(0)>");
			int userInput = sc.nextInt();
			int compValue = (int) (Math.random() * 3 + 1);

			switch (userInput) {
				case 1:
					if (compValue == 3) {
						System.out.println("당신:가위	컴퓨터:보");
						System.out.println("이겼습니다");
						winCount++;
					} else if (compValue == 1) {
						System.out.println("당신:가위	컴퓨터:가위");
						System.out.println("비겼습니다");
						drawCount++;
					} else if (compValue == 2) {
						System.out.println("당신:가위	컴퓨터:바위");
						System.out.println("졌습니다");
						loseCount++;
					}
					break;
				case 2:
					if (compValue == 1) {
						System.out.println("당신:바위	컴퓨터:가위");
						System.out.println("이겼습니다");
						winCount++;
					} else if (compValue == 2) {
						System.out.println("당신:바위	컴퓨터:바위");
						System.out.println("비겼습니다");
						drawCount++;
					} else if (compValue == 3) {
						System.out.println("당신:바위	컴퓨터:보");
						System.out.println("졌습니다");
						loseCount++;
					}
					break;
				case 3:
					if (compValue == 2) {
						System.out.println("당신:보	컴퓨터:바위");
						System.out.println("이겼습니다");
						winCount++;
					} else if (compValue == 3) {
						System.out.println("당신:보	컴퓨터:보");
						System.out.println("비겼습니다");
						drawCount++;
					} else if (compValue == 1) {
						System.out.println("당신:보	컴퓨터:가위");
						System.out.println("졌습니다");
						loseCount++;
					}
					break;
				case 0:
					System.out.println("누적 승률");
					System.out.println(winCount+"승 "+drawCount+"무 "+loseCount+"패");
					System.out.println("이용해주셔서 감사합니다");
					return;
				default:
					System.out.println("올바른 숫자를 입력해주세요");
			}
		}
	}

}
