package ch13;

public class ch13Student {

	String studentName;
	int grade;
	int money;
	
	public ch13Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(ch13Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void takeSubway(ch13Subway Subway) {
		
		Subway.take(1200);
		this.money -= 1200;
	}
	
	public void showStudentInfo() {
		
		System.out.println(studentName + "님의 잔고는 " + money + "원 입니다.");
	}
}
