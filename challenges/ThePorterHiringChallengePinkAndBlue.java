package challenges;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ThePorterHiringChallengePinkAndBlue {

	static String[]snArr;
	
	public static void main(String args[]) throws Exception {
		
		String filename = "cd";

		System.setIn(new FileInputStream(filename));
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input1 = br.readLine();
		String[] input1Vals = input1.split(" ");
		
		int friends = Integer.valueOf(input1Vals[0]);
		int relationships = Integer.valueOf(input1Vals[1]);

		String input2 = br.readLine();
		snArr = input2.split(" ");
		int inversion = 0;		
		for (int i = 0; i < relationships; i++) {
			
			String input3 = br.readLine();
			String[] sValArr = input3.split(" ");
			
			if(snArr[Integer.valueOf(sValArr[0])-1].compareTo("B") == 0 && 
					snArr[Integer.valueOf(sValArr[1])-1].compareTo("B") == 0 ){
				inversion++;
			}
		}
		if(relationships == inversion)
			System.out.println("Not possible");
		else
		System.out.println(inversion);
		
	}
	
}
