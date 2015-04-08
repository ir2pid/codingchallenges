package spoj;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class ADDREV {

	public static void main(String args[]) throws Exception {

		String filename = "in.txt";
		System.setIn(new FileInputStream(filename));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);

		for (int i = 0; i < N; i++) {
			String num = br.readLine();
			String arr[] = num.split(" ");
			int a = Integer.valueOf(rev(arr[0]));
			int b = Integer.valueOf(rev(arr[1]));
			int c = a+b;
			c = Integer.valueOf(rev(String.valueOf(c)));
			System.out.println(c);
		}
	}
	
	static String rev(String s){
		StringBuffer sb = new StringBuffer();
		for(int i=s.length()-1;i>=0;i--){
			sb.append(s.charAt(i));
		}
		
		return sb.toString();
	}
}
