package codehack;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SecretCode {

	public static void main(String args[]) throws Exception {

		String filename = "cd";

		System.setIn(new FileInputStream(filename));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		
		for (int i = 0; i < N; i++) {

			String vals = br.readLine();
			String[] str = vals.split(" ");
			int a = Integer.valueOf(str[0]);
			int b = Integer.valueOf(str[1]);
			boolean flag = false;
			int count = 0;
			for(int j=a;j<b;j++)
			{
				if(!validate(j))
				{
					continue;
				}
				else
				{
					count++;
				}
			}
			System.out.println(count);
		}
	}
	
	public static boolean validate(int no)
	{
		while(no>0)
		{
			if(no%10 != 3 && no%10 != 5)
				return false;
			else
				no = no/10;
		}
		return true;
	}
}
