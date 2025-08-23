public class League {
    private String name;
    private int yearEstablished;
    private String country;
    private int numberOfClubs;
    private Club[] clubs;


    public League(String name, int yearEstablished, String country, int numberOfClubs, Club[] clubs) {
        this.name = name;
        this.yearEstablished = yearEstablished;
        this.country = country;
        this.numberOfClubs = numberOfClubs;
        this.clubs = clubs;
    }


    public String getName() {
        return name;
    }


    public int getYearEstablished() {
        return yearEstablished;
    }


    public String getCountry() {
        return country;
    }


    public int getNumberOfClubs() {
        return numberOfClubs;
    }


    public Club[] getClubs() {
        return clubs;
    }


    @Override
    public String toString() {
        return name + " (Established: " + yearEstablished + ", Country: " + country + ", Clubs: " + numberOfClubs + ")";
    }


    public void displayClubs() {
        System.out.println("\n--- Clubs in " + name + " ---");
        if (clubs == null || clubs.length == 0) {
            System.out.println("No clubs available.");
            return;
        }
        for (int i = 0; i < clubs.length; i++) {
            System.out.println((i + 1) + ". " + clubs[i].getName());
        }
    }
}