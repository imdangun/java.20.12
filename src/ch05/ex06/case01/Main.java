package ch05.ex06.case01;

public class Main {
	public static void main(String[] args) {
		Man.say("I love java.");
		//Man.tell("");
		
		Man man = new Man();
		man.tell("I love java.");
		
		man.say("I love java.");
	}
}
