package Test;

import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {

		//grade = (score >=90)?'A':'B' 다음 조건식을 조건문으로 바꾸시오
		char grade;
		int score;
		Scanner scanner = new Scanner(System.in);
		System.out.println("plz input score");
		score = scanner.nextInt();
		if(score >=90) {
			grade = 'A';
		}
		else {
			grade = 'B';
		}
		System.out.println(grade);
	}

}
