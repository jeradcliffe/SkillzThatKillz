package test;

import org.junit.Test;

import main.Greeter;

public class GreeterTest {

	@Test
	public void test() {
		assert ("test").equals(new Greeter().greet("test"));
	}

}
