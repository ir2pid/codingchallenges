import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;

public class LongestIncreasingPath {
	/**
	 * @author sudipta.a.dutta
	 * 
	 * @project Challenges
	 * @file LongestIncreasingPath.java
	 * @package
	 * @date Mar 18, 2015
	 * @todo TODO
	 */

	static ArrayList<ArrayList<Integer>> array2D = new ArrayList<ArrayList<Integer>>();
	static int widthX = 0;
	static int heightY = 0;
	static int max = 1;

	public static void main(String args[]) throws Exception {

		System.setIn(new FileInputStream("in.txt"));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		for (int i = 0; i < N; i++) {
			read(br);
			array2D.clear();
			max = 1;
		}
	}

	public static void read(BufferedReader br) throws IOException {
		String sDim = br.readLine();
		String[] arr = sDim.split(" ");
		int dim = Integer.valueOf(arr[0]);
		for (int i = 0; i < dim; i++) {
			String input = br.readLine();
			array2D.add(split(input));
		}
		setArrDim();
		evaluate(0, 0, 0);
		System.out.println(max);
	}

	public static ArrayList<Integer> split(String input) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		String[] arr = input.split(" ");
		for (int i = 0; i < arr.length; i++) {
			ret.add(Integer.valueOf(arr[i]));
		}
		return ret;
	}

	public static int evaluate(int x, int y, int sum) {
		++sum;
		if (y < widthX) {
			if (doProgress(getArrVal(x, y), getArrVal(x, y + 1))) {
				
				//System.out.println(sum);
				evaluate(x, y + 1, sum);
			}
		}
		if (x < heightY) {
			if (doProgress(getArrVal(x, y), getArrVal(x + 1, y))) {
				
				//System.out.println(sum);
				evaluate(x + 1, y, sum);
			}
		}  
			if (sum > max)
				max = sum;
			
		
		return sum;
	}

	public static int getArrVal(int x, int y) {
		if (y > widthX && x > heightY) {
			return '0';
		}
		return array2D.get(y).get(x);
	}

	public static void setArrDim() {
		widthX = array2D.size() - 1;
		heightY = array2D.get(0).size() - 1;
	}

	public static boolean doProgress(int a, int b) {
		//System.out.println(a+"vs"+b);		
		//return Character.toLowerCase(a) < Character.toLowerCase(b);
		return a<b;
	}
}
