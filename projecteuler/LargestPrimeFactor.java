package projecteuler;

import java.math.BigInteger;

public class LargestPrimeFactor {

	public static void main(String args[]) throws Exception {
		System.out.println(isPrime(new BigInteger("121")));

		greatestPrime(new BigInteger("100"));

	}

	// largest prime
	public static void greatestPrime(BigInteger bi) {

		//BigInteger n = sqrt(bi);
		//System.out.println("Sqroot is " + n.toString());
		for (BigInteger i = bi; i.compareTo(BigInteger.ZERO) > 0; i = i
				.subtract(BigInteger.ONE)) {
			if (bi.remainder(i).compareTo(BigInteger.ZERO) == 0) {
				{
					if (isPrime(i)) {
						System.out.println(i.toString());
						break;
					}
				}
			}
		}
	}

	
	public static boolean isPrime(BigInteger n) {
		if (n.compareTo(new BigInteger("4")) == -1)
			return true;
		// test for all multiples of 2
		if ((n.remainder(new BigInteger("2"))) == BigInteger.ZERO)
			return false;

		// test for all multiples of 3
		if ((n.remainder(new BigInteger("3"))) == BigInteger.ZERO)
			return false;

		// other wise test all odd numbers, but we are checking only for
		// probable prime numbers of the
		// form 6K+1/6K-1 k>1;
		BigInteger sqrt = sqrt(n);
		BigInteger six = new BigInteger("6");
		for (BigInteger i = six; i.compareTo(sqrt) != 1; i = i.add(six)) {
			if (n.remainder(i.subtract(BigInteger.ONE)).compareTo(
					BigInteger.ZERO) == 0)
				return false;
			if (n.remainder(i.add(BigInteger.ONE)).compareTo(BigInteger.ZERO) == 0)
				return false;
		}
		return true;
	}

	public static BigInteger sqrt(BigInteger x) {
		BigInteger div = BigInteger.ZERO.setBit(x.bitLength() / 2);
		BigInteger div2 = div;
		// Loop until we hit the same value twice in a row, or wind
		// up alternating.
		for (;;) {
			BigInteger y = div.add(x.divide(div)).shiftRight(1);
			if (y.equals(div) || y.equals(div2))
				return y;
			div2 = div;
			div = y;
		}
	}
	/*
	 * // A function to print all prime factors of a given number n static void
	 * primeFactors(int n) { // Print the number of 2s that divide n while (n%2
	 * == 0) { System.out.println(2); n = n/2; }
	 * 
	 * // n must be odd at this point. So we can skip one element (Note i = i
	 * +2) for (int i = 3; i <= Math.sqrt(n); i = i+2) { // While i divides n,
	 * print i and divide n while (n%i == 0) { System.out.println(i); n = n/i; }
	 * }
	 * 
	 * // This condition is to handle the case whien n is a prime number //
	 * greater than 2 if (n > 2) System.out.println(n); }
	 */
}
