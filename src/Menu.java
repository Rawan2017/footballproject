
import java.util.List;
import java.util.Scanner;

public class Menu {
    private FootballData footballData;
    private Scanner scanner;

    public Menu() {
        footballData = new FootballData();
        scanner = new Scanner(System.in);
    }

    // بداية البرنامج (loop رئيسي)
    public void start() {
        System.out.println("=== FOOTBALL SIMULATION PROGRAM ===");
        System.out.println("Welcome to the Football Database!");

        while (true) {
            displayMainMenu();
            int choice = getValidIntInput("Enter your choice: ", 0, 3);

            switch (choice) {
                case 1:
                    browseLeagues();
                    break;
                case 2:
                    searchFunction();
                    break;
                case 3:
                    displayProgramInfo();
                    break;
                case 0:
                    System.out.println("Thank you for using the Football Simulation Program!");
                    return;
                default:
                    System.out.println("Unknown option. Try again.");
            }
        }
    }

    private void displayMainMenu() {
        System.out.println("\n=== MAIN MENU ===");
        System.out.println("1. Browse Leagues and Clubs");
        System.out.println("2. Search Function");
        System.out.println("3. Program Information");
        System.out.println("0. Exit Program");
    }

    // تصفح الدوريات
    private void browseLeagues() {
        List<League> leagues = footballData.getLeagues();
        if (leagues == null || leagues.isEmpty()) {
            System.out.println("No leagues available.");
            pause();
            return;
        }

        while (true) {
            System.out.println("\n=== SELECT A LEAGUE ===");
            for (int i = 0; i < leagues.size(); i++) {
                System.out.println((i + 1) + ". " + leagues.get(i).getName());
            }
            System.out.println("0. Back to Main Menu");

            int choice = getValidIntInput("Select a league: ", 0, leagues.size());
            if (choice == 0) break; // يرجع للـ Main Menu

            League selectedLeague = leagues.get(choice - 1);
            browseClubs(selectedLeague);
        }
    }

    // تصفح الأندية داخل دوري معين
    private void browseClubs(League league) {
        if (league == null) return;

        Club[] clubs = league.getClubs();
        if (clubs == null || clubs.length == 0) {
            System.out.println("No clubs available in " + league.getName());
            pause();
            return;
        }

        while (true) {
            System.out.println("\n" + league.getName().toUpperCase());
            league.displayClubs();
            System.out.println("0. Back to Leagues");

            int choice = getValidIntInput("Select a club: ", 0, clubs.length);
            if (choice == 0) break; // يرجع لقائمة الدوريات

            Club selectedClub = clubs[choice - 1];
            browsePlayers(selectedClub);
        }
    }

    // تصفح اللاعبين داخل نادي
    private void browsePlayers(Club club) {
        if (club == null) return;

        Player[] players = club.getPlayers();
        if (players == null || players.length == 0) {
            System.out.println("No players available for " + club.getName());
            pause();
            return;
        }

        while (true) {
            System.out.println("\n" + club.getName().toUpperCase());
            club.displayPlayers();
            System.out.println("0. Back to Clubs");
            System.out.println("99. View Club Details");

            int choice = getValidIntInput("Select a player or view club details: ", 0, players.length, 99);

            if (choice == 0) break; // يرجع للنوادي

            if (choice == 99) {
                club.displayClubDetails();
                pause();
                continue; // نعيد عرض قائمة اللاعبين
            }

            if (choice >= 1 && choice <= players.length) {
                Player selectedPlayer = players[choice - 1];
                selectedPlayer.displayPlayerDetails();
                pause();
                // بعد قراءة تفاصيل اللاعب نعيد عرض قائمة اللاعبين (loop)
            } else {
                System.out.println("Invalid selection. Please try again.");
                // لا نكسر اللوب هنا؛ نعيد للسؤال
            }
        }
    }

    // نافذة البحث
    private void searchFunction() {
        while (true) {
            System.out.println("\n=== SEARCH FUNCTION ===");
            System.out.println("1. Search for Player by Name");
            System.out.println("2. Search for Club by Name");
            System.out.println("3. Search for League by Country");
            System.out.println("0. Back to Main Menu");

            int choice = getValidIntInput("Select search type: ", 0, 3);

            switch (choice) {
                case 1:
                    searchPlayerByName();
                    break;
                case 2:
                    searchClubByName();
                    break;
                case 3:
                    searchLeagueByCountry();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Unknown option. Try again.");
            }
        }
    }

