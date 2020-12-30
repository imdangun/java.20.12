package ch08.ex03.case01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class C03TryCatchFinally {
	public static void main(String[] args) {
		PrintWriter out = null;
		int[] arr = {1, 2, 3};
		
		try {
			out = new PrintWriter(new FileWriter("c:/DEV/a.txt"));
			
			for(int i = 0; i < arr.length; i++)
				out.println("arr[" + i +"]: " + arr[i]);
		} catch(ArrayIndexOutOfBoundsException e) {
			out.println("배열 exception이 발생했습니다.");
		} catch(IOException e) {
			out.println("IOException이 발생했습니다.");
		} finally {
			if(out != null) out.close();
		}
		
		System.out.println("끝.");
	}
}
