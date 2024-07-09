package dataAndTimeApi;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Java1 {
	public static void main(String[] args) {
		LocalDate.now();
		LocalDate.of(2024, 02, 23);
		LocalDate.parse("2019-09-21");
		
		//finding next day
		LocalDate.now().plusDays(1);
		
		//finding same of previous one  month
		
		LocalDate.now().minus(1,ChronoUnit.MONTHS);
		
		//finding leapyear
		
		boolean leapYear = LocalDate.now().isLeapYear();
		if(leapYear) {
			System.out.println("This year is Leap Year");
		}else {
			System.out.println("This year is not Leap Year");
		}
		
		//Time Based
		
		LocalTime.now();
		LocalTime.of(06, 30);
		LocalTime.parse("07:43");
		LocalTime.now().plus(1,ChronoUnit.HOURS);
		LocalTime.parse("06:30").isBefore(LocalTime.parse("07:30"));
		
	}

}
