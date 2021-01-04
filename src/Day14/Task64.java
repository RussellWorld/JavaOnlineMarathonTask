package Day14;

import java.util.function.Predicate;

public class Task64 {
    public static void main(String[] args) {

    }


    public static class MyUtils {
        public static int getCount(int[] arr, Predicate<Integer> method) {
            int num = 0;
            for (int elem : arr) {
                if (method.test(elem)) {
                    num++;
                }
            }
            return num;
        }
    }
}
