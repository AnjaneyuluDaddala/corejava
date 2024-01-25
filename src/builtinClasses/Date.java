package builtinClasses;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		
		LocalDate date1 =LocalDate.of(1999, 8, 24);
		LocalDate date2=LocalDate.parse("2001-09-12");
	    System.out.println(date2);

		LocalDate tommorrow =LocalDate.now().plusDays(1);
		System.out.println(tommorrow);
		
		LocalDate previousMonthSameday=LocalDate.now().minus(1, ChronoUnit.MONTHS);
		System.out.println(previousMonthSameday);
		
		//finding this year leapYear or not
		LocalDate localDate=LocalDate.now();
		boolean LeapYear=localDate.isLeapYear();
		System.out.println( LeapYear);
		
		boolean leapyear=LocalDate.now().isLeapYear();
		System.out.println( leapyear);
		
		
		 LocalDate lc = LocalDate.now();
		 DayOfWeek weekDay=lc.getDayOfWeek();
		 System.out.println( weekDay);
		 
		 DayOfWeek SpecificWeekday = LocalDate.parse("2016-06-12").getDayOfWeek();
		 System.out.println( SpecificWeekday );
		 
		 int month = LocalDate.now().getDayOfMonth();
		 int year = LocalDate.now().getDayOfYear();
		 System.out.println(year );
		 
		 
		 
		boolean notBefore = LocalDate.parse("2016-06-12")
				  .isBefore(LocalDate.parse("2018-06-13"));

	    boolean isAfter = LocalDate.parse("2016-06-10")
				  .isAfter(LocalDate.parse("2016-06-11"));
				
				
				System.out.println(notBefore);
				System.out.println(isAfter);
				
				
				
				
				

}
}
