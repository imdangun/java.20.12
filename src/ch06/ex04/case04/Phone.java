package ch06.ex04.case04;

public class Phone {
	private String modelName;
	
	public Phone(String modelName) {
		this.modelName = modelName;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean isEqual = false;
		
		if(obj instanceof Phone)
			isEqual = modelName.equals(((Phone)obj).modelName);
		
		return isEqual;
	}
}
