package com.j8.patterns.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author srinivas_minigula
 *
 */
public class ConsumerExample {

	public static void main(String[] args) {
		Consumer<String> sysout = System.out::println;
		List<String> names = Arrays.asList("David", "Peter", "Albert", "Wilson", "Alfred");

		names.stream().forEach(sysout);
		System.out.println("=========");
		names.stream().sorted().forEach(sysout);
		
		List<String> newTempList = new ArrayList<String>();
		Consumer<String> eleCount = newTempList::add;
		names.forEach(sysout.andThen(eleCount));
		System.out.println("=========");
		
		System.out.println(newTempList.size());

	}

}
