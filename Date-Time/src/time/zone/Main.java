package time.zone;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
	
	public static void main(String[] args)
	{
		class TimeZone{
			
			public String region;
			public String specificArea;
			public TimeZone(String nonFormattedTz)
			{
				String[] items=nonFormattedTz.split("/");
				region = items[0];
				
				if(items.length>1)
				{
					specificArea=items[1];
				}
				
			}
			
//			@Override
//			public String toString()
//			{
//				return specificArea;
//			}
		}
		LocalTime localTime=LocalTime.of(5, 10);
		localTime =localTime.minus(1,ChronoUnit.HOURS);
		
		LocalDate date=LocalDate.of(2022, Month.FEBRUARY, 19);
		date=date.plusDays(5);
		
		LocalDateTime dateTime=LocalDateTime.of(date, localTime);
		System.out.println(dateTime);
		
		Set<String> zoneIds=ZoneId.getAvailableZoneIds();
		Map<String, List<TimeZone>> tzMap=zoneIds.stream()
				.map((tz)->new TimeZone(tz))
                .collect(Collectors.groupingBy((formattedTz)->formattedTz.region));

                System.out.println(tzMap);
                
                ZonedDateTime losAngeles=ZonedDateTime.of(dateTime, ZoneId.of("America/Los_Angeles"));
                long secondsFromEpoch=losAngeles.toEpochSecond();
                System.out.println("Original:"+losAngeles);
                
                LocalDateTime localDateTime=LocalDateTime.ofInstant(Instant.ofEpochSecond(secondsFromEpoch), ZoneId.of("Europe/Rome"));
                System.out.println(localDateTime);
                
                
//		zoneIds.stream()
//		.sorted()
//		.forEach((zoneId) -> System.out.println(zoneId));
		
		//System.out.println();
		
		

}
}
