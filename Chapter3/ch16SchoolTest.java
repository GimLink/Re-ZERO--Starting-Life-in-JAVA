package ch16;

import java.util.Calendar;

public class ch16SchoolTest {
	
	public static void main(String[] args) {
		
		ch16School school1 = ch16School.getInstance();
		
		ch16School school2 = ch16School.getInstance();
		
		System.out.println(school1 == school2);
		
		Calendar calendar =Calendar.getInstance();
		
		System.out.println(calendar.getTimeInMillis());
	}
}
