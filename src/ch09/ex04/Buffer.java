package ch09.ex04;

public class Buffer {
	private Integer value;
	
	public synchronized int getValue() {
		while(value == null) {
			try {
				wait();
			} catch(InterruptedException e) {}
		}
		
		int value = this.value;
		this.value = null;
		
		notifyAll();
		
		return value;
	}
	
	public synchronized void setValue(Integer value) {
		while(this.value != null) {
			try {
				wait();
			} catch(InterruptedException e) {}
		}
		
		this.value = value;
		notifyAll();
	}
}
