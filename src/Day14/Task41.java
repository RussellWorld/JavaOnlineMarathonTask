package Day14;

public class Task41 {
    //Write a method that takes a year as input, and returns the century it is in.
//The first century spans from the year 1 up to and including the year 100,
// The second century spans from the year 101 up to and including the year 200, etc.

    public static int century(int year) {
        if (year % 100 == 0)
            return year / 100;
        return year / 100 + 1;
    }
}
