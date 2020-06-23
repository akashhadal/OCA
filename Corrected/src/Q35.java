import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q35 {
	public static void main(String[] args) {
		LocalDate date1=LocalDate.now();
		LocalDate date2=LocalDate.of(2020, 6, 14);
		LocalDate date3=LocalDate.parse("2020-06-14",DateTimeFormatter.ISO_DATE);
		System.out.println(date1);
		System.out.println(date2);
		System.out.println(date3);
	}
}
