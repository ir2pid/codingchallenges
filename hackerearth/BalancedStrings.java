import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map.Entry;

public class BalancedStrings {
	/**
	 * @author sudipta.a.dutta
	 * 
	 * @project Challenges
	 * @file BalancedStrings.java
	 * @package
	 * @date Mar 17, 2015
	 * @todo TODO
	 */

	static HashMap<Character, Integer> alphabets = new HashMap<Character, Integer>();

	public static void main(String args[]) throws Exception {
		String filename = "in.txt";
		System.setIn(new FileInputStream(filename));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);

		for (int i = 0; i < N; i++) {
			String input = br.readLine();
			int len = input.length();
			if (len < 26 || len % 26 != 0) {
				System.out.println("No");
			} else {
				init();
				if (isBalanced(input))
					System.out.println("Yes");
				else
					System.out.println("No");
			}
		}
	}

	public static boolean isBalanced(String s) {
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int count = alphabets.get(c);
			alphabets.put(c, ++count);
		}

		int val = alphabets.get('a');
		for (Entry<Character, Integer> entry : alphabets.entrySet()) {
			if (val != entry.getValue()) {
				return false;
			}

		}
		return true;
	}

	public static void init() {
		alphabets.put('a', 0);
		alphabets.put('b', 0);
		alphabets.put('c', 0);
		alphabets.put('d', 0);
		alphabets.put('e', 0);
		alphabets.put('f', 0);
		alphabets.put('g', 0);
		alphabets.put('h', 0);
		alphabets.put('i', 0);
		alphabets.put('j', 0);
		alphabets.put('k', 0);
		alphabets.put('l', 0);
		alphabets.put('m', 0);
		alphabets.put('n', 0);
		alphabets.put('o', 0);
		alphabets.put('p', 0);
		alphabets.put('q', 0);
		alphabets.put('r', 0);
		alphabets.put('s', 0);
		alphabets.put('t', 0);
		alphabets.put('u', 0);
		alphabets.put('v', 0);
		alphabets.put('w', 0);
		alphabets.put('x', 0);
		alphabets.put('y', 0);
		alphabets.put('z', 0);
	}
}
