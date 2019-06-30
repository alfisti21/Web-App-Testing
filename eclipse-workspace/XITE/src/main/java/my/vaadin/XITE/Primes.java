package my.vaadin.XITE;

public class Primes {
	public boolean isPrime(int n) {
		if (n<0) {
			return false;
		}else if (n == 0 || n == 1) {  
	           return false;  
	       }  else {
	    	   int m= n/2;
	       for (int i = 2; i <= m; i++) {  
	           if (n % i == 0) {  
	               return false;  
	           }  
	       }  
	       return true;  
	   }  
	}
}
