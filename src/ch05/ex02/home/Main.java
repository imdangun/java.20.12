package ch05.ex02.home;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Memo memo = new Memo();
		System.out.print("메세지를 남겨 주세요.\n> ");
		memo.setMessage(sc.nextLine());
		System.out.print("누구세요?\n> ");
		memo.setCallerName(sc.nextLine());
		
		System.out.println(memo);		
	}
}
/*
메세지를 메모한다.
발신자명을 메모한다.
메모를 읽는다.
--

메세지를 남겨 주세요.
> hello
누구세요?
> terry

hello from terry.
*/