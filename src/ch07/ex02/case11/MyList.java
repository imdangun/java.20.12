package ch07.ex02.case11;

import java.util.ArrayList;

public class MyList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);
		
		System.out.println(list); // [1, 2, 3, 1]
		
		for(int i: list) System.out.print(i + " "); // 1 2 3 1 
		System.out.println();
		
		System.out.println(list.get(0)); // 1
		System.out.println(list);
		
		System.out.println(list.remove(0));
		System.out.println(list);
		
		for(int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + " ");
		System.out.println();
		
		for(int i = list.size() - 1; i >= 0; i--)
			System.out.print(list.remove(i) + " ");		
	}
}
