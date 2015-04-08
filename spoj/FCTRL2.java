package spoj;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class FCTRL2 {

	public static void main(String args[]) throws Exception {

		String filename = "in.txt";
		System.setIn(new FileInputStream(filename));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);

		for (int i = 0; i < N; i++) {
			String num = br.readLine();
			System.out.println(factorial(Integer.valueOf(num)));
		}
	}
	
	static String factorial(int no){
		BigInteger fact = new BigInteger("1");
		for(int i=no;i>1;i--){
			fact = fact.multiply(new BigInteger(String.valueOf(i)));
		}
		return fact.toString();	
	}
}
