package Day18;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Task83 {
    public static void main(String[] args) {

    }

    static class ParallelCalculator implements Runnable {
        int result;

        public ParallelCalculator(BinaryOperator<Integer> op, int operand1, int operand2) {
            result = op.apply(operand1, operand2);
        }

        @Override
        public void run() {

        }
    }

    static class Accountant {
        public static int sum(int x, int y) {
            ParallelCalculator calc = new ParallelCalculator(Integer::sum, x, y);
            Thread t = new Thread(calc);
            t.start();
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return calc.result;
        }
    }

    static class Interactor {

        int x;

        public synchronized void serve(UnaryOperator<Integer> uo, int initializer) throws InterruptedException {
            System.out.println("Serving thread running");
            System.out.println("Serving thread initializes the key");

            x = uo.apply(initializer);
            System.out.println("key = " + x);
            notifyAll();

            try {
                wait();
            } catch (InterruptedException ignored) {
            }

            System.out.println("Serving thread resumed");
        }

        public synchronized void consume(BinaryOperator<Integer> bo, int operand2) throws InterruptedException {
            try {
                wait(2000);
            } catch (InterruptedException ignored) {
            }

            System.out.print("Consuming thread received the key. ");
            System.out.println("key = " + x);
            System.out.print("Consuming thread changed the key. ");
            x = bo.apply(x, operand2);
            System.out.println("key = " + x);

            notifyAll();
        }
    }
}
