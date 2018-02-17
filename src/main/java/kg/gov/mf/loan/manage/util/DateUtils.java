package kg.gov.mf.loan.manage.util;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class DateUtils {

    public static final String FORMAT_DATE = "dd-MM-yyyy";
    public static final String FORMAT_TIME = "h:mm a";
    public static final String FORMAT_TIME_SEC = "h:mm:ss a";
    public static final String FORMAT_DATE_TIME = "dd-MM-yyyy h:mm a";
    public static final String FORMAT_DATE_TIME_SEC = "dd-MM-yyyy h:mm:ss a";

    public static final String FORMAT_POSTGRES_TIME = "H:mm:ss";
    public static final String FORMAT_POSTGRES_DATE = "yyyy-MM-dd";
    public static final String FORMAT_POSTGRES_TIMESTAMP = "yyyy-MM-dd H:mm:ss";

    public static final int YEAR = Calendar.YEAR;
    public static final int HOUR = Calendar.HOUR;
    public static final int MINUTE = Calendar.MINUTE;
    public static final int SECOND = Calendar.SECOND;
    public static final int DAY = Calendar.DAY_OF_MONTH;
    public static final int MONTH = Calendar.MONTH;

    public static String format(Date date, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(date);
    }

    public static String format(Date date, String format, Locale locale) {
        SimpleDateFormat sdf = new SimpleDateFormat(format, locale);
        return sdf.format(date);
    }

    public static Date now() {
        return Calendar.getInstance().getTime();
    }

    public static Timestamp nowTimestamp() {
        return new Timestamp(Calendar.getInstance().getTimeInMillis());
    }

    public static String now(String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(Calendar.getInstance().getTime());
    }

    public static String now(String format, Locale locale) {
        SimpleDateFormat sdf = new SimpleDateFormat(format, locale);
        return sdf.format(Calendar.getInstance().getTime());
    }

    public static Date add(int field, int quantity) {
        Calendar ca = Calendar.getInstance();
        ca.setTime(now());
        ca.add(field, Math.abs(quantity));
        return ca.getTime();
    }

    public static Date add(Date date, int field, int quantity) {
        Calendar ca = Calendar.getInstance();
        ca.setTime(date);
        ca.add(field, Math.abs(quantity));
        return ca.getTime();
    }

    public static Date subtract(int field, int quantity) {
        Calendar ca = Calendar.getInstance();
        ca.setTime(now());
        ca.add(field, -Math.abs(quantity));
        return ca.getTime();
    }

    public static Date subtract(Date date, int field, int quantity) {
        Calendar ca = Calendar.getInstance();
        ca.setTime(date);
        ca.add(field, -Math.abs(quantity));
        return ca.getTime();
    }

    public static int getDifferenceDays(Date d1, Date d2) {
        long diff = Math.abs(d2.getTime() - d1.getTime());
        return (int) TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

}
