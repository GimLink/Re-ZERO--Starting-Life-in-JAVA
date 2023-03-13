package ch15;

import java.util.Scanner;

public class ch15DoWhileTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int input;
		int sum = 0;
		
		do {System.out.println("plz input num");
			input = scanner.nextInt();
			sum += input;
			
		}while(input != 0);
		System.out.println(sum);
	}

}
