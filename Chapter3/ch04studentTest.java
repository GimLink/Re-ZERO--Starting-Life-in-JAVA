package ch04;

public class ch04studentTest {

	public static void main(String[] args) {

		ch04Student studentLee = new ch04Student(100, "Lee");
		studentLee.studentAdress = "Seoul";
		
		ch04Student studentKim = new ch04Student(101, "Kim", "New York");
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
		
		System.out.println(studentLee);
		System.out.println(studentKim);
	}

}
