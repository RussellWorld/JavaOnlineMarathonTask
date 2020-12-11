package Day8;

public class Task25 {
    public static void main(String[] args) {
        long before = System.currentTimeMillis();
        String string = "";
        for (int i = 0; i < 200000; i++)
            string += i + " ";

        long after = System.currentTimeMillis();

        System.out.println("Время выполнения цикла с классом String " + (after - before));
        StringBuilder sb = new StringBuilder("");
        before = System.currentTimeMillis();
        for (int i = 0; i < 200000; i++) {
            sb.append(i).append(" ");

        }
        after = System.currentTimeMillis();
        System.out.println("Время выполнения цикла с классом StringBilder " + (after - before));
    }
}
