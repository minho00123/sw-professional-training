package com.am;

import java.io.File;

public class Ex04 {

	public static void main(String[] args) {
		File file = new File("dir03");
		
		boolean result = file.delete();
		System.out.println(result);
	}

}
