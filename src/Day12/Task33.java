package Day12;

import java.util.ArrayList;
import java.util.List;

public class Task33 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Audi");
        list.add("BMW");
        list.add("Lada");
        list.add("Tesla");
        list.add("Honda");

        System.out.println(list);

        list.add(2, "Opel");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);

    }
}
