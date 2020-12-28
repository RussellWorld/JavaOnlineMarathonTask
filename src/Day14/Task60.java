package Day14;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task60 {
    interface DrinkReceipt {
        String getName();

        DrinkReceipt addComponent(String componentName, int componentCount);
    }

    interface DrinkPreparation {
        Map<String, Integer> makeDrink();
    }

    interface Rating {
        int getRating();
    }

    static class Caffee implements DrinkReceipt, DrinkPreparation, Rating {
        private final String name;
        private final int rating;
        private final Map<String, Integer> ingredients;

        public Caffee(String name, int rating) {
            this.name = name;
            this.rating = rating;
            this.ingredients = new HashMap<>();
        }

        @Override
        public Map<String, Integer> makeDrink() {
            addComponent("Water", 100);
            addComponent("Arabica", 20);

            return ingredients;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public int getRating() {
            return rating;
        }

        @Override
        public DrinkReceipt addComponent(String componentName, int componentCount) {
            ingredients.put(componentName, componentCount);
            return this;
        }
    }

    static class Espresso extends Caffee {
        private final Map<String, Integer> ingredients;

        public Espresso(String name, int rating) {
            super(name, rating);
            this.ingredients = new HashMap<>();
        }

        @Override
        public Map<String, Integer> makeDrink() {
            addComponent("Water", 50);
            addComponent("Arabica", 20);

            return ingredients;
        }

        @Override
        public DrinkReceipt addComponent(String componentName, int componentCount) {
            ingredients.put(componentName, componentCount);
            return this;
        }
    }

    static class Cappuccino extends Caffee {
        private final Map<String, Integer> ingredients;

        public Cappuccino(String name, int rating) {
            super(name, rating);
            this.ingredients = new HashMap<>();
        }

        @Override
        public Map<String, Integer> makeDrink() {
            addComponent("Water", 100);
            addComponent("Arabica", 20);
            addComponent("Milk", 50);

            return ingredients;
        }

        @Override
        public DrinkReceipt addComponent(String componentName, int componentCount) {
            ingredients.put(componentName, componentCount);
            return this;
        }
    }

    public static class MyUtils {
        public Map<String, Double> averageRating(List<Caffee> coffees) {
            double totalEsp = 0;
            double totalCap = 0;
            double totalCof = 0;

            int numEsp = 0;
            int numCap = 0;
            int numCof = 0;

            for (Caffee c : coffees) {
                if (c instanceof Cappuccino) {
                    totalCap += c.getRating();
                    numCap++;
                } else if (c instanceof Espresso) {
                    totalEsp += c.getRating();
                    numEsp++;
                } else if (c != null) {
                    totalCof += c.getRating();
                    numCof++;
                }
            }

            Map<String, Double> results = new HashMap<>();
            if (numEsp > 0) {
                results.put("Espresso", (totalEsp / numEsp));
            }
            if (numCap > 0) {
                results.put("Cappuccino", (totalCap / numCap));
            }
            if (numCof > 0) {
                results.put("Caffee", (totalCof / numCof));
            }

            return results;
        }
    }

}
