package challenges;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class CouponDunia2 {

	public static void main(String args[]) throws Exception {
		
		String filename = "cd";

		System.setIn(new FileInputStream(filename));
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int line = Integer.parseInt(br.readLine());
		int maxlen;
		for (int i = 0; i < line; i++) {
			String s = br.readLine();
			String[] vals = s.split(" ");
			int r = Integer.valueOf(vals[0]);
			int k = Integer.valueOf(vals[1]);
			int v = Integer.valueOf(vals[2]);
			maxlen = 0;
					
			if(r<=k && r<=v)
			{
				if(k<=v)
					maxlen = getLen(k,v);
				else
					maxlen = getLen(v,k);
			}
			else if(k<=r && k<=v)
			{
				if(r<=v)
					maxlen = getLen(r,v);
				else
					maxlen = getLen(v,r);
			}
			else if(v<=r && v<=k)
			{
				if(r<=k)
					maxlen = getLen(r,k);
				else
					maxlen = getLen(k,r);
			}
	       // System.out.println("values" + a+ " " + b);
	      
	        
	        System.out.println(maxlen);
		}
		
	}
	
	public static int getLen(int a,int b)
	{
		//if(a+1<=b)
		if(a == 0)
		{	if(b == 0)
				return 0;
			return 1;
		}
		else if(a == b)
			return a + b;
		else return (2*a)+1;
	}
}
