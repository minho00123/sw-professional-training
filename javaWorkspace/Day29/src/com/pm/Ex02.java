package com.pm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex02 {

	public static void main(String[] args) throws IOException {
//		"c:\\windows\\system32\\cmd.exe /c vagrant init hashicorp-education/ubuntu-24-04 --box-version 0.1.0"
		Process proc = Runtime.getRuntime().exec("c:\\windows\\system32\\cmd.exe /c vagrant up");
		BufferedReader br = new BufferedReader(new InputStreamReader(proc.getInputStream()));
		String msg = null;
		while ((msg = br.readLine()) != null) {
			System.out.println(msg);
		}
	}

}
