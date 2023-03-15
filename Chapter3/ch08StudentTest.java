package ch08;

public class ch08StudentTest {

	public static void main(String[] args) {

		ch08Student studentLee = new ch08Student(100, "Lee");
		ch08Student studentKim = new ch08Student(101, "Kim");
		
		studentLee.setKoreanSubject("국어", 100);
		studentLee.setMathSubject("수학", 95);
		
		studentKim.setKoreanSubject("국어", 80);
		studentKim.setMathSubject("수학", 99);
		
		studentLee.showStudentScore();
		studentKim.showStudentScore();
		
	}

}
