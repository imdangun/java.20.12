package ch05.ex08.case03;

public class Citrus {
	private String name;
	
//	public Citrus() {
//		this.name = "귤";
		// new Citrus("귤");
//	}
	
	public Citrus() {
		this("귤");
	}
	
	public Citrus(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
