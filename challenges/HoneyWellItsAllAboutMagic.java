package challenges;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class HoneyWellItsAllAboutMagic {

	public static void main(String args[]) throws Exception {

		String filename = "cd";
		System.setIn(new FileInputStream(filename));

		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(System.in));
		String inputT = bufferedReader.readLine();

		int iT = Integer.valueOf(inputT);

		for (int i = 0; i < iT; i++) {
			String inputM = bufferedReader.readLine();
			int iM = Integer.valueOf(inputM);
			getMagic(iM);
		}
	}

	public static void getMagic(int iM) {

		BigInteger biZeros = BigInteger.ZERO;
		BigInteger biOnes = BigInteger.ONE;
		for (int j = 0; j < iM; j++) {

			BigInteger biSwap = biZeros;
			biZeros = biOnes;
			biOnes = BigInteger.ZERO;
			if (biSwap.compareTo(BigInteger.ZERO) > 0) {
				biZeros = biZeros.add(biSwap);
				biOnes = biOnes.add(biSwap);
			}

		}
		System.out.println(biOnes.toString() + " " + biZeros.toString());
	}
}
