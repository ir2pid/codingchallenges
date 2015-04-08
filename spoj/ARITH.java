package spoj;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ARITH {

	public static void main(String args[]) throws Exception {

		String filename = "in.txt";
		System.setIn(new FileInputStream(filename));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);

		for (int i = 0; i < N; i++) {
			String num = br.readLine();
			String arr[] = num.split("\\+");
			if (arr.length > 1)
				sum(arr);

			else {
				String arr2[] = num.split("\\-");
				if (arr2.length > 1)
					sub(arr2);
				else {
					String arr3[] = num.split("\\*");
					if (arr3.length > 1)
						mul(arr3);
				}
			}

			System.out.println();
		}
	}

	public static void sum(String arr[]) {
		int out = Integer.valueOf(arr[0]) + Integer.valueOf(arr[1]);
		printSum(arr, out);
		// System.out.println(out);
	}

	public static void sub(String arr[]) {
		int out = Integer.valueOf(arr[0]) - Integer.valueOf(arr[1]);
		printSub(arr, out);
		// System.out.println(out);
	}

	public static void mul(String arr[]) {
		int out = Integer.valueOf(arr[0]) * Integer.valueOf(arr[1]);
		printMul(arr, out);
	}
	
	public static void printMul(String arr[], int out) {
		String a = arr[0];
		String b = arr[1];
		String s = String.valueOf(out);

		int max = s.length();

		if (b.length() + 1 > max) {
			max = b.length() + 1;
		}

		int diff = max - a.length();

		StringBuffer sb1 = new StringBuffer();
		for (int i = 0; i < diff; i++) {
			sb1.append(" ");
		}
		sb1.append(a);

		diff = max - b.length();
		StringBuffer sb2 = new StringBuffer();
		for (int i = 0; i < diff - 1; i++) {
			sb2.append(" ");
		}
		sb2.append("*");
		sb2.append(b);

		diff = max - s.length();
		StringBuffer sb3 = new StringBuffer();
		for (int i = 0; i < diff; i++) {
			sb3.append(" ");
		}
		sb3.append(s);

		System.out.println(sb1);
		System.out.println(sb2);

		if (b.length() > 1) {
			for (int i = 0; i < max; i++)
				System.out.print("-");
			System.out.println("");
			int gap = 0;
			for (int i = b.length() - 1; i >= 0; i--) {
				StringBuffer sb4 = new StringBuffer();
				int x = Integer.valueOf(a);
				char y = (char) b.charAt(i);
				int z = Integer.valueOf(String.valueOf(y));
				String mul = String.valueOf(x * z);
				
				
				diff = max-mul.length();
				for (int j = 0; j < diff-gap; j++) {
					sb4.append(" ");
				}
				sb4.append(mul);
				gap++;
				System.out.println(sb4.toString());
			}
		}

		for (int i = 0; i < max; i++)
			System.out.print("-");

		System.out.println();
		System.out.println(sb3);

	}

	public static void printSum(String arr[], int out) {
		String a = arr[0];
		String b = arr[1];
		String s = String.valueOf(out);

		int max = s.length();

		if (b.length() + 1 > max) {
			max = b.length() + 1;
		}

		int diff = max - a.length();

		StringBuffer sb1 = new StringBuffer();
		for (int i = 0; i < diff; i++) {
			sb1.append(" ");
		}
		sb1.append(a);

		diff = max - b.length();
		StringBuffer sb2 = new StringBuffer();
		for (int i = 0; i < diff - 1; i++) {
			sb2.append(" ");
		}
		sb2.append("+");
		sb2.append(b);

		diff = max - s.length();
		StringBuffer sb3 = new StringBuffer();
		for (int i = 0; i < diff; i++) {
			sb3.append(" ");
		}
		sb3.append(out);

		System.out.println(sb1);
		System.out.println(sb2);

		for (int i = 0; i < max; i++)
			System.out.print("-");

		System.out.println();
		System.out.println(sb3);

	}

	public static void printSub(String arr[], int out) {
		String a = arr[0];
		String b = arr[1];
		String s = String.valueOf(out);

		int max = s.length();

		if (b.length() + 1 > max) {
			max = b.length() + 1;
		}

		if (a.length() > max) {
			max = a.length();
		}

		int diff = max - a.length();

		StringBuffer sb1 = new StringBuffer();
		for (int i = 0; i < diff; i++) {
			sb1.append(" ");
		}
		sb1.append(a);

		diff = max - b.length();
		StringBuffer sb2 = new StringBuffer();
		for (int i = 0; i < diff - 1; i++) {
			sb2.append(" ");
		}
		sb2.append("-");
		sb2.append(b);

		diff = max - s.length();
		StringBuffer sb3 = new StringBuffer();
		for (int i = 0; i < diff; i++) {
			sb3.append(" ");
		}
		sb3.append(out);

		System.out.println(sb1);
		System.out.println(sb2);

		for (int i = 0; i < max; i++)
			System.out.print("-");

		System.out.println();
		System.out.println(sb3);

	}
}
