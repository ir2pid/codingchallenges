import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;



public class SumOfDigits {
	/**
	 * @author sudipta.a.dutta
	 *
	 * @project Challenges
	 * @file SumOfDigits.java
	 * @package 
	 * @date Mar 17, 2015
	 * @todo TODO
	 */
	

	public static void main(String args[]) throws Exception {
		String filename = "in.txt";
		System.setIn(new FileInputStream(filename));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		BigInteger a2 = BigInteger.ZERO;
		BigInteger a1 = BigInteger.ZERO;
		for (int i = 0; i < N; i++) {
			BigInteger num = new BigInteger(br.readLine());
			a1 = a1.add(sod(num));
			a2 = a2.add(sod(num));
		}
		BigInteger bi9 = new BigInteger("9");
		BigInteger[] r1 = a1.divideAndRemainder(bi9);
		BigInteger[] r2 = a2.divideAndRemainder(bi9);
		System.out.println(r1[1].subtract(r2[1]).toString());
	}
	
	public static BigInteger sod(BigInteger num)
	{
		BigInteger sum = new BigInteger("0");
		
		while(num.compareTo(BigInteger.ZERO)>0){
			BigInteger[] vals = num.divideAndRemainder(BigInteger.TEN);
			sum = sum.add(vals[1]);
			num = vals[0];
		}
		
		return sum;		
	}
	
}
