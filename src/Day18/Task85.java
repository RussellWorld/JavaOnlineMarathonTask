package Day18;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Task85 {
    public static void main(String[] args) {

    }

    public static Calendar convertDateToCalendar(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar;
    }

    public static String lastDayOfMonth(int month, int year) {
        if (month < 0 || month > 11) {
            return "Wrong Month";
        }

        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.DATE, calendar.getActualMaximum(Calendar.DATE));

        return calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, java.util.Locale.getDefault());
    }

    public static boolean isLeapYear(int year) {
        return LocalDate.of(year, Month.JANUARY, 1).isLeapYear();
    }

    public static String getDateAfterToday(int years, int months, int days) {
        return LocalDate.now().plusYears(years).plusMonths(months).plusDays(days).toString();
    }

    public static void writeFile(String filename, String text) {
        byte[] bytes = text.getBytes();
        StringBuilder str = new StringBuilder();
        for (byte b : bytes) {
            str.append(String.format("%7s", Integer.toBinaryString(b & 0xFF)).replace(' ', '0'));
        }

        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(str.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String readFile(String filename) {
        StringBuilder result = new StringBuilder();

        try (FileReader reader = new FileReader(filename)) {
            int c;
            StringBuilder character = new StringBuilder();
            while ((c = reader.read()) != -1) {
                character.append((char) c);
                if (character.length() == 7) {
                    int charCode = Integer.parseInt(character.toString(), 2);
                    result.append((char) charCode);
                    character = new StringBuilder();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result.toString();
    }

}
