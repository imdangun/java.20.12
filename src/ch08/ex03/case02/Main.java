package ch08.ex03.case02;

public class Main {
	public static void main(String[] args) {
		String userId = "hello";
		
		try {
			if(userId.length() > 3)
				throw new LengthException("길이 초과입니다.");
		} catch(LengthException e) {
			e.printStackTrace();
		}
		
		/* compile error
		if(userId.length() > 3)
				throw new LengthException("길이 초과입니다.");
		*/
		
		throw new MemberException("회원이 아닙니다.");
	}
}
