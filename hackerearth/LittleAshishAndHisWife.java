package hackerearth;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;

public class LittleAshishAndHisWife {

	public static void main(String args[]) throws Exception {

		// Read input from stdin and provide input before running
		String filename = "in.txt";

		System.setIn(new FileInputStream(filename));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line = br.readLine();
		int N = Integer.valueOf(line);
		
		for(int i=0;i<N;i++){

			String line2 = br.readLine();
			String line3 = br.readLine();
			ArrayList<Integer>arr1 = splitInt(line2);
			HashSet<Integer>arr2 = splitIntSet(line3);
			if(arr1.get(1) == arr2.size())
				System.out.println("Perfect husband");
			else if(arr1.get(1) < arr2.size()){
				System.out.println("Lame husband");				
			}
			else if(arr1.get(1) > arr2.size()){
				System.out.println("Bad husband");				
			}
		}
	}	

	private static ArrayList<Integer> splitInt(String s){
		
		ArrayList<Integer> arrInt = new ArrayList<Integer>();
		String[]strArr = s.split(" ");
		
		for(int i=0;i<strArr.length;i++){
			arrInt.add(Integer.valueOf(strArr[i]));
		}
		
		return arrInt;
	}	

	private static HashSet<Integer> splitIntSet(String s){
		
		HashSet<Integer> arrInt = new HashSet<Integer>();
		String[]strArr = s.split(" ");
		
		for(int i=0;i<strArr.length;i++){
			arrInt.add(Integer.valueOf(strArr[i]));
		}
		
		return arrInt;
	}
}
