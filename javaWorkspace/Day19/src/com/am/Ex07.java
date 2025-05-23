package com.am;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Ex07 extends Frame implements ActionListener {
	static int[] winningNumbers = new int[6];

	public Ex07() {
		Panel mainPanel = new Panel();
		Panel numbersPanel = new Panel();
		Panel buttonPanel = new Panel();
		Button startButton = new Button("Start");
		Label number1 = new Label();
		Label number2 = new Label();
		Label number3 = new Label();
		Label number4 = new Label();
		Label number5 = new Label();
		Label number6 = new Label();
		
		startButton.addActionListener(this);
		System.out.println(Arrays.toString(winningNumbers));
		if (winningNumbers[0] != 0) {
			number1.setText(winningNumbers[0] + "");
			number2.setText(winningNumbers[1] + "");
			number3.setText(winningNumbers[2] + "");
			number4.setText(winningNumbers[3] + "");
			number5.setText(winningNumbers[4] + "");
			number6.setText(winningNumbers[5] + "");
		}

		numbersPanel.add(number1);
		numbersPanel.add(number2);
		numbersPanel.add(number3);
		numbersPanel.add(number4);
		numbersPanel.add(number5);
		numbersPanel.add(number6);
		buttonPanel.add(startButton);
		mainPanel.setLayout(new BorderLayout());
		mainPanel.add(numbersPanel, BorderLayout.CENTER);
		mainPanel.add(buttonPanel, BorderLayout.SOUTH);
		add(mainPanel);
		setBounds(100, 100, 500, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex07();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Set<Integer> set = new TreeSet<>();
		Random randomNumberGenerator = new Random();

		for (int i = 0; i < 6; i++) {
			int randomNumber = randomNumberGenerator.nextInt(45) + 1;
			if (set.contains(randomNumber)) {
				i--;
			} else {
				set.add(randomNumber);
			}
		}

		Iterator<Integer> setIterator = set.iterator();
		int i = 0;
		while (setIterator.hasNext()) {
			int number = setIterator.next();
			winningNumbers[i] = number;
			i++;
		}

	}

}
