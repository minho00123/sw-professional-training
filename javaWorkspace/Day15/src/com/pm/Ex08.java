package com.pm;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class Ex08 extends Frame {

	public Ex08() {
		GridLayout layout = new GridLayout(6, 1);
		setLayout(layout);

		Panel name = new Panel();
		Label nameLabel = new Label("이름");
		TextField nameTextField = new TextField(30);
		name.add(nameLabel);
		name.add(nameTextField);

		Panel id = new Panel();
		Label idLabel = new Label("아이디");
		TextField idTextField = new TextField(30);
		id.add(idLabel);
		id.add(idTextField);

		Panel password = new Panel();
		Label passwordLabel = new Label("패스워드");
		TextField passwordTextField = new TextField(30);
		password.add(passwordLabel);
		password.add(passwordTextField);

		Panel telephone = new Panel();
		GridBagLayout telephoneGridBag = new GridBagLayout();
		telephone.setLayout(telephoneGridBag);
		GridBagConstraints telephoneGrid = new GridBagConstraints();
		telephoneGrid.fill = GridBagConstraints.CENTER;
		Label telephoneLabel = new Label("전화번호");
		Choice phoneList = new Choice();
		phoneList.add("010");
		phoneList.add("011");
		phoneList.add("017");
		Label dashLabel1 = new Label("-");
		TextField telephoneSecondTextField = new TextField(4);
		Label dashLabel2 = new Label("-");
		TextField telephoneThirdTextField = new TextField(4);
		telephone.add(telephoneLabel);
		telephone.add(phoneList);
		telephone.add(dashLabel1, telephoneGrid);
		telephone.add(telephoneSecondTextField);
		telephone.add(dashLabel2, telephoneGrid);
		telephone.add(telephoneThirdTextField);

		Panel hobbies = new Panel();
		Label hobbiesLabel = new Label("취미");
		hobbies.add(hobbiesLabel);
		CheckboxGroup checkboxGroup = new CheckboxGroup();
		Checkbox readingCheckbox = new Checkbox("독서", false, checkboxGroup);
		Checkbox exerciseCheckbox = new Checkbox("운동", false, checkboxGroup);
		Checkbox sleepCheckbox = new Checkbox("숙면", false, checkboxGroup);
		hobbies.add(readingCheckbox);
		hobbies.add(exerciseCheckbox);
		hobbies.add(sleepCheckbox);

		Panel textArea = new Panel();
		Label textAreaLabel = new Label("하고자하는 일");
		textArea.add(textAreaLabel);
		TextArea textAreaBox = new TextArea("", 50, 20, TextArea.SCROLLBARS_VERTICAL_ONLY);
		textArea.add(textAreaBox);
		GridLayout textAreaLayout = new GridLayout(2, 1);
		textArea.setLayout(textAreaLayout);

		add(name);
		add(id);
		add(password);
		add(telephone);
		add(hobbies);
		add(textArea);
		setLocation(500, 200);
		setSize(500, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex08();
	}

}
