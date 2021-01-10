package Day18;

public class Task82 {
    public static void main(String[] args) {

    }

    static class InsufficientAmountException extends Exception {
        private final double amount;

        public InsufficientAmountException(double amount) {
            this.amount = amount;
        }

        public String getMessage() {
            return "Sorry, but you are short $" + amount;
        }

        public double getAmount() {
            return amount;
        }
    }
}
