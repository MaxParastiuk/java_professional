package homework6.task2;

import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;

public class Main {

    private static String formatDate(Calendar calendar) {
        Formatter formatter = new Formatter();
        formatter.format("%1$tF %1$tr", calendar);
        return formatter.toString();
    }

    public static void main(String[] args) {
        Date date = new Date();

        Calendar currentCalendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();

        currentCalendar.setTime(date);
        System.out.println("Настоящее время: " + formatDate(currentCalendar));

        Calendar calendar1 = Calendar.getInstance();
        calendar1.setTime(date);

        calendar1.set(Calendar.YEAR, 1999);
        calendar1.set(Calendar.MONTH, 9);
        calendar1.set(Calendar.DATE, 22);
        calendar1.set(Calendar.HOUR_OF_DAY, 0);
        calendar1.set(Calendar.MINUTE, 0);
        calendar1.set(Calendar.SECOND, 0);
        calendar1.set(Calendar.MILLISECOND, 0);
        System.out.println("Дата рождения: " + formatDate(calendar1));

        calendar2.set(Calendar.YEAR, currentCalendar.get(Calendar.YEAR) - calendar1.get(Calendar.YEAR));
        calendar2.set(Calendar.MONTH, currentCalendar.get(Calendar.MONTH) - calendar1.get(Calendar.MONTH));
        calendar2.set(Calendar.DATE, currentCalendar.get(Calendar.DATE) - calendar1.get(Calendar.DATE));
        calendar2.set(Calendar.HOUR_OF_DAY, currentCalendar.get(Calendar.HOUR_OF_DAY) - calendar1.get(Calendar.HOUR_OF_DAY));
        calendar2.set(Calendar.MINUTE, currentCalendar.get(Calendar.MINUTE) - calendar2.get(Calendar.MINUTE));
        calendar2.set(Calendar.SECOND, currentCalendar.get(Calendar.SECOND) - calendar2.get(Calendar.SECOND));

        System.out.println("Возраст: " + calendar2.get(Calendar.YEAR) + " years " + calendar2.get(Calendar.MONTH) + " months "
                + calendar2.get(Calendar.DAY_OF_MONTH) + " days " + calendar2.get(Calendar.HOUR_OF_DAY) + " hours "
                + calendar2.get(Calendar.MINUTE) + " minutes " + calendar2.get(Calendar.SECOND) + " seconds");

    }
}
