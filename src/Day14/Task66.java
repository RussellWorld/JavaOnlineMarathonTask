package Day14;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class Task66 {
    public static void main(String[] args) {

    }

    public static class App {
        static BinaryOperator<String> greetingOperator = (String param1, String param2) -> "Hello " + param1 + " " + param2 + "!!!";

        public static List<String> createGreetings(List<Person> people, BinaryOperator<String> method) {
            List<String> list = new ArrayList<>();
            for (Person person : people) {
                list.add(method.apply(person.name, person.surname));
            }
            return list;
        }

        interface DecisionMethod {
            boolean decide(String product, int discount);
        }

        static class Person implements DecisionMethod {
            public String surname;
            String name;
            DecisionMethod goShopping = this;

            Person(String name) {
                this.name = name;
            }

            @Override
            public boolean decide(String product, int discount) {
                return product.equals("product1") && discount > 10;
            }
        }

        static class Shop {
            public List<DecisionMethod> clients = new ArrayList<>();

            public int sale(String product, int percent) {
                int num = 0;
                for (DecisionMethod client : clients) {
                    if (client instanceof Person && ((Person) client).goShopping.decide(product, percent)) {
                        num++;
                    }
                }
                return num;
            }
        }
    }

}
