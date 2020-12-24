package ch05.ex05.home.case01;

import java.util.Scanner;

public class Console {
	public static String inYn(String msg) {
		Scanner sc = new Scanner(System.in);
		
		boolean isGood = false;
		String answer = "";
		
		do {
			System.out.print(msg + "? ");
			String line = sc.nextLine();
			
			if(line.length() == 1) answer = line.toLowerCase();
			isGood = answer.equals("y") || answer.equals("n");
			
			if(!isGood)
				System.out.println("ERROR] y 나 n 을 입력하세요.");			
		} while(!isGood);
		
		return answer;
	}
}
