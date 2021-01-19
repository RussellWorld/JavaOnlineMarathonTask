package Day18;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Stream;

public class Task86 {
    public static void main(String[] args) {

    }

    public static class MyUtils {
        public static void main(String[] args) {
            Map<String, Stream<String>> map = new HashMap<>();
            map.put("Desktop", Stream.of(" iVan", "PeTro ", " Ira "));
            map.put("Web", Stream.of("STepan", "ira ", " Andriy ", "an na"));
            map.put("Spring", Stream.of("Ivan", "Anna"));

            new MyUtils().nameList(map).forEach(System.out::println);
        }

        public Stream<String> nameList(Map<String, Stream<String>> map) throws NullPointerException {
            if (map == null) {
                throw new NullPointerException();
            }

            return map.values()
                    .stream()
                    .flatMap(Function.identity())
                    .filter(Objects::nonNull)
                    .map(str -> str.replace(" ", ""))
                    .filter(str -> !str.isEmpty())
                    .map(String::toLowerCase)
                    .distinct()
                    .map(str -> str.substring(0, 1).toUpperCase() + str.substring(1))
                    .sorted();
        }
    }

}
