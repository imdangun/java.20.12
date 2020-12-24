package ch05.ex05.case03;

public class Calculator {
	public int add(int a, int b) {
		return a + b;
	}
	
	public int add(Paper paper) {
		return paper.getA() + paper.getB();
	}
	
	public void addUp(int a, int b) {
		int result = a + b;
	}
	
	public void addUp(Paper paper) {
		paper.setResult(paper.getA() + paper.getB());
	}
	
	public Paper plus(Paper paper) {
		paper.setResult(paper.getA() + paper.getB());
		return paper;
	}
	
	public Paper sum(Paper paper) {
		int result = paper.getA() + paper.getB();
		
		Paper paper2 = new Paper();
		paper2.setResult(result);
		
		return paper2;
	}
}
