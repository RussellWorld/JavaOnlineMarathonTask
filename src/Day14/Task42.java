package Day14;

public class Task42 {

    //Write a method to compute the sum of the digits in a three-digits positive integer number.

    public static int sumOfDigits(int number) {
        int sum = 0;
        while(number > 0){
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
