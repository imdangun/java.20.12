package ch05.ex05.case08;

public class Baker {
	public Bread bake() {
		return new Bread();
	}
	
	public void stickPrice(Bread bread, int price) {
		bread.setPrice(price);
	}
}
