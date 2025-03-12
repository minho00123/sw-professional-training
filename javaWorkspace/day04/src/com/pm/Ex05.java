package com.pm;
import java.util.Scanner;

/*
 * Q1.		Q2.		Q3.
 * ★		   A	1234
 * ★★		  BC	567
 * ★★★		 DEF	89
 * ★★★★		GHIJ	0
 */

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Q1.");
		System.out.print("갯수를 입력하세요:");
		int number = sc.nextInt();
		
		for (int i = 0; i < number; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
		System.out.println("----------------------------------------------------------");
		System.out.println("Q2.");
		int count = 65;
		for (int i = 0; i < number; i++) {
			for (int j = number - i; j > 1; j--) {
				System.out.print(" ");
			}
			
			int countK = 0;
			for (int k = count; k <= count + i; k++) {
				System.out.print((char) k);
				countK++;
			}
			count += countK;
			
			System.out.println();
		}
		
		System.out.println("----------------------------------------------------------");
		System.out.println("Q3.");
		int startNumber = 1;
		for (int i = 0; i < number; i++) {
			for (int j = number - i; j > 0; j--) {
				if (startNumber == 10) {
					startNumber = 0;
				}
				System.out.print(startNumber++);
			}
			
			for (int k = 0; k < i; k++) {
				System.out.print(" ");
			}
			
			System.out.println();
		}
		
		System.out.println("-------------강사님 코드----------------------");
		System.out.println("Q1.");
		for(int i=0; i<4; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				if(j<=i)System.out.print("★");
			}
			System.out.println();
		}
		System.out.println();
		int cnt=0, limit=1;
		for(int i=0; i<10; i++) {
			cnt++;
			if(cnt<limit) {
				System.out.print("★");
			}else if(cnt==limit) {
				System.out.print("★");
				cnt=0;
				limit++;
			}
		}
		System.out.println();
		
		System.out.println("----------------------------------");
		System.out.println("Q2.");
		char ch='A';
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				if(j<=i)System.out.print(" ");
				else {System.out.print((char)ch++);}
			}
			System.out.println();
		}
		System.out.println();
		
	}
}
