package com.web08.model;

import java.sql.Date;

public class Bbs07Bean {
	// javabean -> set�ʵ�� ù���ڸ� �빮�ڷ�
	private int num, lvl;
	private String sub, content, id;
	private Date nalja;
	
	
	public void setLvl(int lvl) {
		this.lvl = lvl;
	}
	public int getLvl() {
		return lvl;
	}
	public int getNum() {
		return num;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getNalja() {
		return nalja;
	}
	public void setNalja(Date nalja) {
		this.nalja = nalja;
	}
	
}
