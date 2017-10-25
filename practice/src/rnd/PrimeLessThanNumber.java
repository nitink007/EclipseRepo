package rnd;

public class PrimeLessThanNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public String getPrime(String N) {
		String largerstPrime = null;
		String tempStr = null;
		char[] str = N.toCharArray();
		for (int i = str.length-1; i >= 0; i--) {
			char c = str[i];
			int numVal = Character.getNumericValue(c);
			if (numVal>7) {
				tempStr = "7";
				largerstPrime = tempStr + largerstPrime;
			} else if (numVal==7) {
				tempStr = "5";
				largerstPrime = tempStr + largerstPrime;
			} else if (numVal>=5 && numVal<7) {
				tempStr = "5";
				largerstPrime = tempStr + largerstPrime;
			} else if (numVal>=3 && numVal<5) {
				tempStr = "3";
				largerstPrime = tempStr + largerstPrime;
			} else if (numVal>=2 && numVal<3) {
				tempStr = "2";
				largerstPrime = tempStr + largerstPrime;
			} else if (numVal>=1) {
				
			}
		}
		
		return N;
		
	}

}
