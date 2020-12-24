package ch05.ex05.home.case02;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Copier copier = new Copier();
		Document doc = new Document();
		
		doc.setTitle(Console.inLine("제목"));
		doc.setContent(Console.inLine("내용"));
		doc.setRegDate(LocalDate.now());
		
		System.out.println("\n복사합니다.");
		
		Document doc1 = copier.copy(doc);
		Document doc2 = copier.copy(doc);
		
		System.out.println();
		System.out.println(doc1);
		System.out.println(doc2);
	}
}

/*
원본 문서를 작성한다.
제목, 내용, 작성일을 입력한다.
제목과 내용은 수동 입력, 작성일은 자동입력한다.

위 문서를 2장 복사한다.
--

제목: 태백산맥
내용: 빨치산도 대한민국의 역사이다.

복사합니다.

제목: 태백산맥
내용: 빨치산도 대한민국의 역사이다.
작성일: 2020-12-21

제목: 태백산맥
내용: 빨치산도 대한민국의 역사이다.
작성일: 2020-12-21
*/