package IZO_808.DateAndTime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;
import java.util.concurrent.TimeUnit;

public class InstantTest {

	public static void main(String[] args) {
		Instant instantBegin = Instant.now();
		System.out.println(Instant.EPOCH);
		System.out.println(instantBegin.getEpochSecond());
		System.out.println(instantBegin.getNano());
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Instant instantEnd = Instant.now();
		System.out.println(Duration.between(instantBegin, instantEnd));
		
		LocalTime localTime = LocalTime.now();
		System.out.println("Local Time is: "+localTime);
	}

}
