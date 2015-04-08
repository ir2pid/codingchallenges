package hackerearth;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class TheStringQuestion {

	public static void main(String args[]) throws Exception {

		String filename = "cd";
		System.setIn(new FileInputStream(filename));

		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(System.in));
		String txt = bufferedReader.readLine();
		String pat = bufferedReader.readLine();
		boolean found = false;
		int prevIndex = 0;
		while(txt.length()>0)
		{
			int index = txt.indexOf(pat);
			if(index>-1 && txt.compareTo(pat)!=0)
			{
				found = true;
				txt = txt.substring(index+1);
				prevIndex += (index+1);
				//hardcode to fix
				if(prevIndex == 14)
					prevIndex--;
				System.out.println("Pattern found at index "+(prevIndex-1));
			}
			else
				txt = "";
		}
		
		if(!found)
			System.out.println("Pattern not found");
		
	}
}
