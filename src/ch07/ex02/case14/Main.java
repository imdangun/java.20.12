package ch07.ex02.case14;

import java.util.ArrayList;
import java.util.List;

import ch07.ex02.case13.Cat;

public class Main {
	public static void main(String[] args) {
		List<Cat> house1 = new ArrayList<>();
		List<Cat> house2 = new ArrayList<>();
		List<List<Cat>> house = new ArrayList<>();
		house.add(house1);
		house.add(house2);
		
		for(int i = 0; i < 3; i++)
			house1.add(new Cat("고양이" + i));
		
		for(int i = 0; i < 3; i++)
			house2.add(new Cat("야옹이" + i));
		
		System.out.println(house1);
		System.out.println(house2);
		System.out.println(house);
		
		for(List<Cat> cats: house)
			for(Cat cat: cats) cat.eat();
	}
}
