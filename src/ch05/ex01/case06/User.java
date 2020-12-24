package ch05.ex01.case06;

public class User {
	private String name;
	private int age;
	
	public void setName(String myName) {
		if(myName.charAt(0) == '최')
			name = myName;
		else name = "reject";
	}
	
	public void setAge(int myAge) {
		if(20 <= myAge && myAge <= 29)
			age = myAge;
		else age = -1;
	}
	
	public String getName(int level) {
		String myName = "";
		if(level > 5) myName = name;
		else myName = "비밀";
		
		return myName;
	}
	
	public int getAge(int level) {
		int myAge = 0;
		if(level > 5) myAge = age;
		
		return myAge;
	}
}
