package rnd;

public class PrimeTillN {
	
	public void getPrime(int n) {
		
		int counter=2;
		int divChk;
		boolean isPrime;
		
		while (counter<=n) {
			divChk = (int) Math.sqrt(counter);
			isPrime = true;
			for (int i = 2; i <= divChk; i++) {
				if ((counter%i)==0) {
					isPrime = false;
					break;
				}
				
			}
			if (isPrime) {
				System.out.println(counter);
			}
			counter++;
		}
		
	}
	
	public static void main(String[] args) {
		PrimeTillN p = new PrimeTillN();
		
		p.getPrime(100);
	}

}
