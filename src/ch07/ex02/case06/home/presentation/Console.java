package ch07.ex02.case06.home.presentation;

import java.util.Scanner;

public interface Console {
	Scanner sc = new Scanner(System.in);
	
	static int inNum(String msg) {
		boolean isGood = false;
		String line = "";
		int num = 0;
		
		do {
			System.out.print(msg + ": ");
			line = sc.nextLine();
			
			if(line.length() > 0 && line.matches("[0-9]*")) {
				num = Integer.parseInt(line);
				if(0 <= num && num <= 100) isGood = true;
			}
			
			if(!isGood) System.out.println("ERROR] 0 이상 100 이하의 숫자를 입력하세요.");
		} while(!isGood);
		
		return num;
	}
	
	static void outNum(int num) {
		System.out.print(num + " ");
	}
	
	static void info(String msg) {
		System.out.println("\n" + msg);
	}
	
	static void info(Object obj) {
		System.out.println(obj);
	}
}
