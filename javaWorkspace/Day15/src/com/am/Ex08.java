package com.am;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.JButton;

public class Ex08 {

	public static void main(String[] args) {
		Frame f = new Frame();
		f.setLayout(new FlowLayout());
		Font font = new Font(Font.MONOSPACED, Font.ITALIC, 50);
//		Color c = Color.GREEN;
		Color c = new Color(0, 0, 255);
		Color c2 = new Color(255, 0, 0);

		Button btn1 = new Button();
//		JButton btn1 = new JButton();
		btn1.setLabel("����");
		btn1.setFont(font);
//		btn1.setBackground(c);
//		btn1.setForeground(c2);
//		btn1.setIcon(defaultIcon);
//		btn1.setSize(500, 300);
//		btn1.setLocation(500, 300);
//		btn1.setEnabled(false);
		btn1.setVisible(false);
		System.out.println(btn1.getLabel());
		f.add(btn1);

		f.setTitle("����");
		f.setLocation(100, 100);
		f.setSize(300, 200);
		f.setVisible(true);
	}

}
