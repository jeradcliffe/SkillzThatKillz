package main;

import java.util.Arrays;

public class ArrayStringUtils {

	public static boolean areAllCharactersUnique(String input) {

		char[] inputChars = input.replace(" ", "").toCharArray();
		for (int i = 0; i < inputChars.length; i++) {
			for (int j = i + 1; j < inputChars.length; j++) {
				if (inputChars[i] == inputChars[j])
					return false;
			}
		}
		return true;
	}

	public static boolean isPalindrone(String input) {

		String upCaseInput = input.toUpperCase();
		String charOnlyInput = upCaseInput.replaceAll("[^A-Za-z0-9]", "");

		for (int i = 0; i < charOnlyInput.length() / 2; i++) {
			if (charOnlyInput.charAt(i) != charOnlyInput.charAt(charOnlyInput.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}

	public static String sortString(String input) {
		char[] inputChars = input.toCharArray();
		Arrays.sort(inputChars);
		return new String(inputChars);
	}
}
