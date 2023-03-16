package ch09;

public class ch09BirthDayTest {

	public static void main(String[] args) {

		ch09BirthDay day = new ch09BirthDay();
		day.setYear(2023);
		day.setMonth(3);
		day.setDay(15);
		
		
		System.out.println(day.isValid());
		System.out.println(day);
		day.printThis();
	}

}
