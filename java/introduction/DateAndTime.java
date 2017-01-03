import java.text.DateFormatSymbols;
import java.util.*;

/*
Link to problem: https://www.hackerrank.com/challenges/java-date-and-time
*/

public class DateAndTime {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String month = in.next();
    String day = in.next();
    String year = in.next();

    int mm = Integer.parseInt(month);
    int dd = Integer.parseInt(day);
    int yyyy = Integer.parseInt(year);

    Calendar calendar = Calendar.getInstance();
    calendar.set(yyyy, mm - 1, dd);

    if(yyyy > 2000 || yyyy < 3000) {
        System.out.println(new DateFormatSymbols().getWeekdays()[calendar.get(Calendar.DAY_OF_WEEK)].toUpperCase());
    }
    in.close();
  }
}
