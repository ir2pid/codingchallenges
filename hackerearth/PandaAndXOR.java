import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class PandaAndXOR {
	/**
	 * @author sudipta.a.dutta
	 *
	 * @project Challenges
	 * @file PandaAndXOR.java
	 * @package 
	 * @date Mar 17, 2015
	 * @todo TODO
	 */
	

	static ArrayList<List<Integer>> powerSet = new ArrayList<List<Integer>>();
	static ArrayList<Integer> maxorSet = new ArrayList<Integer>();
	static int occurance = 0;
	public static void main(String args[]) throws Exception {

		ArrayList<Integer> arr = new ArrayList<Integer>();

		// Read input from stdin and provide input before running
		Scanner stdin = new Scanner(new BufferedInputStream(System.in));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String line = br.readLine();

	    String vals = br.readLine();
	    
		String[] str = vals.split(" ");
		for(String s:str)
			arr.add(Integer.valueOf(s));
	

		buildPowerSet(arr);

		System.out.println(occurance);
	}

	private static void buildPowerSet(List<Integer> list) {
		if (!powerSet.contains(list)) {
			powerSet.add(list);
			maxor(list);
		}

		for (int i = 0; i < list.size(); i++) {
			List<Integer> temp = new ArrayList<Integer>(list);
			temp.remove(i);
			if (temp.size() > 0)
				buildPowerSet(temp);
		}
	}

	private static void maxor(List<Integer> list) {
		int temp = list.get(0);
		for (Integer i = 1; i < list.size(); i++) {
			temp = temp ^ list.get(i);
		}
		if(maxorSet.contains(temp))
			occurance++;
		else
			maxorSet.add(temp);
	}
}
