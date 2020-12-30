package ch08.ex03.case01;

public class C05Hierarchy {
	public void first() {
		try {
			int i = 3 / 0;
		} catch(ArithmeticException e) {
			System.err.println("ArithmeticException");
		} catch(RuntimeException e) {
			System.err.println("RuntimeException");
		} catch(Exception e) {
			System.err.println("Exception");
		}
	}
	
	public void second() {
		try {
			int i = 3 / 0;
		} catch(Exception e) {
			System.err.println("Exception: second()");
		}
	}
	
	public static void main(String[] args) {
		C05Hierarchy hierarchy = new C05Hierarchy();
		hierarchy.first();
		hierarchy.second();
	}
}
