package ch09.ex04;

public class Consumer implements Runnable {
	private String name;
	private Buffer buffer;
	
	public Consumer(String name, Buffer buffer) {
		this.name = name;
		this.buffer = buffer;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			int value = buffer.getValue();
			System.out.println(name + ": " + value);
			
			try {
				Thread.sleep((int)(Math.random() * 100));
			} catch(InterruptedException e) {}
		}
	}
}
