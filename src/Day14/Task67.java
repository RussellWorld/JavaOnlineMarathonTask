package Day14;

import java.util.Set;
import java.util.function.Predicate;

public class Task67 {
    static class MyUtils {
        public static Predicate<Integer> getPredicateFromSet(Set<Predicate<Integer>> predicates) {
            Predicate<Integer> composed = null;

            for (Predicate<Integer> predicate : predicates) {
                composed = predicate;
                break;
            }

            for (Predicate<Integer> predicate : predicates) {
                composed = composed.and(predicate);
            }

            return composed;
        }
    }
}
