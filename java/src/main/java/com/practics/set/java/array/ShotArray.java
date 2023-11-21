package com.practics.set.java.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ShotArray {

	public static void main(String[] args) {
		// List<Integer> a = Arrays.asList(1,5,5,7,8,98,7,7,88,45,59,66,42,100);
		// java 8 reverse order
		// a.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

		// Java 8 sort in assending order
		// a.stream().sorted().forEach(System.out::println);

		int[] a = { 1, 5, 5, 7, 8, 98, 7, 7, 88, 45, 59, 66, 42, 100 };
		// Arrays.sort(a);
		// for(int arr : a)
		// {
		// System.out.println(arr);
		// }

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	
	for(int arr : a)
		 {
			 System.out.println(arr);
		 }
	}
}
