package date.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Main {
	public static void main(String[] args)
	{
		LocalTime localTime=LocalTime.of(5, 10);
		localTime =localTime.minus(1,ChronoUnit.HOURS);
		
		LocalDate date=LocalDate.of(2022, Month.FEBRUARY, 19);
		date=date.plusDays(5);
		
		LocalDateTime dt=LocalDateTime.of(date, localTime);
		System.out.println(dt);
		
		
		System.out.println(date);
	}

}
