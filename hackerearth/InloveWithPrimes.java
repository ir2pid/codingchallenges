import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;

public class InloveWithPrimes {
	/**
	 * @author sudipta.a.dutta
	 * 
	 * @project Challenges
	 * @file InloveWithPrimes.java
	 * @package
	 * @date Mar 17, 2015
	 * @todo TODO
	 */

	static ArrayList<Integer> nos = new ArrayList<Integer>();

	public static void main(String args[]) throws Exception {
		String filename = "in.txt";
		System.setIn(new FileInputStream(filename));

		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);

		for (int i = 0; i < N; i++) {
			int val = Integer.valueOf(br.readLine());
			// nos.add(val);
			if (val == 2)
				System.out.println("Deepa ");
			else
				System.out.println("Arjit");
		}
	}


	public static void siviePrime(int N) {
		
		// initially assume all integers are prime
		boolean[] isPrime = new boolean[N + 1];
		for (int i = 2; i <= N; i++) {
			isPrime[i] = true;
		}

		// mark non-primes <= N using Sieve of Eratosthenes
		for (int i = 2; i * i <= N; i++) {

			// if i is prime, then mark multiples of i as nonprime
			// suffices to consider mutiples i, i+1, ..., N/i
			if (isPrime[i]) {
				nos.add(i);
				for (int j = i; i * j <= N; j++) {
					isPrime[i * j] = false;
				}
			}
		}
	}

	public static void printPrimes(boolean[] isPrime, int N) {
		// count primes
		int primes = 0;
		for (int i = 2; i <= isPrime.length; i++) {
			if (isPrime[i])
				primes++;
		}
		System.out.println("The number of primes <= " + N + " is " + primes);
	}
}
