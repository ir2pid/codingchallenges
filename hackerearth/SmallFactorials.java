package hackerearth;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class SmallFactorials {

	public static void main(String args[]) throws Exception {

		System.setIn(new FileInputStream("in.txt"));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		for (int i = 0; i < N; i++) {
			String input = br.readLine();
			int no = Integer.parseInt(input);
			if(no == 0)
				no = 1;
			BigInteger fact = BigInteger.ONE;
			for(int j=no;j>1;j--)
			{
				fact = fact.multiply(new BigInteger(String.valueOf(j)));
			}
			System.out.println(fact);
		}
	}
}
