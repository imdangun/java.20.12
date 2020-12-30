package ch07.ex04.case04;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Pocket pocket = new Pocket();
		List<Number> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		List<Double> list3 = new ArrayList<>();
		List<String> list4 = new ArrayList<>();
		
		pocket.add(list1);
		pocket.add(list2);
		pocket.add(list3);
		//pocket.add(list4);
		
		pocket.printList(list1);
		pocket.printList(list2);
		pocket.printList(list3);
		pocket.printList(list4);
		
		pocket.add2(list1);
		pocket.add2(list2);
		//pocket.add2(list3);
		//pocket.add2(list4);
	}	
}
