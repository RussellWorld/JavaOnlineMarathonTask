package Day14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Task49 {
    public List<String> strSort(List<String> originList) {
        List<String> list = new ArrayList<>(originList);
        Collections.sort(list, new Comparator() {
            public int compare(Object o1, Object o2) {
                Integer len1 = ((String) o1).length();
                Integer len2 = ((String) o2).length();
                int lenComparison = len1.compareTo(len2);

                if(lenComparison != 0)
                    return lenComparison;

                String str1 = (String) o1;
                String str2 = (String) o2;
                return str1.compareTo(str2);
            }});
        return list;
    }
}
