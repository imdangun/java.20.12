package ch05.ex05.home.case01;

public class Main {
	public static void main(String[] args) {
		Dice dice = new Dice();
		String isRepeat = "";
		
		do {
			System.out.println(dice.roll());
			isRepeat = Console.inYn("주사위를 굴릴까요");
		} while(isRepeat.equals("y"));
		
		System.out.println("끝.");
	}
}
/*
주사위를 굴린다.

--
5
주사위를 굴릴까요? y
1
주사위를 굴릴까요? y
4
주사위를 굴릴까요? 
ERROR] y 나 n 을 입력하세요.
주사위를 굴릴까요? hello
ERROR] y 나 n 을 입력하세요.
주사위를 굴릴까요? 1
ERROR] y 나 n 을 입력하세요.
주사위를 굴릴까요? n
끝.
*/