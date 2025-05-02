package com.mvc.model;

import java.sql.Date;

public class BbsDto {
	private int num;
	private String sub, content, id;
	private Date nalja;

	public BbsDto(int num, String sub, String content, String id, Date nalja) {
		super();
		this.num = num;
		this.sub = sub;
		this.content = content;
		this.id = id;
		this.nalja = nalja;
	}

	public BbsDto() {
	}

	public int getNum() {
		return num;
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getNalja() {
		return nalja;
	}

	public void setNalja(Date nalja) {
		this.nalja = nalja;
	}

	@Override
	public String toString() {
		return "BbsDto [num=" + num + ", sub=" + sub + ", content=" + content + ", id=" + id + "]";
	}

}
