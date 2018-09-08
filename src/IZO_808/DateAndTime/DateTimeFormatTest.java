package IZO_808.DateAndTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DateTimeFormatTest {

	private final Logger log = Logger.getLogger(DateTimeFormatTest.class.getName());

	{
		log.setLevel(Level.INFO);
	}

	private DateTimeFormatter defaultFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

	public static void main(String[] args) {
		DateTimeFormatTest test = new DateTimeFormatTest();

		// Get the birthday
		LocalDate birthday = test.getBirthday();

		// get age
		test.tellAge(birthday);

		// Get the coming birthday
		test.tellNextBirthday(birthday);

	}

	private void tellNextBirthday(LocalDate birthday) {
		LocalDate today = LocalDate.now();
		LocalDate birthdayInThisYear = LocalDate.of(today.getYear(), birthday.getMonthValue(),
				birthday.getDayOfMonth());
		log.info(birthdayInThisYear.toString());
		if (birthdayInThisYear.isBefore(today)) {
			long pastDays = ChronoUnit.DAYS.between(birthdayInThisYear, today);
			System.out.println("Your have celebrated your birthay " + pastDays + " days before!");
		} else if (birthdayInThisYear.isAfter(today)) {
			long pastDays = ChronoUnit.DAYS.between(today, birthdayInThisYear);
			System.out.println("Your birthay will be " + pastDays + " days later!");
		} else {
			System.out.println("Congruations! Today is your birthday!!!");
		}
	}

	private void tellAge(LocalDate birthday) {
		Period age = Period.between(birthday, LocalDate.now());
		System.out.printf("Today your are %s years %s month and %s days old.\n", age.getYears(), age.getMonths(),
				age.getDays());
	}

	private LocalDate getBirthday() {
		LocalDate birthday=null;
		try(Scanner scanner = new Scanner(System.in)){
			while(true) {
				System.out.println("Please input your birthday in YYYY-MM-DD format (E.g.2000-08-01): ");
				String input = scanner.nextLine();
				try{
					birthday = LocalDate.parse(input, defaultFormatter);
					return birthday;
				}catch(DateTimeParseException e) {
					System.out.println("Error! Please try again!");
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return birthday;
	}
}
