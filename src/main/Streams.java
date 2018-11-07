package main;

import java.util.Arrays;
import java.util.Collection;

/**
 * https://www.baeldung.com/java-8-streams
 */

import java.util.stream.Stream;

public class Streams {

	// Nice in cases when you don't want to use null
	Stream<String> emptyStream = Stream.empty();

	// Collection -> stream
	Collection<String> collectionBoi = Arrays.asList("a", "b", "c");

	// Array -> stream
	String[] arr = new String[] { "a", "b", "c" };
	Stream<String> fullStream = Arrays.stream(arr);
	Stream<String> partialStream = Arrays.stream(arr, 0, 1);

	// Stream.builder() -> if object T not specified in builder then given T of
	// Object
	Stream<Integer> streamBuilder = Stream.<Integer>builder().add(1).add(2).build();
}
