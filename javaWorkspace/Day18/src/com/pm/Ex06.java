package com.pm;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;

public class Ex06 {

	// 문자열스트림 2byte 체계
	public static void main(String[] args) {
		File file = new File("data06.txt");

		java.io.Writer fw = null;
		java.io.BufferedWriter bw = null;
//		OutputStream os = null;
		try {
			file.createNewFile();
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
//			os = new FileOutputStream(file);

//			os.write('A');
//			os.write('한');
//			fw.write('A');
//			fw.write('한');
//			bw.write('A');
//			bw.write('한');
			bw.write("hello world");
			bw.newLine();
			bw.write("hello world");
			bw.newLine();
			bw.write("hello world");

			bw.close();
			fw.close();
//			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
