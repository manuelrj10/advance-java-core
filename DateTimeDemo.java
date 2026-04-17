package datetimepack;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {

	public static void main(String[] args) {
//		Date date=new Date();
//		System.out.println(date);
		LocalDate date=LocalDate.now();
		System.out.println(date);
		
		// the current time
		
		LocalTime local=LocalTime.now();
		System.out.println(local);
		
		
		//current date and time
		
		LocalDateTime current=LocalDateTime.now();
		System.out.println(current);
		
		
		DateTimeFormatter format=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss ");
		String formatedDateTime=current.format(format);
		System.out.println("in formatted manner  :"+formatedDateTime);
		
		
		// to get the current zone
		ZonedDateTime currentZone=ZonedDateTime.now();
		System.out.println("the current zone is "+currentZone.getZone());
		

	}

}
