package com.j8.streams;

import java.util.Arrays;
import java.util.List;

/**
 * Implementation and testing class for Java 8 stream API basics and sample
 * programs
 * 
 */
public class Streams {
	public static void main(String[] args) {
		System.out.println("Basics stream pipeline operations ono - by - one");
		List<String> nameList = Arrays.asList("John", "Oliver", "John","John", "Rob", "Philip", null, null);
		nameList.stream().filter(p->p!=null).sorted().map(s->s.toUpperCase()).sorted().distinct().forEach(System.out::println);
		System.out.println("Hellow Java 8 Streams");
	}
}
