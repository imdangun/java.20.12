package ch05.ex02.home;

public class Memo {
	private String message;
	private String callerName;
	
	public String getMessage() {
		return message;
	}
	
	public String getCallerName() {
		return callerName;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void setCallerName(String callerName) {
		this.callerName = callerName;
	}
	
	@Override
	public String toString() {
		return message + " from " + callerName;
	}
}
