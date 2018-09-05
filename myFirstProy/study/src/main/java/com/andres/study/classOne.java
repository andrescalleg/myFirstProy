package com.andres.study;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class classOne {
	public static final void main(String []args){

		List<String> myList =
				Arrays.asList("a1", "a2", "b1", "c4", "c3","a1", "a2", "b1", "c2", "c1");

		myList.stream()
				.filter(s -> s.startsWith("c"))
				.map(String::toUpperCase)
				.sorted()
				.forEach(System.out::println);

		IntStream.range(1, 10)
				.findFirst().ifPresent(System.out::println);
		//.forEach(System.out::println);

		Stream.of("a1", "a2", "a3")
				.map(s -> s.substring(1))
				.mapToInt(Integer::parseInt)
				.max()
				.ifPresent(System.out::println);



		List<Person> persons =
				Arrays.asList(
						new Person("Andres", 27),
						new Person("Felipe", 28),
						new Person("Julieth", 22),
						new Person("Catalina", 23));

		List<String> filtered =
				persons
						.stream()
						.filter(p -> p.name.startsWith("A"))
						.map(p-> p.name)
						.collect(Collectors.toList());

		System.out.println(filtered);

		Double averageAge = persons
				.stream()
				.collect(Collectors.averagingInt(p -> p.age));

		// another comment 4
		System.out.println(averageAge);
	}

}
