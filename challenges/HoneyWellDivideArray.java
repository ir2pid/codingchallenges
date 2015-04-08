package challenges;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HoneyWellDivideArray {

	static ArrayList<Integer> divisors = new ArrayList<Integer>();
	static ArrayList<Integer> remainders = new ArrayList<Integer>();
	static HashMap<Integer, Integer> dividends = new HashMap<Integer, Integer>();

	public static void main(String args[]) throws Exception {

		String filename = "cd";
		System.setIn(new FileInputStream(filename));
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(System.in));

		String sSkip = bufferedReader.readLine();
		String sArray = bufferedReader.readLine();
		String[] arr = sArray.split(" ");
		int counter = 0;
		for (String s : arr) {
			int iVal = Integer.valueOf(s);
			dividends.put(counter, iVal);
			remainders.add(iVal);
			counter++;
		}
		remainders.ensureCapacity(dividends.size());
		String str2 = bufferedReader.readLine();
		int Q = Integer.valueOf(str2);
		for (counter = 0; counter < Q; counter++) {
			int iDiv = Integer.valueOf(bufferedReader.readLine());
			if(iDiv!=0&&iDiv!=1)
				divisors.add(Integer.valueOf(iDiv));
		}
		for (int k = 0; k < divisors.size(); k++) {
			Iterator<Map.Entry<Integer, Integer>> iter = dividends.entrySet()
					.iterator();
			while (iter.hasNext()) {
				Map.Entry<Integer, Integer> entry = iter.next();
				Integer div = entry.getValue() / divisors.get(k);
				if (div == 0) {
					iter.remove();
				} else {
					entry.setValue(div);
				}
				remainders.set(entry.getKey(), div);
			}
		}

		for (int j = 0; j < remainders.size(); j++) {
			if (j != 0)
				System.out.print(" ");
			System.out.print(remainders.get(j));
		}

	}
}
