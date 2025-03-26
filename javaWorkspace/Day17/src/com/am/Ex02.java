package com.am;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("폴더명을 입력해주세요");
		String folderName = sc.nextLine();
		File folder = new File(folderName);

		if (!folder.exists()) {
			System.out.println("폴더가 존재하지 않습니다.");
		}

		String[] fileList = folder.list();

		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd a HH:mm");

		long currentFolderTime = folder.lastModified();
		Date modifiedCurrentFolderTime = new Date(currentFolderTime);
		String formattedCurrentFolderTime = format.format(modifiedCurrentFolderTime);
		System.out.println(formattedCurrentFolderTime + "\t<DIR>\t" + ".");

		File parentFolder = new File("../" + folderName);
		long parentFolderTime = parentFolder.lastModified();
		Date modifiedParentFolderTime = new Date(parentFolderTime);
		String formattedParentFolderTime = format.format(modifiedParentFolderTime);
		System.out.println(formattedParentFolderTime + "\t<DIR>\t" + "..");

		int fileCount = 0;
		int directoryCount = 0;
		for (int i = 0; i < fileList.length; i++) {
			File file = new File(fileList[i]);
			if (file.isFile()) {
				fileCount++;
			} else if (file.isDirectory()) {
				directoryCount++;
			}
			long time = file.lastModified();
			Date modifiedTime = new Date(time);
			String formattedTime = format.format(modifiedTime);

			System.out.printf("%s\t%s\t%s%n", formattedTime, file.isDirectory() ? "<DIR>" : "     ",
					file.getName());
		}
		
		System.out.println("\t\t" + fileCount + "개 파일");
		System.out.println("\t\t" + directoryCount + "개 디렉터리");
		

	}

}
