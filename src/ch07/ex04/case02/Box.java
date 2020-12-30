package ch07.ex04.case02;

public class Box {
	public <T> T getLastVal(T[] arr) { // generic method
		return arr[arr.length - 1];
	}
}
