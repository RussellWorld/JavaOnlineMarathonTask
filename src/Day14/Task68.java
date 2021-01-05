package Day14;


import java.util.function.Predicate;
import java.util.function.BiFunction;
import java.util.ArrayList;
import java.util.List;

public class Task68 {
    public static void main(String[] args) {

    }

    public static class MyUtils {
        public static int findMaxByCondition(List<Integer> numbers, Predicate<Integer> pr) {
            int min = Integer.MIN_VALUE;
            for (Integer num : numbers) {
                if (num > min && pr.test(num)) min = num;
            }
            return min;
        }
    }

    static class User {

        public final List<Integer> values = new ArrayList<>();

        int getFilterdValue(BiFunction<List<Integer>, Predicate<Integer>, Integer> f, Predicate<Integer> pr) {
            return f.apply(values, pr);
        }

        int getMaxValueByCondition(Predicate<Integer> pr) {
            return getFilterdValue(MyUtils::findMaxByCondition, pr);
        }
    }
}
