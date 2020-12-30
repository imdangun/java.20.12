package ch07.ex05.case06;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		for(int i = 1; i <= 10; i++) list.add(i);
		
		list.forEach((x) -> System.out.print(x + " "));
		System.out.println();
		
		for(int i: list) System.out.print(i + " ");
	}
}
/*
1 2 3 4 5 6 7 8 9 10 
1 2 3 4 5 6 7 8 9 10
*/