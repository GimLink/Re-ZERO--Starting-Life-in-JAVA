package ch04조건문과반복문;

import java.util.Scanner;

public class FlowEx6 {

	public static void main(String[] args) {

		int month = 0;
		
		System.out.println("현재 월을 입력하세요. ");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		month = Integer.parseInt(tmp);
		
		switch(month) {
		case 3:
		case 4:
		case 5:
			System.out.println("현재 계절은 봄입니다. ");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("현재 계절은 여름입니다. ");
			break;
		default:
			System.out.println("현재 계절은 겨울입니다. ");
		}
	}

}
