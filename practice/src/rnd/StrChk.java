package rnd;

public class StrChk {
	
	static void changeStr(StringBuffer s) {
		s.append("abc");
		System.out.println(s+" from function");
	}
	
	public static void main(String[] args) {
		
		StringBuffer s = new StringBuffer("nitin");
		System.out.println(s);
		changeStr(s);
		System.out.println(s);
		
	}

}
