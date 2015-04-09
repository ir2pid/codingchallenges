import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RoyAndProfilePicture {
	/**
	 * @author sudipta.a.dutta
	 * 
	 * @project Challenges
	 * @file RoyAndProfilePicture.java
	 * @package
	 * @date Mar 19, 2015
	 * @todo TODO
	 */
	
	public static void main(String args[]) throws Exception {

		System.setIn(new FileInputStream("in.txt"));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line1 = br.readLine();
		int N = Integer.parseInt(line1);

		for (int i = 0; i < N; i++) {
			List<Integer>iArr = new ArrayList<Integer>();
			String line2 = br.readLine();
			int size = Integer.parseInt(line2);
			
			String input = br.readLine();
			String[] arr = input.split(" ");
			
			for(int j=0; j<arr.length;j++){
				iArr.add(Integer.valueOf(arr[j]));
			}
			Collections.sort(iArr);
			String line3 = br.readLine();
			String[] arr2 = line3.split(" ");
			int a = Integer.valueOf(arr2[0]);
			int b = Integer.valueOf(arr2[1]);
			int il = iArr.size()-a;
			int js = b-1;
			System.out.println(iArr.get(il)+iArr.get(js));
		}
	}

}
