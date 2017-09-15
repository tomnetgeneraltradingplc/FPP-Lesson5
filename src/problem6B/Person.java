package problem6B;

public class Person implements Cloneable {
	String name;

	Computer computer;

	public Person(String name, Computer computer) {
		super();

		this.name = name;
		this.computer = computer;
	}

	protected Object clone() throws CloneNotSupportedException {
		Person clone = (Person) super.clone();

		// Need to clone the Computer reference variable too clone.computer =
		 this.computer.clone(); return clone;

	}

	@Override

	public String toString() {

		return "Person [Name=" + name + ", Computer=" + computer + "]";

	}

}
