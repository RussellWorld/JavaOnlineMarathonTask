package Day7;

public class Task24 {
    public static void main(String[] args) {
        Player player1 = new Player(90);
        Player player2 = new Player(87);
        Player player3 = new Player(69);

        Player.info();

        Player player4 = new Player(96);
        Player player5 = new Player(80);
        Player player6 = new Player(99);

        Player.info();

        Player player7 = new Player(90);

        Player.info();

        for (int i = 0; i < 91; i++) {
            player3.run();
        }
        Player.info();
    }

    public static class Player {
        private int stamina;
        private static final int MAX_STAMINA = 100;
        private static final int MIN_STAMINA = 0;
        private static int countPlayers;

        public Player(int stamina) {
            this.stamina = stamina;
            if (countPlayers < 6)
                countPlayers++;
        }

        public void run() {
            if (stamina == 0)
                return;

            stamina--;

            if (stamina == 0)
                countPlayers--;
        }

        public static void info() {
            if (countPlayers < 6) {
                System.out.println("Команды не полные, еще есть " + (6 - countPlayers) + " свободных мест");
            } else {
                System.out.println("Мест в командах больше нет");
            }
        }
    }
}

