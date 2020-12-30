package ch08.ex03.case01;

public class C06Throws {	
	public void first() {
		try {
			second();
		} catch(Exception e) {
			System.out.println("Exception: first()");
		}
	}	
	
	/*
	public void first() {		
		second();		
	}
	*/
	
	public void second() throws Exception {
		third();
	}
	
	public void third() {
		int i = 3 / 0;
	}
	
	public static void main(String[] args) {
		C06Throws t = new C06Throws();
		t.first();
		
		System.out.println("끝.");
	}
}
