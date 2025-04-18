package com.pm;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class Ex05 {

	public static void main(String[] args) {
		PrintStream ps2 = System.out;
		File file = new File("data05.txt");
		OutputStream os = null;
		// outputStream만 존재
		PrintStream ps = null;
		try {
			file.createNewFile();
			os = new FileOutputStream(file);
			ps = new PrintStream(os);

			ps.write('A');
			ps.print(1234);
			ps.print(3.14);
			ps.println("hello world");
			ps.println("hello world");
			ps.println("한글");
			ps.println("hello world");
			ps.println(97);

			ps.close();
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
