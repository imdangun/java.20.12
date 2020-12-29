package ch07.ex02.case20.home;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Stationary> bag = new ArrayList<>();
		
		bag.add(new Pencil());
		bag.add(new Eraser());
		
		for(Stationary stationary: bag) {
			if(stationary instanceof Pencil) ((Pencil)stationary).write();
			if(stationary instanceof Eraser) ((Eraser)stationary).erase();
		}
	}
}
/*
가방에 지우개와 연필을 담는다.
가방에서 아무 물건이나 꺼낸다.
꺼낸 물건이 지우개면 지우고,
연필이면 쓴다.
*/