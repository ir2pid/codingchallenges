package spoj;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class PRIME1PrimeGenerator {

	//memory to store not-prime flag of root(1000000000) numbers, 
	//some will be notPrimes(true) 0,1,4,6...
	//and some primes(false) 2,3,5,7....
	static boolean[] notPrimes;
	
	public static void main(String args[]) throws Exception {
		int max = (int) genPrimes(1100000000);
		String filename = "cd";
		System.setIn(new FileInputStream(filename));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input1 = br.readLine();
		int lines = Integer.valueOf(input1);

		for (int i = 0; i < lines; i++) {
			
			if(i!=0)//print next batch of primes in new line 
				System.out.println();
			
			String input2 = br.readLine();
			String[] input1Vals = input2.split(" ");
			int a = Integer.valueOf(input1Vals[0]);
			int b = Integer.valueOf(input1Vals[1]);
			
			if(b>max)//don't exceed root(1000000000)
				b = max;
			
			//set 0 and 1 as not primes
			notPrimes[0] = true;
			notPrimes[1] = true;
			
			for(int j=a;j<=b;j++){
				if(notPrimes[j] == false)
					System.out.println(j);;
			}
		}

	}

	public static double genPrimes(int limit) {

		double total = Math.pow(limit, 0.5f)+1;
		
		//alloc memory to store root(1000000000) numbers
		notPrimes = new boolean[(int) total + 1];

		int p = 2;

		while (p < total) {
			
			//mark all multiples of p as not-prime
			for (int i = 2*p; i < total; i += p) {
				notPrimes[i] = true;
			}
			p = getNextP(p);

		}
		return total;
	}

	public static int getNextP(int p)
	{//get next number which hasn't been flagged as a multiple of previous numbers
		int i=p+1;
		for(;i<notPrimes.length;i++)
		{
			if(notPrimes[i] == false)
			{					
				return i;	
			}
		}	
		return i;			
	}

}
