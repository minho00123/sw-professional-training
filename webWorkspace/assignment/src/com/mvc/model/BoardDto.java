package com.mvc.model;

import java.sql.Date;

public class BoardDto {
	private int id;
	private String userId;
	private String title;
	private String content;
	private Date createdAt;
	private Date updatedAt;
	private int parentId;

	public BoardDto(int id, String userId, String title, String content, Date createdAt, Date updatedAt) {
		super();
		this.id = id;
		this.userId = userId;
		this.title = title;
		this.content = content;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Override
	public String toString() {
		return "BoardDto [id=" + id + ", userId=" + userId + ", title=" + title + ", content=" + content
				+ ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
	}
}
