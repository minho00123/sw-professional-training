package com.am;

public class Ex06 {

	public static void main(String[] args) {
		char ch='A';
		for(int j=0; j<4; j++) {
			for(int i=0; i<j+1; i++) {
				System.out.print((char)ch++);
			}
			System.out.println();
		}

	}

}
