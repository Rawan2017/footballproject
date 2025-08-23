public class FootballSimulation {
        public static void main(String[] args) {
            try {
                Menu menu = new Menu();
                menu.start();
            } catch (Exception e) {
                System.err.println("Unexpected error: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }


