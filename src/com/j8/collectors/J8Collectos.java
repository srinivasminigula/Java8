package com.j8.collectors;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class J8Collectos {
	public static void main(String[] args) {
		// Accumulate names into a List
		List<String> list = people().stream().map(Person::getName).collect(Collectors.toList());
		list.forEach(System.out::println);
		System.out.println("====================");
		
		// Accumulate names into a TreeSet
	     Set<String> set = people().stream().map(Person::getName).collect(Collectors.toCollection(TreeSet::new));
	     set.forEach(System.out::println);
	     System.out.println("====================");
	     
	  // Convert elements to strings and concatenate them, separated by commas
	     String joined = people().stream().map(Person::getName).collect(Collectors.joining(", "));
	     System.out.println(joined);
	     System.out.println("====================");
	     
	  // Compute sum of salaries of employee
	     double total =  people().stream().collect(Collectors.summingDouble((Person::getSalary)));
	     System.out.println(total);
	     System.out.println("====================");
	     
	  // Group employees by department
	     Map<String, List<Person>> byDept = people().stream().collect(Collectors.groupingBy(Person::getDepartment));
	     byDept.values().forEach(System.out::println);
	     System.out.println("====================");
	     
	  // Compute sum of salaries by department
	     Map<String, Double> totalByDept = people().stream().collect(Collectors.groupingBy(Person::getDepartment, Collectors.summingDouble(Person::getSalary)));
	     totalByDept.values().forEach(System.out::println);
	     System.out.println("====================");
	     
	  // Partition students into passing and failing
	     Map<Boolean, List<Person>> passingFailing =people().stream().collect(Collectors.partitioningBy(s -> s.getGrade() >= Person.PASS_THRESHOLD));
	     passingFailing.values().forEach(System.out::println);
	     System.out.println("====================");
	     
	}

	private static List<Person> people() {
		List<Person> people = new LinkedList<Person>();
		people.add(new Person.Builder().setUsername("Srinivas", "Minigula").setDepartment("ENGSP").setGrade(10.0).setSalary(7000.00).build());
		people.add(new Person.Builder().setUsername("Ravi", "Moluguri").setDepartment("ENGNE").setGrade(10.0).setSalary(5000.00).build());
		people.add(new Person.Builder().setUsername("Akhil", "Gundlapalli").setDepartment("ENGTS").setGrade(10.0).setSalary(4000.00).build());
		return people;
	}
	
}
