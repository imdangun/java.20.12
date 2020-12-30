package ch08.ex02.case02;

public enum Level {
	GOLD(3, null), SILVER(2, GOLD), BASIC(1, SILVER);
	
	private final int value;
	private final Level next;
	
	private Level(int value, Level next) {
		this.value = value;
		this.next = next;
	}
	
	public int intValue() {
		return this.value;
	}
	
	public Level next() {
		return this.next;
	}
	
	public static Level valueOf(int value) {
		Level level = null;
		
		switch(value) {
		case 3: level = GOLD; break;
		case 2: level = SILVER; break;
		case 1: level = BASIC;
		}
		
		return level;
	}
}
