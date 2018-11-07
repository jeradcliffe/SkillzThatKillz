package main;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class ArrayNumberUtils {

	private static int[] combine(int[] array1, int[] array2) {
		int[] comboArray = new int[array1.length + array2.length];
		System.arraycopy(array1, 0, comboArray, 0, array1.length);
		System.arraycopy(array2, 0, comboArray, array1.length, array2.length);
		return comboArray;
	}

	public static int[] combineAndSort(int[] array1, int[] array2) {

		int[] comboArray = combine(array1, array2);
		Arrays.sort(comboArray);
		return comboArray;
	}

	public static int[] rankArray(int[] input) {
		Map<Integer, Integer> map = new TreeMap<>();

		for (int i = 0; i < input.length; i++) {
			map.put(input[i], i);
		}

		int rank = 1;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			input[entry.getValue()] = rank++;
		}

		return input;
	}

//	public static List<int[]> combineIntArrayToIntStream(int[] array1, int[] array2) {		
//		int[][] comboList = new int[][] {arrray1, array2};
//		comboList.add(array1);
//		comboList.add(array2);
//		return comboList.stream()
//				.flatMap(x -> x.)
//				.collect(Collectors.toList());
//	}
}
