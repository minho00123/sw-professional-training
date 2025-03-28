package com.pm;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Ex01 extends Frame {
	private static final long serialVersionUID = 1L;

	public Ex01() {
		setLayout(new BorderLayout());
		Panel p1 = new Panel();
		Panel p2 = new Panel();
		Panel p3 = new Panel();
		p1.setLayout(new GridLayout(1, 6));
		Button btn = new Button("6°³ »Ì±â");
		p2.add(btn);
		JLabel[] btns = new JLabel[45];

		for (int i = 0; i < btns.length; i++) {
			btns[i] = new JLabel();
			Icon icon = new ImageIcon("numbers1_45/ball_" + (i + 1) + ".png");
			btns[i].setIcon(icon);
		}
		// 0~44
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				p1.removeAll();
//				while(p1.getComponents().length!=0) p1.remove(0);
				Random ran = new Random();
				Set<Integer> set = new TreeSet<>();
				while (set.size() < 6) {
					int su = ran.nextInt(45);
					set.add(su);
				}
				Iterator<Integer> ite = set.iterator();
				while (ite.hasNext()) {
					p1.add(btns[ite.next()]);
				}
				revalidate();
			}
		});
		add(p1, BorderLayout.CENTER);
		add(p2, BorderLayout.SOUTH);
		setBounds(100, 100, 400, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
