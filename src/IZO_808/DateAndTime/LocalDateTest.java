package IZO_808.DateAndTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class LocalDateTest {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
//		LocalDate today = LocalDate.of(2020,8,20);
		System.out.println(today);
		LocalDate tomorrow = today.plusDays(1);
		System.out.println(tomorrow);
		System.out.println("Day of Month: "+today.getDayOfMonth());
		System.out.println("Day of Month: "+today.getMonth());
		System.out.println("Day of Month Value: "+today.getMonthValue());
		
		LocalDate futureDate = today.plus(1, ChronoUnit.YEARS);
		System.out.println(futureDate);
		
		Period period = Period.between(futureDate, today);
		System.out.println("Has "+period.getDays()+" days");
		long betweenDays = ChronoUnit.DAYS.between(today,futureDate);
		long betweenMonths = ChronoUnit.MONTHS.between(today, futureDate);
		System.out.println("Has "+betweenDays+" days");
		System.out.println("Has "+betweenMonths+" months");
	}

}
