package IZO_808.DateAndTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class ZonedDateTimeTest {

	public static void main(String[] args) {
		ZoneId systemDefault = ZoneId.systemDefault();
		System.out.println(systemDefault);
		
		Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
//		System.out.println("Zone size:"+availableZoneIds.size());
//		for(String zoneId:availableZoneIds) {
//			System.out.println(zoneId);
//		}
		
//		List<String> listZoneId = new ArrayList<>(availableZoneIds);
//		Collections.sort(listZoneId);
//		for(String zoneId:listZoneId) {
//			System.out.println(zoneId);
//		}
		
		ZonedDateTime nowInChina = ZonedDateTime.now(ZoneId.of("Asia/Shanghai"));
		System.out.println(nowInChina);
		ZonedDateTime nowInCanada = ZonedDateTime.now();
		System.out.println(nowInCanada);
		long between = ChronoUnit.HOURS.between(nowInChina, nowInCanada);
		System.out.println(between);
		
		ZoneId location1 = ZoneId.of("America/Toronto");
		ZoneId location2 = ZoneId.of("Asia/Shanghai");
		
		
	}

}
