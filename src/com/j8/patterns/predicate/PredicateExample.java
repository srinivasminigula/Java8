package com.j8.patterns.predicate;

import java.util.function.Predicate;

public class PredicateExample {
	public static void main(String[] args) {
		Predicate<String> p1 = s -> s.length() < 20;
		Predicate<String> p2 = s -> s.length() < 20;
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p1.and(p2));
		System.out.println(Predicate.isEqual(p2));
	}

}