    private void searchPlayerByName() {
        System.out.print("Enter player name to search: ");
        String searchName = scanner.nextLine().trim().toLowerCase();

        if (searchName.isEmpty()) {
            System.out.println("Search query empty.");
            pause();
            return;
        }

        boolean found = false;
        for (League league : footballData.getLeagues()) {
            Club[] clubs = league.getClubs();
            if (clubs == null) continue;
            for (Club club : clubs) {
                Player[] players = club.getPlayers();
                if (players == null) continue;
                for (Player player : players) {
                    if (player.getName().toLowerCase().contains(searchName)) {
                        if (!found) {
                            System.out.println("\n=== SEARCH RESULTS ===");
                            found = true;
                        }
                        System.out.println("Found: " + player.getName() + " - " +
                                club.getName() + " (" + league.getName() + ")");
                    }
                }
            }
        }

        if (!found) {
            System.out.println("No players found with name containing: " + searchName);
        }
        pause();
    }

    private void searchClubByName() {
        System.out.print("Enter club name to search: ");
        String searchName = scanner.nextLine().trim().toLowerCase();

        if (searchName.isEmpty()) {
            System.out.println("Search query empty.");
            pause();
            return;
        }

        boolean found = false;
        for (League league : footballData.getLeagues()) {
            Club[] clubs = league.getClubs();
            if (clubs == null) continue;
            for (Club club : clubs) {
                if (club.getName().toLowerCase().contains(searchName)) {
                    if (!found) {
                        System.out.println("\n=== SEARCH RESULTS ===");
                        found = true;
                    }
                    System.out.println("Found: " + club.getName() + " - " + league.getName());
                }
            }
        }

        if (!found) {
            System.out.println("No clubs found with name containing: " + searchName);
        }
        pause();
    }

    private void searchLeagueByCountry() {
        System.out.print("Enter country name to search: ");
        String searchCountry = scanner.nextLine().trim().toLowerCase();

        if (searchCountry.isEmpty()) {
            System.out.println("Search query empty.");
            pause();
            return;
        }

        boolean found = false;
        for (League league : footballData.getLeagues()) {
            if (league.getCountry().toLowerCase().contains(searchCountry)) {
                if (!found) {
                    System.out.println("\n=== SEARCH RESULTS ===");
                    found = true;
                }
                System.out.println("Found: " + league.getName() + " - " + league.getCountry());
            }
        }

        if (!found) {
            System.out.println("No leagues found in country: " + searchCountry);
        }
        pause();
    }

    // طباعة معلومات البرنامج
    private void displayProgramInfo() {
        System.out.println("\n=== PROGRAM INFORMATION ===");
        System.out.println("Football Simulation Program");
        System.out.println("Features:");
        System.out.println("- 5 Major Leagues: Premier League, La Liga, Bundesliga, Serie A, Ligue 1");
        System.out.println("- 10 Clubs per League");
        System.out.println("- 10 Players per Club");
        System.out.println("- Detailed player statistics and information");
        System.out.println("- Search functionality");
        System.out.println("- User-friendly menu system");
        pause();
    }

    // نُسخ مُريحة من getValidIntInput: بقبول قيمة خاصة (specialValue) حتى لو كانت خارج النطاق
    private int getValidIntInput(String prompt, int min, int max) {
        return getValidIntInput(prompt, min, max, -1);
    }

    private int getValidIntInput(String prompt, int min, int max, int specialValue) {
        while (true) {
            try {
                System.out.print(prompt);
                String input = scanner.nextLine().trim();

                if (input.isEmpty()) {
                    System.out.println("Please enter a valid number.");
                    continue;
                }

                int value = Integer.parseInt(input);

                // إذا المستخدم دخل القيمة الخاصة نرجعها فورًا (مثلاً 99 لعرض تفاصيل النادي)
                if (value == specialValue) {
                    return value;
                }

                if (value >= min && value <= max) {
                    return value;
                }

                System.out.println("Please enter a number between " + min + " and " + max +
                        (specialValue != -1 ? " (or " + specialValue + " for special action)" : "") + ".");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }

    // إيقاف مؤقت بسيط حتى يقرأ المستخدم التفاصيل قبل العودة
    private void pause() {
        System.out.println("\nPress Enter to continue...");
        scanner.nextLine();
    }
}


