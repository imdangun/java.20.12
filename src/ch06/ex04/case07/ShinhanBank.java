package ch06.ex04.case07;

public class ShinhanBank extends KoreaBank {
	public ShinhanBank(double rate) {
		super(rate);
	}
	
	@Override
	public double getRate() {
		return super.getRate() + 0.01;
	}
}
