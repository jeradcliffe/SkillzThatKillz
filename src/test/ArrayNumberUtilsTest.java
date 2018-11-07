package test;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

import main.ArrayNumberUtils;

public class ArrayNumberUtilsTest {

	@Test
	public void combineAndSortTest() {
		int[] expected = new int[] { 1, 2, 3, 4, 5, 6 };
		int[] actual = ArrayNumberUtils.combineAndSort(new int[] { 3, 2, 1 }, new int[] { 6, 5, 4 });
		assertTrue(doAllElementsMatch(actual, expected));
	}

	public boolean doAllElementsMatch(int[] array1, int[] array2) {
		if (array1.length != array2.length)
			return false;

		Arrays.sort(array1);
		Arrays.sort(array2);
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] != array2[i])
				return false;
		}

		return true;
	}

//	@Test public void combineStreams() {
//		int[] array1 = new int[] {1, 2, 3};
//		int[] array2 = new int[] {3, 4, 5};
//
//		ArrayNumberUtils.combineIntArrayToIntStream(array1, array2);
//	}

	@Test
	public void rankTest() {
		int[] expected = new int[] { 4, 3, 6, 5, 2, 7, 1 };
		int[] actual = ArrayNumberUtils.rankArray(new int[] { 4, 3, 6, 5, 2, 7, 1 });
		assertTrue(doAllElementsMatch(actual, expected));
	}
}
