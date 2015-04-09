import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;



public class SherlockandDate {
	/**
	 * @author sudipta.a.dutta
	 *
	 * @project Challenges
	 * @file SherlockandDate.java
	 * @package 
	 * @date Mar 16, 2015
	 * @todo TODO
	 */	

	public static void main(String args[]) throws Exception {
		String filename = "in.txt";		 
		System.setIn(new FileInputStream(filename));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.valueOf(line).intValue();
		for (int i = 0; i < N; i++) {
			String input = br.readLine();
			SimpleDateFormat formatter = new SimpleDateFormat("d MMMM yyyy");
			Date d = formatter.parse(input);
			Date dateBefore = new Date(d.getTime() - 1 * 24 * 3600 * 1000l );
			System.out.println(formatter.format(dateBefore));			
			
		}

	}
}
