package com.am;

import javax.swing.JFrame;

public class Ex07 extends JFrame {

	public Ex07() {
//		addWindowListener(new Ex06.MyListener());
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // 아무일 안함
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); // 화면에 안나옴
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // dispose()
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 강제 종료

		this.setBounds(100, 100, 300, 200);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Ex07();
	}

}
