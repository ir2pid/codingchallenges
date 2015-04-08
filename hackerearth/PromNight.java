package hackerearth;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class PromNight {

	public static void main(String args[]) throws Exception {
		System.setIn(new FileInputStream("in.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		ArrayList<Integer> bArr = new ArrayList<Integer>();
		ArrayList<Integer> gArr = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			boolean isPossible = true;
			String vals = br.readLine();
			String bHeight = br.readLine();
			String gHeight = br.readLine();
			String[] bHeightArr = bHeight.split(" ");
			String[] gHeightArr = gHeight.split(" ");
			int j = 0;
			for (j = 0; j < bHeightArr.length; j++) {
				bArr.add(Integer.valueOf(bHeightArr[j]));
				if (j < gHeightArr.length)
					gArr.add(Integer.valueOf(gHeightArr[j]));
			}
			for (; j < gHeightArr.length; j++) {
				gArr.add(Integer.valueOf(gHeightArr[j]));
			}

			Collections.sort(bArr);
			Collections.sort(gArr);

			for (j = 0; j < bArr.size(); j++) {
				if (bArr.get(j) < gArr.get(0)) {
					isPossible = false;
					break;
				} else
					gArr.remove(0);
			}
			if (isPossible == true)
				System.out.println("YES");
			else
				System.out.println("NO");
			bArr.clear();
			gArr.clear();
		}

	}
}
