package Day14;

import java.util.List;
import java.util.Map;

public class Task50 {
    public boolean listMapCompare(List<String> list, Map<String, String> map) {
        for (String elem : list) {
            boolean flag = false;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getValue().equals(elem)) {
                    flag = true;
                    break;
                }
            }
            if (!flag)
                return false;
        }
        return true;
    }
}
