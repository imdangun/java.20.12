package ch06.ex03.case03.home;

public class Circle extends Point {
	private int r;
	
	public Circle (int x, int y, int r) {
		super(x, y);
		this.r = r;
	}
	
	@Override
	public String toString() {
		return String.format("%s %d", super.toString(), r);
	}
}
