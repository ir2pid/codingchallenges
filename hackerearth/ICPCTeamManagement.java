package hackerearth;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ICPCTeamManagement {

	public static void main(String args[]) throws Exception {

		ArrayList<Integer> iArr = new ArrayList<Integer>();

		// Read input from stdin and provide input before running
		String filename = "in.txt";

		System.setIn(new FileInputStream(filename));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line = br.readLine();
		int N = Integer.valueOf(line);
		
		for(int i=0;i<N;i++){

			String line2 = br.readLine();
			ArrayList<Integer> arrInt = splitInt(line2);
			Map<Integer, Integer>mapInt = new HashMap<Integer, Integer>();
			int total = arrInt.get(0);
			int perCamp = arrInt.get(1);
			for(int j=0;j<total;j++){
				String line3 = br.readLine();
				int len = line3.length();
				addtoMap(mapInt, len);
			}
			
			boolean possible = true;
			for (Entry<Integer, Integer> entry : mapInt.entrySet())
			{
				if(entry.getValue()%perCamp!=0){
					possible = false;
				}
			}
			
			if(possible)
				System.out.println("Possible");
			else
				System.out.println("Not possible");
		}
	}
	
	private static void addtoMap(Map<Integer, Integer>mapInt, int len){
		
		if(mapInt.get(len)!= null){
			mapInt.put(len, mapInt.get(len)+1);
		}else{
			mapInt.put(len, 1);
		}
	}

	private static String[]splitString(String s){
		
		return s.split(" ");
		
	}
	
	private static ArrayList<Integer> splitInt(String s){
		
		ArrayList<Integer> arrInt = new ArrayList<Integer>();
		String[]strArr = s.split(" ");
		
		for(int i=0;i<strArr.length;i++){
			arrInt.add(Integer.valueOf(strArr[i]));
		}
		
		return arrInt;
	}
}
