public class Club {
    private String name;
    private int yearEstablished;
    private String currentCoach;
    private String previousCoach;
    private String stadium;
    private Player[] players;

    // Constructor updated to initialize all properties
    public Club(String name, int yearEstablished, String currentCoach, String previousCoach, String stadium, Player[] players) {
        this.name = name;
        this.yearEstablished = yearEstablished;
        this.currentCoach = currentCoach;
        this.previousCoach = previousCoach;
        this.stadium = stadium;
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public int getYearEstablished() {
        return yearEstablished;
    }

    public String getCurrentCoach() {
        return currentCoach;
    }

    public String getPreviousCoach() {
        return previousCoach;
    }

    public String getStadium() {
        return stadium;
    }

    public Player[] getPlayers() {
        return players;
    }

    @Override
    public String toString() {
        return name + " (Est: " + yearEstablished + ", Stadium: " + stadium + ", Current Coach: " + currentCoach + ")";
    }

    public void displayPlayers() {
        System.out.println("\n--- Players in " + name + " ---");
        if (players == null || players.length == 0) {
            System.out.println("No players available.");
            return;
        }
        for (int i = 0; i < players.length; i++) {
            System.out.println((i + 1) + ". " + players[i].getName() + " - " + players[i].getPosition());
        }
    }

    public void displayClubDetails() {
        System.out.println("\n=== " + name.toUpperCase() + " ===");
        System.out.println("Year Established: " + yearEstablished);
        System.out.println("Current Coach: " + currentCoach);
        System.out.println("Previous Coach: " + previousCoach);
        System.out.println("Stadium: " + stadium);
        System.out.println("Number of Players: " + (players != null ? players.length : 0));
    }
}
