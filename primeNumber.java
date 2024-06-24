package prime;

import java.lang.Math;

public class primeNumber {
	public static boolean isPrime(int n) {
		
		if ( n <= 1 ) {
			return false;
			
	
			
		}
		if (n == 2) {
			return true;
			
		}
		
		if (n % 2 == 0)
			
		return false;
		
		int maxDivisor = (int) Math.sqrt(n);
		for (int i = 3; i <= maxDivisor; i += 2) {
			if(n % i == 0) {
				return false;
				
			}
		}
		
		return true;
		
		}
		
		public static void main(String[] args) {
			int number = 23;
			if (isPrime(number)) {
				System.out.println(number + "is a prime number.");
			}
			else {
				System.out.println(number + "is not prime number.");
			}
		}

}
