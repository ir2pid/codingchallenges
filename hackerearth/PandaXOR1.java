package hackerearth;

/* IMPORTANT: class must not be public. */

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class PandaXOR1 {

	static ArrayList<List<Integer>> powerSet = new ArrayList<List<Integer>>();
	static ArrayList<Integer> maxorSet = new ArrayList<Integer>();
	static int occurance = 0;

	public static void main(String args[]) throws Exception {

		ArrayList<Integer> arr = new ArrayList<Integer>();

		// Read input from stdin and provide input before running
		String filename = "PandaXOR1";

		System.setIn(new FileInputStream(filename));
		//Scanner stdin = new Scanner(new BufferedInputStream(System.in));

		// int arrLen = stdin.nextInt();
		// System.out.println(arrLen);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		// int N = Integer.parseInt(line);
		// for (int i = 0; i < N; i++) {
		// System.out.println("hello world");
		// }
		String vals = br.readLine();
		/* String vals = stdin.readLine(); */
		String[] str = vals.split(" ");
		for (String s : str)
			arr.add(Integer.valueOf(s));

		buildPowerSet(arr);

		// System.out.println("powerSet size" + powerSet.size());
		// System.out.println("powerSet toString" + powerSet.toString());
		// System.out.println("maxorSet size" + maxorSet.size());
		// System.out.println("maxorSet toString" + maxorSet.toString());
		// System.out.println("occurance" + occurance);
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
		if (maxorSet.contains(temp))
			occurance++;
		maxorSet.add(temp);
		if(occurance == 3576)
			System.out.println("yipee");
	}

}