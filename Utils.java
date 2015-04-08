import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;


public class Utils {


	//--------------------------------------------------------------
	
	// Read input from stdin and provide input before running
	public void read() throws Exception{
		// Read input from stdin and provide input before running
		String filename = "in.txt";

		System.setIn(new FileInputStream(filename));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line = br.readLine();
		int N = Integer.valueOf(line);
		
		for(int i=0;i<N;i++){
			//do
		}
	}
	
	//--------------------------------------------------------------
	
	//splits

	private static String[]split2StringArr(String s){
		
		return s.split(" ");
		
	}
	
	private static ArrayList<Integer> split2IntArrayList(String s){
		
		ArrayList<Integer> arrInt = new ArrayList<Integer>();
		String[]strArr = s.split(" ");
		
		for(int i=0;i<strArr.length;i++){
			arrInt.add(Integer.valueOf(strArr[i]));
		}
		
		return arrInt;
	}	

	private static HashSet<Integer> split2IntSet(String s){
		
		HashSet<Integer> arrInt = new HashSet<Integer>();
		String[]strArr = s.split(" ");
		
		for(int i=0;i<strArr.length;i++){
			arrInt.add(Integer.valueOf(strArr[i]));
		}
		
		return arrInt;
	}
	//--------------------------------------------------------------
	//regular optimized
	//checks whether an int is prime or not.
	/**
	 * Test for prime numbers
	 * @param n
	 * @return
	 */
	public static boolean isPrime(int n) {
		if(n < 4) return true;
	    //test for all multiples of 2
	    if ((n & 1) == 0) return false;
	    
	    //test for all multiples of 3
	    if ((n%3) == 0) return false;
	    
	    //other wise test all odd numbers, but we are checking only for probable prime numbers of the
	    // form 6K+1/6K-1 k>1;
	    int sqrt = (int) Math.sqrt(n);
	    for(int i=6; i<=sqrt; i+=6) {
	        if(n%(i-1)==0)
	            return false;
	        if(n%(i+1)==0)
	            return false;
	    }
	    return true;
	}
	
	
	//--------------------------------------------------------------
	//simpler 
	//checks whether an int is prime or not.
	boolean isPrimeSimple(int n) {
	    //check if n is a multiple of 2
	    if (n%2==0) return false;
	    //if not, then just check the odds
	    for(int i=3;i*i<=n;i+=2) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
	//--------------------------------------------------------------
	
	//sieve method
	// will contain true or false values for the first 10,000 integers
	boolean[] primes=new boolean[10000]; 
	//set up the primesieve
	public void fillSieve() {
	    Arrays.fill(primes,true);        // assume all integers are prime.
	    primes[0]=primes[1]=false;       // we know 0 and 1 are not prime.
	    for (int i=2;i<primes.length;i++) {
	        //if the number is prime, 
	        //then go through all its multiples and make their values false.
	        if(primes[i]) {
	            for (int j=2;i*j<primes.length;j++) {
	                primes[i*j]=false;
	            }
	        }
	    }
	}	 
	public boolean getPrime(int n) {
	    return primes[n]; //simple, huh?
	}
	

	
	//--------------------------------------------------------------
	
	//biginteger sqrt
	public static BigInteger sqrt(BigInteger x) {
	    BigInteger div = BigInteger.ZERO.setBit(x.bitLength()/2);
	    BigInteger div2 = div;
	    // Loop until we hit the same value twice in a row, or wind
	    // up alternating.
	    for(;;) {
	        BigInteger y = div.add(x.divide(div)).shiftRight(1);
	        if (y.equals(div) || y.equals(div2))
	            return y;
	        div2 = div;
	        div = y;
	    }
	}
}
