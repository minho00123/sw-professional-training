package com.am;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;

public class Ex01 {

	public static void main(String[] args) {
		Frame f = new Frame();
//		Frame f2 = new Frame();

		Toolkit kit = Toolkit.getDefaultToolkit();
//		kit.beep(); // 비프음을 들려줌
		Image img = kit.getImage("logo.png");
		f.setIconImage(img);
		System.out.println(kit.getScreenSize());
		int winW = kit.getScreenSize().width;
		int winH = kit.getScreenSize().height;

		Dimension dim = new Dimension(400, 300);
		f.setLocation(winW / 2 - dim.width / 2, winH / 2 - dim.height / 2);
		f.setSize(dim);
		f.setVisible(true);

//		f2.setLocation(100, 100);
//		f2.setSize(dim);
//		f2.setVisible(true);
	}

}
