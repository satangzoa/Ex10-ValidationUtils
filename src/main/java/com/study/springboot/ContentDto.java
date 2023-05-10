package com.study.springboot;

public class ContentDto {
	private int id;
	private String writer;
	private String content;
	public ContentDto(int id, String writer, String content) {
		super();
		this.id = id;
		this.writer = writer;
		this.content = content;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
}
