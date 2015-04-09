import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class ThebestInternetBrowser {
	/**
	 * @author sudipta.a.dutta
	 * 
	 * @project Challenges
	 * @file ThebestInternetBrowser.java
	 * @package
	 * @date Mar 16, 2015
	 * @todo TODO
	 */

	public static void main(String args[]) throws Exception {
		String filename = "in.txt";		 
		System.setIn(new FileInputStream(filename));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		for (int i = 0; i < N; i++) {
			String srt = br.readLine();
			int val = srt.length();
			String[] arr = srt.split("\\.");
			srt = arr[1];
			srt = srt.replaceAll("a", "");
			srt = srt.replaceAll("e", "");
			srt = srt.replaceAll("i", "");
			srt = srt.replaceAll("o", "");
			srt = srt.replaceAll("u", "");

			System.out.println(srt.length()+4+"/"+val);
		}

	}

}
