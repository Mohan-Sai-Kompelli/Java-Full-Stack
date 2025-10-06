
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;


public class DateTime {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		int dd = date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yy = date.getYear();
		LocalTime time = LocalTime.now();
		System.out.println(time);
		int h = time.getHour();
		int m = time.getMinute();
		int  s = time.getSecond();
		int n = time.getNano();
		LocalDateTime dateandTime = LocalDateTime.now();
		
		LocalDateTime dt1 = LocalDateTime.of(1995,Month.MAY,23,12,45,12,30);
		System.out.println(dt1);
		System.out.println("After six months : "+dt1.plusMonths(6));
		System.out.println("Before 8 months : "+dt1.minusMonths(8));
		ZoneId zone  = ZoneId.systemDefault();
		
		
		
	}
}
