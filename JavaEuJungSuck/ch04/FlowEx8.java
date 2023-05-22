package ch04조건문과반복문;

import java.util.Scanner;

public class FlowEx8 {

	public static void main(String[] args) {

		char gender;
		String regNo = "";
		
		System.out.println("당신의 주민번호를 입력하세요. ");
		
		Scanner scanner = new Scanner(System.in);
		regNo = scanner.nextLine();
		
		gender = regNo.charAt(7);
		
		switch(gender) {
		case '1': case '3':
			System.out.println("당신은 남성입니다. ");
			break;
		case '2': case '4':
			System.out.println("당신은 여성입니다. ");
			break;
			
		default:
			System.out.println("유효하지 않은 주민번호 입니다. ");
		}
	}

}
