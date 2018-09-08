package IZO_808.DateAndTime;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest {

	public static void main(String[] args) {
		Period perion = Period.of(0, 0, 1);
		LocalDate today = LocalDate.now();
		for(int i=0;i<30;i++) {
			System.out.println(today.plus(perion));
		}

	}

}
