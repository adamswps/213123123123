import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;


public class ComparingDates {
    String dateOfSell;
    String dateOfIssue;
    Boolean isAfter = false;

    public ComparingDates(String dateOfSell, String dateOfIssue) {
        try {
            Date start = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH)
                    .parse(dateOfSell);
            Date end = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH)
                    .parse(dateOfIssue);

            System.out.println(start);
            System.out.println(end);

            if (start.compareTo(end) > 0) {
                isAfter = true;
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(isAfter);
    }
}


