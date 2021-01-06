package Day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task70 {
    public static void main(String[] args) {

    }

    public static class MyUtils {
        List<String> vowels = new ArrayList<>(Arrays.asList("a", "o", "i", "u", "y", "e"));
        String punctuation = ".,:;!-?";

        public String pigLatinConverter(String text) {
            if (text.isEmpty()) {
                return "";
            }

            String punkt = "";
            if (punctuation.contains(
                    Character.toString(text.charAt(text.length() - 1)))) {
                punkt = Character.toString(text.charAt(text.length() - 1));
                text = text.substring(0, text.length() - 1);
            }

            String[] arr = text.split(" ");
            List<String> result = new ArrayList<>();

            for (String elem : arr) {
                if (vowels.contains(Character.toString(elem.charAt(0)).toLowerCase())) {
                    result.add(elem + "hay");
                } else {
                    int pos = 0;
                    while (pos < elem.length() && !vowels.contains(Character.toString(elem.charAt(pos)).toLowerCase())) {
                        pos++;
                    }
                    result.add(elem.substring(pos) + elem.substring(0, pos) + "ay");
                }
            }

            return String.join(" ", result) + punkt;
        }
    }
}
