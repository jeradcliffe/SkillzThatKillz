package main;

public class Dog {

	private String name;
	private int age;

	public Dog(String name, int age) {
		this.setName(name);
		this.setAge(age);
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("%-5s is %2s years old", this.name, this.age);
	}
}
