package challenges;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class CouponDunia {

	public static void main(String args[]) throws Exception {
		
		String filename = "cd";

		System.setIn(new FileInputStream(filename));
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int line = Integer.parseInt(br.readLine());
		for (int i = 0; i < line; i++) {
			String s = br.readLine();
			String[] vals = s.split(" ");
			BigInteger a = new BigInteger(vals[0]);
			BigInteger b = new BigInteger(vals[1]);
	       // System.out.println("values" + a+ " " + b);
			
			int interestingOcc = 0;
			if(a.equals(BigInteger.ONE))
				interestingOcc = 1;
			
			  for (BigInteger j = b;
			            j.compareTo(a) > 0;
			            j = j.subtract(BigInteger.ONE)) {				  
				  BigInteger bi = j;
				  BigInteger x = new BigInteger("2");
					long totalFactors = 1;
					while (x.multiply(x).compareTo(bi) <= 0) {
					    int power = 0;
					    while (bi.mod(x).equals(BigInteger.ZERO)) {
					        power++;
					        bi = bi.divide(x);
					    }
					    totalFactors *= (power + 1);
					    x = x.add(BigInteger.ONE);
					}
					if (!bi.equals(BigInteger.ONE)) {
					    totalFactors *= 2;
					}

					//System.out.println("number of factors of "+bi+" is: " + totalFactors);
					
					if(totalFactors % 2 == 1)
						interestingOcc++;
			    }
			
			
			
	        System.out.println(interestingOcc);
		}
		
	}
}
