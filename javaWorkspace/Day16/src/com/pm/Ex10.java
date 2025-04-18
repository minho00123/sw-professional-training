package com.pm;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Ex10 extends Frame implements MouseListener {
//	JLabel userResultRocklt;
	JLabel computerResult;
	
	public Ex10() {
		Panel main = new Panel();
		BorderLayout mainLayout = new BorderLayout();
		main.setLayout(mainLayout);
		Panel resultPanel = new Panel();

		Image scissorImage = Toolkit.getDefaultToolkit().getImage("scissor.png");
		Image rockImage = Toolkit.getDefaultToolkit().getImage("rock.png");
		Image paperImage = Toolkit.getDefaultToolkit().getImage("paper.png");
		JButton scissorButton = new JButton("가위", new ImageIcon(scissorImage));
		JButton rockButton = new JButton("바위", new ImageIcon(rockImage));
		JButton paperButton = new JButton("보", new ImageIcon(paperImage));
		scissorButton.addMouseListener(this);
		rockButton.addMouseListener(this);
		paperButton.addMouseListener(this);

		JLabel userResultScissor = new JLabel(new ImageIcon(scissorImage));
		JLabel userResultRock = new JLabel(new ImageIcon(rockImage));
		JLabel userResultPaper = new JLabel(new ImageIcon(paperImage));
		resultPanel.add(userResultScissor).setVisible(false);
		resultPanel.add(userResultRock).setVisible(false);
		resultPanel.add(userResultPaper).setVisible(false);
//		computerResult = new JLabel();
		Label vs = new Label("vs.");
		resultPanel.add(vs);
//		resultPanel.add(computerResult);
		main.add(resultPanel, BorderLayout.CENTER);

		Panel buttonsPanel = new Panel();
		main.add(buttonsPanel, BorderLayout.SOUTH);
		GridLayout buttonsPanelLayout = new GridLayout(1, 3);
		buttonsPanel.setLayout(buttonsPanelLayout);
		buttonsPanel.add(scissorButton);
		buttonsPanel.add(rockButton);
		buttonsPanel.add(paperButton);

		add(main);
		setBounds(100, 100, 800, 800);
		setVisible(true);
	}

	public static int generateComputerResult() {
		Random randomNumberGenerator = new Random();
		int result = randomNumberGenerator.nextInt(3);

		return result;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		int userSelection = -1;
		String userClickedButton = ((JButton) e.getSource()).getText();

		if (userClickedButton.equals("가위")) {
			userSelection = 0;
		} else if (userClickedButton.equals("바위")) {
			userSelection = 1;
		} else if (userClickedButton.equals("보")) {
			userSelection = 2;
		}

		int computerSelection = Ex10.generateComputerResult();

//		if (userSelection == 0) {
//			userResult = new JLabel(new ImageIcon(scissorImage));
//
//		}
//		if (computerSelection == 0) {
//			computerResult = new JLabel(new ImageIcon(scissorImage));
//		}

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		// 가위바위보게임(ver 0.10.0)
		new Ex10();
	}

}
