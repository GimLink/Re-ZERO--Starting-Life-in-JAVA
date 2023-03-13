package ch12;

import java.util.Scanner;

public class ch12ConditionTest {

	public static void main(String[] args) {

		int max;
		System.out.println("두 수를 입력 받아 큰 수를 출력");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("input1:");
		int x = scanner.nextInt();
		System.out.println("input2:");
		int y = scanner.nextInt();
		
		max = (x>y)? x:y;
		System.out.println(max);
		
	}

}
