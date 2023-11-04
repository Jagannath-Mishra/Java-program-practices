package com.practics.set.java.java8practics;

import java.util.Arrays;
import java.util.List;

public class EvenOdd {

	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,1,3,4,5,3,6,54,10);
		list.stream().filter(a -> a%2==0).forEach(System.out::println);
	}
}
