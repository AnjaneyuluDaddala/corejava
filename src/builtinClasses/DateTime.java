package builtinClasses;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateTime {

	public static void main(String[] args) {
		

		
		//combination of date and time
		LocalDateTime dt= LocalDateTime.now();
		
		LocalDateTime dt1= LocalDateTime.of(LocalDate.now(),LocalTime.now());
	
		LocalDateTime dt2= LocalDateTime.of(1999, 9, 28, 3, 20);
		
		LocalDateTime dt3= LocalDateTime.parse("1999-09-28T09:20");
	
		LocalDateTime dt4= LocalDateTime.of(1999, Month.APRIL , 28, 3, 20);
		System.out.println(dt4);
		
		
		LocalDateTime localDateTime = LocalDateTime.now();
		
		localDateTime.plusDays(2);
		
		localDateTime.minusHours(7);
		
		localDateTime.getMonth();
		
	}

}
