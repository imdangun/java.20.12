package ch05.ex03.case01;

public class Main {
	public static void main(String[] args) {
		Tv tv1 = new Tv();
		Tv tv2 = new Tv();
		
		tv1.setColor("red");
		tv1.setPower(true);
		tv1.setChannel(7);
		
		tv1.channelUp();
		System.out.println(tv1.getChannel());
		System.out.println(tv2.getChannel());
		
		System.out.printf("tv1: %s\ntv2: %s\n", tv1, tv2);
		tv2 = tv1;
		System.out.printf("tv1: %s\ntv2: %s\n", tv1, tv2);
		
		tv1.channelDown();
		System.out.printf("tv1: %d\ntv2: %d", tv1.getChannel(), tv2.getChannel());
	}
}
