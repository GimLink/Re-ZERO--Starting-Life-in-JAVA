package ch11;

public class ch11Person {
	
	private String name;
	private int age;
	
	public ch11Person() {
		this("mumei", 1);
	}
	public ch11Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public ch11Person getPerson() {
		return this;
	}
	
	public static void main(String[] args) {
		ch11Person person = new ch11Person("Kim", 17);
		System.out.println(person.name);
		System.out.println(person.age);
	}
}
