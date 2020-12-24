package ch06.ex04.case07;

public class Main {
	public static void main(String[] args) {
		ShinhanBank shinhan = new ShinhanBank(0.01);
		
		System.out.printf("%.1f %%", shinhan.getRate() * 100); // 2.0 %
	}
}
