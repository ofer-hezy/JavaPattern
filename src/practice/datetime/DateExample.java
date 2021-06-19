package practice.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.TimeZone;

public class DateExample {

	public static void main(String[] args) {
		System.out.println(Locale.getDefault().toString());
		System.out.println(TimeZone.getDefault().getID());
		LocalDate ld = LocalDate.now();
		System.out.println(ld.toString());
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt.toString());
		
		
	}

}
