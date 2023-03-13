package ch13;

import java.util.Scanner;

public class ch13IfElseTest {

	public static void main(String[] args) {

		int age;
		System.out.println("Insert age");
		Scanner scanner = new Scanner(System.in);
		age = scanner.nextInt();
		
		if(age >=8) {
			System.out.println("Go to school");
		}
		else {
			System.out.println("Don't go to school");
		}
	}

}
