package ch05.ex01.home;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = "";
		int age = 0;
		LocalDate regDate = null;
		
		System.out.print("이름: ");
		name = sc.nextLine();
		System.out.print("나이: ");
		age = sc.nextInt();
		regDate = LocalDate.now();
		
		Man man = new Man();
		man.setName(name);
		man.setAge(age);
		man.setRegDate(regDate);
		
		System.out.println("\n다음 사람을 입력하셨습니다.");
		System.out.printf("이름: %s\n나이: %d\n등록일: %s", 
				man.getName(), man.getAge(), man.getRegDate());
	}
}
/*
- 이름, 나이를 수동 입력한다.
- 등록일은 오늘 날짜를 자동 입력한다.
- 위 입력값 세 개를 이용해서, 사람 1명을 생성한다.
--

이름: 최한석
나이: 25

다음 사람을 입력하셨습니다.
이름: 최한석
나이: 25
등록일: 2020-12-18
*/