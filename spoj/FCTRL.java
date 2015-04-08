package spoj;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class FCTRL {

	public static void main(String args[]) throws Exception {

		String filename = "in.txt";
		System.setIn(new FileInputStream(filename));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);

		for (int i = 0; i < N; i++) {
			String num = br.readLine();
			BigInteger divisor = new BigInteger(num);
			BigInteger dividend = new BigInteger("5");
			BigInteger sum = new BigInteger("0");
			int pow = 1;
			while(divisor.compareTo(dividend) != -1){
				sum = sum.add(divisor.divide(dividend));
				dividend = dividend.pow(pow+1);
			}
			System.out.println(sum);
		}
	}
}
