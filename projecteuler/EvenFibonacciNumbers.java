package projecteuler;

import java.math.BigInteger;

public class EvenFibonacciNumbers {

	public static void main(String args[]) throws Exception {

		int a = 1;
		int b = 2;
		BigInteger n = new BigInteger("4000000");
		BigInteger sum = new BigInteger("2");
		//System.out.println(a);
		//System.out.println(b);
		
		for (int i = 1; sum.compareTo(n)<1 ; i++) {
			int temp = a;
			a = b;
			
			
			b = a+temp;
			
			if(b%2 == 0)
				sum = sum.add(new BigInteger(String.valueOf(b)));
			
			//System.out.println(b);
		}
		System.out.println(sum);
	}
}
