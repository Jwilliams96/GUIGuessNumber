package lab1.work;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtilities {

    public static Date stringToDate(String date) throws ParseException {
        SimpleDateFormat newFormatter = new SimpleDateFormat("mm.dd.yyyy");
        return newFormatter.parse(date);
    }

    public static Date stringToDate(String date, DateFormats format) throws ParseException {
        SimpleDateFormat newFormatter = new SimpleDateFormat(format.toString());
        return newFormatter.parse(date);
    }

    public static String stringToDate(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat("mm.dd.yyyy");
        return formatter.format(date);
    }

    public static String stringToDate(Date date, DateFormats format) {
        SimpleDateFormat formatter = new SimpleDateFormat(format.toString());
        return formatter.format(date);
    }
}
