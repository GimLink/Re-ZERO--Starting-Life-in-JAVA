package ch04조건문과반복문;

import java.util.Scanner;

public class FlowEx11 {

	public static void main(String[] args) {

		char gender ;
		String regNo = " ";
		System.out.println("당신의 주민번호를 입력하세요. (000000-0000000)");
		
		Scanner scanner = new Scanner(System.in);
		regNo = scanner.nextLine();
		
		gender = regNo.charAt(7);
		
		switch(gender) {
		case '1':
		case '3':
			switch(gender) {
				case '1':
				System.out.println("당신은 2000년 이전에 출생한 남자입니다.");
					break;
				case '3':
				System.out.println("당신은 2000년 이후에 출생한 남자입니다.");
			
			}
			break;
		case '2':
		case '4':
			switch(gender) {
				case '2':
				System.out.println("당신은 2000년 이전에 출생한 여성입니다.");
					break;
				case '4':
				System.out.println("당신은 2000년 이후에 출생한 여성입니다.");
					break;
			}
			break;
			
		default:
			System.out.println("유효하지 않은 주민번호입니다.");
		}
	
		
	}

}
