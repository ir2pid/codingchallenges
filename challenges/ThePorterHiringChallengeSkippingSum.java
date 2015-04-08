package challenges;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class ThePorterHiringChallengeSkippingSum {
	
	static int[]nArr;
	
	public static void main(String args[]) throws Exception {
		
		String filename = "cd";

		System.setIn(new FileInputStream(filename));
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input1 = br.readLine();
		String[] nqVals = input1.split(" ");
		
		int n = Integer.valueOf(nqVals[0]);
		int q = Integer.valueOf(nqVals[1]);

		String input2 = br.readLine();
		String[] sArrs = input2.split(" ");
		
		nArr = getIntArr(sArrs);
		
		for (int j = 0; j < q; j++) {
			
			String input3 = br.readLine();
			String[] sValArr = input3.split(" ");
			//int[]iValArr = getIntArr(sValArr);
			getSkippingSum(sValArr);
		}
	}
	
	private static int[] getIntArr(String[] str){
		
		int[] iArrs = new int[str.length];		
		
		for(int i = 0;i<str.length;i++)
		{
			iArrs[i] = Integer.valueOf(str[i]);
		}
		return iArrs;		
	}
	
	private static void getSkippingSum(String[] str){
		int[]iValArr = getIntArr(str);
		
        int sum = 0;
        int l = iValArr[0];
        int r = iValArr[1];
        int k = iValArr[2];
        while (l <= r){
                  sum = sum + nArr[l-1];
                  l = l + k; 
        }
           System.out.println(sum);
	}
}
