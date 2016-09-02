package com.j8.interfaces;

import java.util.LinkedList;
import java.util.List;

public class StreamsReduce {
	public static void main(String[] args) {
		List<String> names = new LinkedList<String>();
		names.add("Boot");
		names.add("PhilWeb");
		names.add("Security");
		names.add("Rob Winch");
		names.add("Data");
		names.add("Oliver Gierke");
		String concatinated = names.stream().sorted().reduce("", (a, b) -> a + b);
		System.out.println(concatinated);
	}
}
