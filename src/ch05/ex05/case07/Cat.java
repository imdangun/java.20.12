package ch05.ex05.case07;

public class Cat {
	private String name;
	
	public Cat breed() {
		return new Cat();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
