package net.vac.jtl.util;

import java.util.Random;

public class UT {

	public static void coinflip(String decision1, String decision2) {
		Random random = new Random();

		int randomNumber = random.nextInt(2);

		if (randomNumber == 1) {
			System.out.println("50/50 Decision result: " + decision1);
		} else {
			System.out.println("50/50 Decision result: " + decision2);
		}
	}

	public static String addSpacesToString(String input) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < input.length(); i++) {
			sb.append(input.charAt(i)).append(" ");
		}
		return sb.toString().trim();
	}

}
