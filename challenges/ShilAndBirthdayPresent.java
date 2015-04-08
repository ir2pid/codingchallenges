package challenges;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ShilAndBirthdayPresent {

	static ArrayList<List<Integer>> powerSet = new ArrayList<List<Integer>>();

	public static void main(String args[]) throws Exception {

		ArrayList<Integer> iArr = new ArrayList<Integer>();

		// Read input from stdin and provide input before running
		String filename = "in.txt";

		System.setIn(new FileInputStream(filename));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line1 = br.readLine();
		
		String line2 = br.readLine();
		String[] sArr = line2.split(" ");
		
		for(int i=0;i<sArr.length;i++){
			iArr.add(Integer.valueOf(sArr[i]));
		}
		
		buildPowerSet(iArr);
		System.out.println(powerSet);
		evaluate();
	}

	private static void evaluate() {
				
		int val = 0;
		for (int i = 0; i < powerSet.size(); i++) {
			if(powerSet.get(i).get(0) != powerSet.get(i).get(1))
			{
				System.out.println(powerSet.get(i).get(0) + " vs " + powerSet.get(i).get(1));
				val++;
			}
		}
		System.out.println(val);
	}
	
	private static void buildPowerSet(List<Integer> list) {
		if (!powerSet.contains(list) && list.size() == 2) {
			powerSet.add(list);
		}

		for (int i = 0; i < list.size(); i++) {
			List<Integer> temp = new ArrayList<Integer>(list);
			temp.remove(i);
			if (temp.size() >= 0)
				buildPowerSet(temp);
		}
	}
}
