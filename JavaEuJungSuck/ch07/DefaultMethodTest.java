package ch07;

public class DefaultMethodTest {

	public static void main(String[] args) {
		Child_30 c = new Child_30();
		c.method1();
		c.method2();
		Myinterface.staticMethod();
		Myinterface2.staticMethod();
	}

}

class Child_30 extends Parent_30 implements Myinterface, Myinterface2 {
	public void method1() {
		System.out.println("method1 in Child");
	}
}

class Parent_30 {
	public void method2() {
		System.out.println("method2() in Parent");
	}
}

interface Myinterface {
	default void method1() {
		System.out.println("method1() in Myinterface");
	}
	
	default void method2() {
		System.out.println("method2() in Myinterface");
	}
	
	static void staticMethod() {
		System.out.println("staticMethod() in Myinterface");
	}
}

interface Myinterface2 {
	default void method1() {
		System.out.println("method1() in Myinterface2");
	}
	
	default void method2() {
		System.out.println("method2() in Myinterface2");
	}
	
	static void staticMethod() {
		System.out.println("staticMethod() in Myinterface2");
	}
}