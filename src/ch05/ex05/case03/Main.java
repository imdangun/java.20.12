package ch05.ex05.case03;

public class Main {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		int result = 0;
		Paper paper = null;
		Paper paper2 = null;
		
		paper = new Paper();
		paper.setA(1);
		paper.setB(2);
		
		result = calculator.add(1, 2);
		System.out.println(result); // 3
		
		result = calculator.add(paper);
		System.out.println(result); // 3
		
		calculator.addUp(1, 2);
		
		System.out.println(paper.getResult()); // 0
		calculator.addUp(paper);
		System.out.println(paper.getResult()); // 3
		
		paper2 = calculator.plus(paper);
		System.out.printf("paper: %s\npaper2: %s\n\n", paper, paper2);
		
		paper2 = calculator.sum(paper);
		System.out.printf("paper: %s\npaper2: %s\n\n", paper, paper2);
	}
}
