package ch09.ex01;

public class C01Counter {
	public static void main(String[] args) {
		System.out.println("main start.");
		
		Thread thread1 = new Thread(() ->  {
			for(int i = 0; i < 10; i++)
				System.out.print(i + " ");
		});
		
		Thread thread2 = new Thread(() ->  {
			for(char c = 'a'; c <= 'z'; c++)
				System.out.print(c + " ");
		});
		
		thread1.start();
		thread2.start();
		
		System.out.println("main end.");
	}
}
/*
main start.
main end.
0 1 2 3 4 a b 5 c d e f g h i j k l m n o p q r s t u v w x y z 6 7 8 9 main start.
*/
