package ch05.ex04.case04;

public class Main {
	public static void main(String[] args) {
		Sequence.setCurrentNum(1);
		
		for(int i = 0; i < 3; i++)
			System.out.println(Sequence.nextNum());	
	}
}
