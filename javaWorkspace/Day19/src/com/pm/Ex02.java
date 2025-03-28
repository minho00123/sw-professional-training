package com.pm;

import java.awt.Frame;
import java.awt.GridLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Ex02 extends Frame {
	
	public Ex02() {
		setLayout(new GridLayout());
		JLabel[] btns = new JLabel[45];
		for (int i = 0; i < btns.length; i++) {
			btns[i] = new JLabel();
			Icon icon = new ImageIcon("numbers1_45/ball_" + (i + 1) + ".png");
			btns[i].setIcon(icon);
			add(btns[i]);
		}
		
		setBounds(100, 100, 600, 100);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex02();
	}

}
