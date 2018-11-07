package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import main.ArrayStringUtils;

public class ArrayStringUtilsTest {

	@Test
	public void areAllCharactersUnique_returnsFalse() {
		boolean actual = ArrayStringUtils.areAllCharactersUnique("hello");
		assertFalse(actual);
	}

	@Test
	public void areAllCharactersUnique_returnsTrue() {
		boolean actual = ArrayStringUtils.areAllCharactersUnique("abc defg hijk lmno");
		assertTrue(actual);
	}

	@Test
	public void isPalindrone_returnsTrue_removesSpecialChars() {
		assertTrue(ArrayStringUtils.isPalindrone("12abc::ba 21"));
	}

	@Test
	public void isPalindrone_returnsTrue_testWithNotSpecialChars_evenNumberOfLetters() {
		assertTrue(ArrayStringUtils.isPalindrone("Abccba"));
	}

	@Test
	public void isPalindrone_returnsTrue_testWithNotSpecialChars_oddNumberOfLetters() {
		assertTrue(ArrayStringUtils.isPalindrone("abcba"));
	}

	@Test
	public void sortString_returnsTrue() {
		String actual = ArrayStringUtils.sortString("cba");
		assert (actual).equals("abc");
	}

	@Test
	public void sortStringWithCaps_returnsTrue() {
		String actual = ArrayStringUtils.sortString("baC");
		assert (actual).equals("Cab");
	}
}
