package ch07.ex04.case04;

import java.util.List;

public class Pocket {
	{
		int i = 1 + 2;
		double d = 1.0 + 2.0;
		i = new Integer(1) + new Integer(2);
		d = new Double(1.0) + new Double(2.0);
		
		// new Number(1) + new Number(2);
	}
	
	// upper bounded wildcard
	public double add(List<? extends Number> list) { // (List<Number> list)
		double sum = 0;
		for(Number n: list) sum += n.doubleValue();
		
		return sum;
	}
	
	// unbounded wildcard
	public void printList(List<?> list) {
		for(Object obj: list) System.out.print(obj + " ");
		System.out.println();
	}
	
	// lower bounded wildcard
	public List<? super Integer> add2(List<? super Integer> list){
		for(int i = 0; i < 10; i++) list.add(i);
		return list;
	}
}
