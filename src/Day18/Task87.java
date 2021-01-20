package Day18;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task87 {
    public static void main(String[] args) {

    }

    public static class MyUtils {
        public static void main(String[] args) {
            List<Stream<String>> list = new ArrayList<>();
            list.add(Stream.of("093 987 65 43", "(050)1234567", "12-345"));
            list.add(Stream.of("067-21-436-57", "050-2345678", "0939182736", "224-19-28"));
            list.add(Stream.of("(093)-11-22-334", "044 435-62-18", "721-73-45"));
            for (Map.Entry<String, List<String>> entry : new MyUtils().phoneNumbers(list).entrySet()) {
                System.out.println(entry.getKey());
                entry.getValue().forEach(System.out::println);
                System.out.println();
            }
        }

        public Map<String, List<String>> phoneNumbers(List<Stream<String>> list) {
            return list.stream()
                    .flatMap(Function.identity())
                    .sorted()
                    .map(str -> str.replaceAll("[- ()]", ""))
                    .map(str -> {
                        if (str.length() == 7) {
                            return "loc" + str;
                        } else if (str.length() == 10) {
                            return str;
                        } else {
                            return "err" + str;
                        }
                    })
                    .collect(Collectors.groupingBy(str -> str.substring(0, 3), Collectors.mapping(str -> str.substring(3), Collectors.toList())));
        }
    }
}
