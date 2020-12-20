package Day14;

public class Task43 {

    //Write a method to check if a year is a leap year or not, using only Relational and Logical operators.
//If a year is leap then method should return true, otherwise - false.
//Every year that is exactly divisible by 4 is a leap year, except for years that are exactly divisible by 100, but these centurial years are leap years if they are exactly divisible by 400.

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0));
    }
}
