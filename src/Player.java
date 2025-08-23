public class Player {
    private String name;
    private int shirtNumber;
    private String country;
    private String position;
    private int goalsScored;
    private int matchesPlayed;
    private String bio;


    public Player(String name, int shirtNumber, String country, String position, int goalsScored, int matchesPlayed, String bio) {
        this.name = name;
        this.shirtNumber = shirtNumber;
        this.country = country;
        this.position = position;
        this.goalsScored = goalsScored;
        this.matchesPlayed = matchesPlayed;
        this.bio = bio;
    }


    public String getName() {
        return name;
    }


    public int getShirtNumber() {
        return shirtNumber;
    }


    public String getCountry() {
        return country;
    }


    public String getPosition() {
        return position;
    }


    public int getGoalsScored() {
        return goalsScored;
    }


    public int getMatchesPlayed() {
        return matchesPlayed;
    }


    public String getBio() {
        return bio;
    }


    @Override
    public String toString() {
        return name + " (No. " + shirtNumber + ", " + position + ", " + country + ")";
    }


    public void displayPlayerDetails() {
        System.out.println("\n=== " + name.toUpperCase() + " ===");
        System.out.println("Shirt Number: " + shirtNumber);
        System.out.println("Country: " + country);
        System.out.println("Position: " + position);
        System.out.println("Goals Scored: " + goalsScored);
        System.out.println("Matches Played: " + matchesPlayed);
        System.out.println("Bio: " + bio);


        if (matchesPlayed > 0) {
            double ratio = (double) goalsScored / matchesPlayed;
            System.out.println("Goal Ratio: " + String.format("%.2f", ratio) + " goals per match");
        } else {
            System.out.println("Goal Ratio: N/A (no matches played)");
        }
    }
}