package spoj;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class TheNextPalindrome {

	

	public static void main(String args[]) throws Exception {

		String filename = "in.txt";
		System.setIn(new FileInputStream(filename));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);

		for (int i = 0; i < N; i++) {
			String num = br.readLine();
			
			System.out.println(nextPalindrome(num));
		}	
		
	}
	public static String nextPalindrome(String str)
	{
		StringBuilder sb = new StringBuilder();
		int len = str.length();
		boolean flagSame = true;
		for(int i=0;i<len/2;i++){
			
			if((int)str.charAt(i)>(int)str.charAt(len-1-i)){
				flagSame = false;
				sb.append(str.charAt(i));
			}else {	
				if((int)str.charAt(i)<(int)str.charAt(len-1-i))
				{
					flagSame = false;			
				}
				sb.append(str.charAt(len-1-i));
			}				
		}
		StringBuilder rev = new StringBuilder(sb);	
				
		if(len%2 == 1)
			sb.append(str.charAt((len/2)));
		
		sb.append(rev.reverse());
		
		return sb.toString();
	}
	/*public static BigInteger nextPalindrome(BigInteger i)
	{
		i = i.add(BigInteger.ONE);
		while(!isPalindrome(i.toString()))
		{
			i = i.add(BigInteger.ONE);
		}
		return i;
	}
	
	public static boolean isPalindrome(String s){
		
		int mid = s.length()/2;
		String a1 = s.substring(0, mid);
		String a2 = s.substring(s.length()-mid, s.length());
		
		if(a1.compareTo(a2) == 0)
			return true;
		
		return false;		
	}*/
}
