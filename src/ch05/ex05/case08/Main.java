package ch05.ex05.case08;

public class Main {
	public static void main(String[] args) {
		Baker baker = new Baker();
		Bread bread = baker.bake();
		
		baker.stickPrice(bread, 2000);
		
		System.out.printf("%d원 빵", bread.getPrice());
	}
}
