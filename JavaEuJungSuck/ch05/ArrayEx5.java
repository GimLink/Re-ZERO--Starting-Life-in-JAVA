package ch05배열;

public class ArrayEx5 {

	public static void main(String[] args) {

		int sum = 0;
		float avr = 0;
		
		int[] score = {100, 88, 100, 100, 90};
		
		for(int i=0;i<score.length;i++) {
			sum += score[i];
		}
		avr = sum/(float)score.length;
		
		System.out.println("총점: "+sum);
		System.out.println("평균: "+avr);
	}

}
