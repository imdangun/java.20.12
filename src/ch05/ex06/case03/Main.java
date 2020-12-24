package ch05.ex06.case03;

public class Main {
	public static void main(String[] args) {
		Console.info("start main method.");
		
		Console.inMsg("input number.");
		int num = Console.inNum();
		
		Console.inMsg("input string.");
		String str = Console.inStr();
		
		Console.error("value must be less than 5.");
	}
}
