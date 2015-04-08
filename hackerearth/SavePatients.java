package hackerearth;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SavePatients {

	static List<Integer> arrVac = new ArrayList<Integer>();
	static List<Integer> arrPat = new ArrayList<Integer>();

	public static void main(String args[]) throws Exception {

		System.setIn(new FileInputStream("in.txt"));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);

		String strengthOfVaccines = br.readLine();
		String midichloriansCount = br.readLine();

		String[] sov = strengthOfVaccines.split(" ");
		String[] mc = midichloriansCount.split(" ");

		for (int j = 0; j < sov.length; j++) {
			arrVac.add(Integer.valueOf(sov[j]));
			arrPat.add(Integer.valueOf(mc[j]));

		}

		Collections.sort(arrVac);
		Collections.sort(arrPat);
		boolean flag = true;
		for (int j = 0; j < arrVac.size(); j++) {
			if (arrVac.get(j) < arrPat.get(j)) {
				flag = false;
			}
		}

		if (flag) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}