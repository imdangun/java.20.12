package ch07.ex01.case11.presentation;

import java.util.Scanner;

public interface Console {
	Scanner sc = new Scanner(System.in);
	
	static void info(String msg) {
		System.out.println(msg);
	}
	
	static void info(Object obj) {
		System.out.println(obj);
	}
}
