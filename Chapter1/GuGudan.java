package Test;

public class GuGudan {

	public static void main(String[] args) {

		// 구구단 짝수단만 출력 continue 사용
		
	int dan;
	int times;
	
	for(dan = 2; dan<=9; dan++) {
		times = 1;
		if((dan % 2)!=0) continue;
		
		for(times = 1; times<=9; times++) {
			
			System.out.println(dan + "X" + times + "=" + dan*times);
			}
		System.out.println();
		}
	}

}
