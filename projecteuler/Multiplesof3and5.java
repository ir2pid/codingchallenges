package projecteuler;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Multiplesof3and5 {
	
	static Set<Integer> nums = new HashSet<Integer>();

	public static void main(String args[]) throws Exception {

	int a = 3;
	int b = 5;
	int sum = 0;
	for(int i=1;i<334;i++)
	{	

		if(i == 333)	
			System.out.println();
		if(i == 199)	
			System.out.println();
		
		if(i%5 != 0)			
			sum+=(a*i); 
		
		if(i<200){
			sum+=(b*i); 
		}
		//nums.add(a);
		//a+=3;
	}
	
	System.out.println(sum);
	}
}
