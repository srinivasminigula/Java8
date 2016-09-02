package com.j8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author srinivas_minigula
 *
 */
public class ComparatorLambda {

	public static void main(String[] args) {

		/**
		 * Regular usage of comparator
		 */
		Comparator<String> compartor = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return Integer.compare(o2.length(), o1.length());
			}
		};

		String[] list = { "**", "****", "*", "***" };
		List<String> stars = Arrays.asList(list);
		Collections.sort(stars, compartor);
		stars.forEach(System.out::println);
		System.out.println("=======================");

		/**
		 * With Lambda Expression
		 **/
		Collections.sort(stars, (a, b) -> Integer.compare(a.length(), b.length()));
		stars.forEach(System.out::println);
		System.out.println("=======================");

		/**
		 * Very concise Lambda Expression  String::compareTo
		 **/
		String[] wordsArray = { "mud", "base", "ant", "iron" };
		List<String> wordsList = Arrays.asList(wordsArray);
		Collections.sort(wordsList, String::compareTo);
		wordsList.forEach(System.out::println);
		System.out.println("=======================");

		/**
		 * Very concise Lambda Expression Integer::compare
		 */
		Integer[] intArray = { 1, 7, 5, 3, 9, 2, 8, 6, 4 };
		List<Integer> intList = Arrays.asList(intArray);
		Collections.sort(intList, Integer::compare);
		intList.forEach(System.out::println);
		System.out.println("=======================");

	}
}
