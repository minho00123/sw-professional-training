package com.pm;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex01 {

	// Filter Stream
	//

	public static void main(String[] args) {
		File file = new File("video01.mp4");
		File copy = new File("copy01.mp4");
		InputStream is = null;
		OutputStream os = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		byte[] buf = new byte[2];
		try {
			copy.createNewFile();
			is = new FileInputStream(file);
			os = new FileOutputStream(copy);
			bis = new BufferedInputStream(is);
			bos = new BufferedOutputStream(os);

			long before = System.currentTimeMillis();
			long cnt = 0;
			while (true) {
				int su = bis.read(buf);
				if (su == -1)
					break;
				bos.write(buf, 0, su);
				cnt++;
			}
			long after = System.currentTimeMillis();
			System.out.println("복사끝:" + (after - before) + "ms");
			System.out.println("복사끝:" + cnt);

			bis.close();
			bos.close();
			is.close();
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
