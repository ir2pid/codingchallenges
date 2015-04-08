package hackerearth;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class NumberOfRs {
	
	/*3
	RKKRK
	RKKR
	KRRRRKRKK*/
	static ArrayList<String> arr = new ArrayList<String>();
	static ArrayList<Integer> arrA = new ArrayList<Integer>();
	static ArrayList<Integer> arrB = new ArrayList<Integer>();
	
	public static void main(String args[]) throws Exception {


		// Read input from stdin and provide input before running
		String filename = "cd";

		System.setIn(new FileInputStream(filename));


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int line = Integer.valueOf(br.readLine());
		
		for(int i=0;i<line;i++)
		{
			String vals = br.readLine();
			getSpan(vals);
			getLength();
			System.out.println(arrA);
			System.out.println(arrB);
			arrA.clear();
			arrB.clear();
		}

	}
	public static void getLength()
	{
		int len = -1;
		int start = -1;
		int stop = -1;
		for(int i=0;i<arrA.size();i++)
		{
			int diff = arrB.get(i) - arrA.get(i)+1;
			if(len<diff)
			{
				len = diff;
				start = arrA.get(i);
				stop = arrB.get(i);
			}
		}

		System.out.println(len);
		System.out.println(start);
		System.out.println(stop);
	}
	public static void getSpan(String s)
	{
		int len = 0;
		int a = -1;
		int b = -1;
		
		boolean gotK = false;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i) == 'K')
			{
				if(gotK && a!=-1){
					b = i;
				}else
				{
					gotK = true;
					a = i;
					b = i;
					arrA.add(a);
				}
			}else{
				if(b!=-1)
				{
					arrB.add(b);
					gotK = false;
					a = -1;
					b = -1;
				}
			}
		}
		if(b!=-1)
		{
			arrB.add(b);
			a = -1;
			b = -1;
		}
		//System.out.println(len);
	}
}
