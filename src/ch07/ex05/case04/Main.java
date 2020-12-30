package ch07.ex05.case04;

public class Main {
	public static void main(String[] args) {
		Shooter shooter = new Shooter();
		Smith smith = new Smith();
		
		shooter.fire(() -> System.out.println("탕탕")); // 탕탕
		shooter.fire(smith.makeGun()); // 드르륵
		shooter.fire(() -> System.out.println("드르륵")); // 드르륵
	}
}
