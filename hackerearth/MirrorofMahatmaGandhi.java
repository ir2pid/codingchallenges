import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;



public class MirrorofMahatmaGandhi {
	/**
	 * @author sudipta.a.dutta
	 *
	 * @project Challenges
	 * @file MirrorofMahatmaGandhi.java
	 * @package 
	 * @date Mar 16, 2015
	 * @todo TODO
	 */

	public static void main(String args[]) throws Exception {
		String filename = "in.txt";		 
		System.setIn(new FileInputStream(filename));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.valueOf(line).intValue();
		for (int i = 0; i < N; i++) {
			String input = br.readLine();
			if(isReversable(input)){
				if(isPalindrome(input))
				{
					System.out.println("YES");
				}
				else {
					System.out.println("NO");
				}
			}else {
				System.out.println("NO");
			}
			
		}

	}
	
	static boolean isPalindrome(String input){
		int len = input.length();
		int pivot = input.length()/2;
		for(int i=0; i<pivot;i++){
			if(input.charAt(i) != input.charAt(len-1-i)){
				return false;
			}
		}		
		return true;		
	}
	
	static boolean isReversable(String input){
		
		for(int i=0; i<input.length();i++){
			if(input.charAt(i) != '0' && input.charAt(i) != '1' && input.charAt(i) != '8'){
				return false;
			}
		}
		return true;	
	}
}
