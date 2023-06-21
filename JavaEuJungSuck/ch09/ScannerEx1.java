package ch09;

import java.util.*;

public class ScannerEx1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] argArr = null;
		
		while(true) {
			String prompt = ">>";
			System.out.print(prompt);
			
			String input = s.nextLine();
			
			input = input.trim(); //앞뒤 공백 제거
			argArr = input.split(" +"); //입력받은 내용을 공백을 구분자로 잘라서 argArr배열에 집어넣기
			
			String command = argArr[0].trim();
			
			if("".equals(command)) continue;
			
			command = command.toLowerCase();
			
			if(command.equals("q")) {
				System.exit(0);
			}else {
				for(int i=0; i <argArr.length;i++)
					System.out.println(argArr[i]);
			}
		}
	}

}
