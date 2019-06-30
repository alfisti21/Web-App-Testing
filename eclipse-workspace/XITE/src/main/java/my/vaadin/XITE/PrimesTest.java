package my.vaadin.XITE;

import static org.junit.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrimesTest {
	
	Primes a = new Primes();

	@Test
	void testIsPrime() {
		
		assertEquals(false, a.isPrime(-12));
		assertEquals(false, a.isPrime(0));
		assertEquals(false, a.isPrime(1));
		assertEquals(true, a.isPrime(2));
		assertEquals(true, a.isPrime(3));
		assertEquals(false, a.isPrime(4));
		assertEquals(true, a.isPrime(5));
		assertEquals(false, a.isPrime(6));
		assertEquals(true, a.isPrime(7));
		assertEquals(false, a.isPrime(8));
		assertEquals(false, a.isPrime(9));
		assertEquals(false, a.isPrime(10));
		assertEquals(true, a.isPrime(11));
		assertEquals(false, a.isPrime(12));
		assertEquals(true, a.isPrime(13));
		assertEquals(false, a.isPrime(14));
		assertEquals(false, a.isPrime(15));
		assertEquals(false, a.isPrime(16));
		assertEquals(true, a.isPrime(17));
		assertEquals(false, a.isPrime(18));
		assertEquals(true, a.isPrime(19));
		assertEquals(false, a.isPrime(20));
		assertEquals(false, a.isPrime(21));
		assertEquals(false, a.isPrime(22));
		assertEquals(true, a.isPrime(23));
		assertEquals(false, a.isPrime(24));
		assertEquals(false, a.isPrime(25));
		assertEquals(false, a.isPrime(26));

	}

}
