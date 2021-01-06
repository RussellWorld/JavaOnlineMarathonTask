package Day14;

public class Task69 {
    public static void main(String[] args) {

    }


    public static class MyUtils {
        int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] syms = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        public String intToRoman(int number) {
            if (number <= 0 || number > 3999) {
                throw new IllegalArgumentException();
            }

            StringBuilder result = new StringBuilder();
            int i = 0;
            while (number > 0) {
                int times = number / nums[i];
                for (int j = 0; j < times; j++) {
                    result.append(syms[i]);
                    number -= nums[i];
                }
                i += 1;
            }

            return result.toString();
        }

        public static void main(String[] args) {
            MyUtils kek = new MyUtils();
            System.out.println(kek.intToRoman(3));
        }
    }
}
