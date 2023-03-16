package ch13;

public class ch13TakeTransTest {

	public static void main(String[] args) {

		ch13Student studentJ = new ch13Student("James", 5000);
		ch13Student studentT = new ch13Student("Tomas", 10000);
		
		ch13Bus bus100 = new ch13Bus(100);
		ch13Subway subwayGreen = new ch13Subway(2);
		
		studentJ.takeBus(bus100);
		studentT.takeSubway(subwayGreen);
		
		studentJ.showStudentInfo();
		studentT.showStudentInfo();
		
		bus100.showBusInfo();
		subwayGreen.showSubwayInfo();
		
	}

}
