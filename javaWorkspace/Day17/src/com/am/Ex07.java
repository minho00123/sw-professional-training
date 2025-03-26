package com.am;

import java.io.File;
import java.io.IOException;

public class Ex07 {

	public static void main(String[] args) {
		File file = new File("abcdefg.txt");

		try {
			File temp = file.createTempFile("AAAAAAAAAAA", "BBBBBBBBBB");
			System.out.println(temp.getAbsolutePath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
