package ch08;

public class ch08Student {

	int studentId;
	String studentName;
	
	ch08Subject korean;
	ch08Subject math;
	
	public ch08Student(int id, String name) {
		this.studentId = id;
		this.studentName = name;
		
		korean = new ch08Subject();
		math = new ch08Subject();
		
	}
	
	public void setKoreanSubject(String name, int score) {
		korean.subjectName = name;
		korean.score = score;
	}
	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}
	
	public void showStudentScore() {
		
		int total = korean.score + math.score;
		System.out.println(studentName + "학생의 총점은 " + total + " 점 입니다. ");
	}
}
