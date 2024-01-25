package builtinClasses;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalTime time=LocalTime.now();
		
		LocalTime fiveThirty=LocalTime.parse("05:30");
		
		LocalTime fourTen=LocalTime.of(2, 30, 40);
		System.out.println( fourTen);
		
		LocalTime IncreHour =LocalTime.parse("05:30").plus(2, ChronoUnit.HOURS);
		System.out.println( IncreHour);
		
		LocalTime getHour=LocalTime.parse("09:20");
		int hour=getHour.getMinute();
		System.out.println( hour);
		
		int Hour=LocalTime.parse("10:20").getHour();
		System.out.println( Hour);
		
		
		boolean isbefore = LocalTime.parse("05:30").isBefore(LocalTime.parse("07:30"));
		System.out.println( isbefore);
		
		boolean isAfter = LocalTime.parse("09:30").isAfter(LocalTime.parse("07:30"));
		System.out.println(isAfter);
		
		
		LocalTime max=LocalTime.now().MAX;
		System.out.println(max);
		
		LocalTime max1=LocalTime.MAX;
		System.out.println(max1);
		
		LocalTime max2=LocalTime.of(12, 34, 60).MAX;
		System.out.println(max2);
		
		 
		try {
			LocalTime max3=LocalTime.of(12, 34, 60).MAX;
			System.out.println(max3);
		}catch(Exception e) {
			System.out.println("error");
		}
		
		
		
		
	}

}
