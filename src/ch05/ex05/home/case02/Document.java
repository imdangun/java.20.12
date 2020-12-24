package ch05.ex05.home.case02;

import java.time.LocalDate;

public class Document {
	private String title;
	private String content;
	private LocalDate regDate;
	
	public String getTitle() {
		return title;
	}
	
	public String getContent() {
		return content;
	}
	
	public LocalDate getRegDate() {
		return regDate;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}
	
	@Override
	public String toString() {
		return String.format("제목: %s\n내용: %s\n작성일: %s\n", title, content, regDate);
	}
}
