package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import main.Dog;

public class DogTest {

	List<Dog> dogs = new ArrayList<Dog>();

	@Before
	public void setup() {
		dogs.add(new Dog("Max", 1));
		dogs.add(new Dog("Jacob", 2));
		dogs.add(new Dog("Rex", 5));
	}

	@Test
	public void testSort() {
		Collections.sort(dogs, (d1, d2) -> d1.getName().compareTo(d2.getName()));
		dogs.forEach(System.out::println);
	}
}
