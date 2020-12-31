package ch09.ex03;

public class Player extends Thread {
	private Counter counter;
	
	public Player(Counter counter) {
		this.counter = counter;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			counter.increase();
			counter.decrease();
			
			if(i % 10 == 0) counter.print();
			
			try {
				sleep((int)(Math.random() * 2));
			} catch(InterruptedException e) {}
		}
	}
	
	public static void main(String[] args) {
		Counter counter = new Counter();
		new Player(counter).start();
		new Player(counter).start();
		new Player(counter).start();
	}	
}
