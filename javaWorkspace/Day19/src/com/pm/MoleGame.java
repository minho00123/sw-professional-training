package com.pm;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class MoleGame extends Frame {
	static int timeRemained = 30;
	static int score = 0;

	public MoleGame() {
		Panel topPanel = new Panel();
		Panel gameBoardPanel = new Panel();
		Panel startEndButtonPanel = new Panel();

		Label titleLabel = new Label("두더지 게임 ver.0.1.0");

		gameBoardPanel.setLayout(new GridLayout(4, 4));

		JButton[] buttons = new JButton[16];
		for (int i = 0; i < 16; i++) {
			buttons[i] = new JButton();
			gameBoardPanel.add(buttons[i]);
		}

		startEndButtonPanel.setLayout(new GridLayout(2, 1));
		Button startButton = new Button("시작");
		startButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Thread thread1 = new Thread(new Runnable() {

					@Override
					public void run() {
						Label scoreLabel = new Label("점수: " + score);
						topPanel.add(scoreLabel);
						System.out.println(score);
						Label time = new Label(timeRemained + "초");
						topPanel.add(time);
						while (timeRemained >= 0) {
							scoreLabel.setText("점수: " + score);
							time.setText(timeRemained + "초");
							Random randomNumberGenerator = new Random();
							int randomNumber = randomNumberGenerator.nextInt(16);
							Icon moleImage = new ImageIcon("mole.jpeg");
							buttons[randomNumber].setActionCommand("clicked");
							buttons[randomNumber].setIcon(moleImage);
							buttons[randomNumber].addActionListener(new ActionListener() {

								@Override
								public void actionPerformed(ActionEvent e) {
									if (buttons[randomNumber].getActionCommand().equals("clicked")) {
										buttons[randomNumber].setIcon(null);
										score++;
									}
								}
							});

							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							timeRemained--;
						}
					}
				});
				thread1.start();
			}
		});
		Button endButton = new Button("종료");
		endButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

		startEndButtonPanel.add(startButton);
		startEndButtonPanel.add(endButton);

		topPanel.setLayout(new GridLayout(1, 3));
		topPanel.add(titleLabel);
//		topPanel.add(scoreLabel);

		setLayout(new BorderLayout());
		add(topPanel, BorderLayout.NORTH);
		add(gameBoardPanel, BorderLayout.CENTER);
		add(startEndButtonPanel, BorderLayout.EAST);
		setBounds(100, 100, 700, 800);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MoleGame();
	}

}
