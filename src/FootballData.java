import java.util.ArrayList;
import java.util.List;

public class FootballData {
    public List<League> getLeagues() {
        return leagues;
    }

    private List<League> leagues;

    public FootballData() {
        leagues = new ArrayList<>();
        initializeData();
    }

    private void initializeData() {

        // Premier League
        Player[] manCityPlayers = {
                new Player("Erling Haaland", 9, "Norway", "Striker", 85, 95, "Prodigious goalscorer known for his physical strength and finishing ability"),
                new Player("Kevin De Bruyne", 17, "Belgium", "Midfielder", 65, 250, "Creative playmaker with exceptional vision and passing range"),
                new Player("Ederson", 31, "Brazil", "Goalkeeper", 0, 200, "Modern sweeper-keeper with excellent distribution skills"),
                new Player("Ruben Dias", 3, "Portugal", "Defender", 5, 120, "Composed center-back and natural leader in defense"),
                new Player("Phil Foden", 47, "England", "Midfielder", 45, 150, "Academy graduate with exceptional technical ability"),
                new Player("Rodri", 16, "Spain", "Midfielder", 15, 180, "Defensive midfielder with excellent positioning and passing"),
                new Player("Bernardo Silva", 20, "Portugal", "Midfielder", 40, 220, "Versatile attacking midfielder with great dribbling skills"),
                new Player("Jack Grealish", 10, "England", "Winger", 20, 80, "Creative winger known for his dribbling and drawing fouls"),
                new Player("Kyle Walker", 2, "England", "Defender", 8, 200, "Pacey right-back with excellent recovery speed"),
                new Player("John Stones", 5, "England", "Defender", 12, 180, "Ball-playing defender comfortable in midfield roles")
        };

        Player[] liverpoolPlayers = {
                new Player("Mohamed Salah", 11, "Egypt", "Forward", 150, 250, "Prolific goalscorer with exceptional speed and finishing"),
                new Player("Virgil van Dijk", 4, "Netherlands", "Defender", 15, 180, "Dominant center-back and defensive organizer"),
                new Player("Alisson Becker", 1, "Brazil", "Goalkeeper", 1, 160, "World-class shot-stopper with excellent distribution"),
                new Player("Trent Alexander-Arnold", 66, "England", "Defender", 12, 200, "Creative right-back with exceptional crossing ability"),
                new Player("Darwin Nunez", 9, "Uruguay", "Striker", 25, 60, "Energetic striker with pace and physical presence"),
                new Player("Luis Diaz", 7, "Colombia", "Winger", 20, 70, "Skilled winger with excellent dribbling and creativity"),
                new Player("Andy Robertson", 26, "Scotland", "Defender", 8, 220, "Attacking left-back with great crossing ability"),
                new Player("Cody Gakpo", 18, "Netherlands", "Forward", 15, 50, "Versatile forward with technical quality"),
                new Player("Ibrahima Konate", 5, "France", "Defender", 2, 60, "Powerful and pacey center-back"),
                new Player("Dominik Szoboszlai", 8, "Hungary", "Midfielder", 10, 40, "Creative midfielder with excellent shooting range")
        };

        Player[] arsenalPlayers = {
                new Player("Bukayo Saka", 7, "England", "Winger", 45, 180, "Academy product with exceptional dribbling and creativity"),
                new Player("Martin Odegaard", 8, "Norway", "Midfielder", 30, 120, "Creative captain with excellent technical skills"),
                new Player("Gabriel Jesus", 9, "Brazil", "Striker", 25, 80, "Versatile forward with excellent link-up play"),
                new Player("William Saliba", 2, "France", "Defender", 3, 70, "Composed center-back with excellent reading of the game"),
                new Player("Declan Rice", 41, "England", "Midfielder", 8, 200, "Dynamic midfielder with strong defensive qualities"),
                new Player("Gabriel Martinelli", 11, "Brazil", "Winger", 35, 130, "Pacey winger with excellent finishing ability"),
                new Player("Ben White", 4, "England", "Defender", 2, 90, "Versatile defender comfortable at right-back or center-back"),
                new Player("Aaron Ramsdale", 1, "England", "Goalkeeper", 0, 100, "Athletic goalkeeper with good distribution"),
                new Player("Kai Havertz", 29, "Germany", "Midfielder", 20, 150, "Versatile attacking midfielder with technical quality"),
                new Player("Oleksandr Zinchenko", 35, "Ukraine", "Defender", 5, 120, "Inverted left-back with excellent passing range")
        };

        Player[] chelseaPlayers = {
                new Player("Enzo Fernandez", 8, "Argentina", "Midfielder", 5, 40, "World Cup winner with excellent passing range"),
                new Player("Cole Palmer", 20, "England", "Midfielder", 15, 30, "Creative midfielder with excellent technical ability"),
                new Player("Raheem Sterling", 7, "England", "Winger", 120, 350, "Experienced winger with pace and dribbling skills"),
                new Player("Thiago Silva", 6, "Brazil", "Defender", 10, 400, "Veteran defender with exceptional reading of the game"),
                new Player("Reece James", 24, "England", "Defender", 15, 150, "Attacking right-back with excellent crossing"),
                new Player("Nicolas Jackson", 15, "Senegal", "Striker", 12, 35, "Pacey striker with good movement"),
                new Player("Conor Gallagher", 23, "England", "Midfielder", 10, 100, "Energetic box-to-box midfielder"),
                new Player("Moisés Caicedo", 25, "Ecuador", "Midfielder", 3, 80, "Defensive midfielder with strong tackling"),
                new Player("Levi Colwill", 26, "England", "Defender", 1, 40, "Young center-back with excellent potential"),
                new Player("Robert Sánchez", 1, "Spain", "Goalkeeper", 0, 120, "Athletic goalkeeper with good shot-stopping")
        };

        Player[] manUnitedPlayers = {
                new Player("Bruno Fernandes", 8, "Portugal", "Midfielder", 60, 180, "Creative captain with excellent passing and shooting"),
                new Player("Marcus Rashford", 10, "England", "Forward", 85, 300, "Pacey forward with excellent finishing ability"),
                new Player("Rasmus Hojlund", 11, "Denmark", "Striker", 10, 25, "Young striker with physical presence and potential"),
                new Player("Casemiro", 18, "Brazil", "Midfielder", 12, 350, "Experienced defensive midfielder with strong tackling"),
                new Player("Raphael Varane", 19, "France", "Defender", 8, 250, "World Cup winner with excellent defensive qualities"),
                new Player("Andre Onana", 24, "Cameroon", "Goalkeeper", 0, 200, "Modern goalkeeper with excellent distribution"),
                new Player("Mason Mount", 7, "England", "Midfielder", 30, 200, "Creative midfielder with good work rate"),
                new Player("Lisandro Martinez", 6, "Argentina", "Defender", 3, 100, "Aggressive defender with good passing"),
                new Player("Antony", 21, "Brazil", "Winger", 15, 80, "Skilled winger with good dribbling ability"),
                new Player("Diogo Dalot", 20, "Portugal", "Defender", 5, 150, "Attacking right-back with good crossing")
        };

        Player[] tottenhamPlayers = {
                new Player("Son Heung-min", 7, "South Korea", "Forward", 120, 300, "Prolific goalscorer with excellent finishing"),
                new Player("James Maddison", 10, "England", "Midfielder", 45, 200, "Creative playmaker with excellent vision"),
                new Player("Cristian Romero", 17, "Argentina", "Defender", 8, 120, "Aggressive defender with strong tackling"),
                new Player("Dejan Kulusevski", 21, "Sweden", "Winger", 25, 150, "Skilled winger with good physical presence"),
                new Player("Guglielmo Vicario", 13, "Italy", "Goalkeeper", 0, 100, "Athletic goalkeeper with good reflexes"),
                new Player("Yves Bissouma", 8, "Mali", "Midfielder", 5, 180, "Defensive midfielder with good ball retention"),
                new Player("Richarlison", 9, "Brazil", "Forward", 60, 200, "Versatile forward with good aerial ability"),
                new Player("Pedro Porro", 23, "Spain", "Defender", 10, 120, "Attacking right-back with excellent crossing"),
                new Player("Micky van de Ven", 37, "Netherlands", "Defender", 2, 40, "Pacey center-back with good recovery speed"),
                new Player("Pape Matar Sarr", 29, "Senegal", "Midfielder", 4, 60, "Energetic midfielder with good potential")
        };

        Player[] newcastlePlayers = {
                new Player("Bruno Guimaraes", 39, "Brazil", "Midfielder", 15, 100, "Complete midfielder with excellent technique"),
                new Player("Alexander Isak", 14, "Sweden", "Striker", 25, 70, "Pacey striker with excellent finishing"),
                new Player("Anthony Gordon", 10, "England", "Winger", 20, 120, "Skilled winger with good work rate"),
                new Player("Kieran Trippier", 2, "England", "Defender", 15, 400, "Experienced right-back with excellent crossing"),
                new Player("Nick Pope", 22, "England", "Goalkeeper", 0, 250, "Reliable goalkeeper with good shot-stopping"),
                new Player("Sven Botman", 4, "Netherlands", "Defender", 3, 80, "Composed center-back with good aerial ability"),
                new Player("Joelinton", 7, "Brazil", "Midfielder", 20, 150, "Powerful midfielder with good physical presence"),
                new Player("Callum Wilson", 9, "England", "Striker", 80, 250, "Clinical striker with good movement"),
                new Player("Harvey Barnes", 15, "England", "Winger", 40, 200, "Pacey winger with good finishing"),
                new Player("Fabian Schar", 5, "Switzerland", "Defender", 10, 300, "Experienced defender with good passing")
        };

        Player[] astonVillaPlayers = {
                new Player("Ollie Watkins", 11, "England", "Striker", 70, 200, "Pacey striker with good movement and finishing"),
                new Player("Douglas Luiz", 6, "Brazil", "Midfielder", 20, 180, "Creative midfielder with excellent passing"),
                new Player("Emiliano Martinez", 1, "Argentina", "Goalkeeper", 0, 150, "World Cup winner with excellent shot-stopping"),
                new Player("John McGinn", 7, "Scotland", "Midfielder", 35, 250, "Energetic midfielder with good leadership"),
                new Player("Leon Bailey", 31, "Jamaica", "Winger", 30, 150, "Pacey winger with good dribbling skills"),
                new Player("Pau Torres", 14, "Spain", "Defender", 8, 120, "Ball-playing defender with excellent technique"),
                new Player("Moussa Diaby", 19, "France", "Winger", 25, 100, "Skilled winger with excellent pace"),
                new Player("Ezri Konsa", 4, "England", "Defender", 5, 180, "Reliable defender with good positioning"),
                new Player("Boubacar Kamara", 44, "France", "Midfielder", 3, 100, "Defensive midfielder with strong tackling"),
                new Player("Matty Cash", 2, "Poland", "Defender", 10, 150, "Attacking right-back with good crossing")
        };

        Player[] brightonPlayers = {
                new Player("Pascal Gross", 13, "Germany", "Midfielder", 40, 250, "Versatile midfielder with excellent creativity"),
                new Player("Evan Ferguson", 28, "Ireland", "Striker", 15, 40, "Young striker with excellent potential"),
                new Player("Kaoru Mitoma", 22, "Japan", "Winger", 20, 60, "Skilled winger with excellent dribbling"),
                new Player("Lewis Dunk", 5, "England", "Defender", 20, 400, "Captain and reliable center-back"),
                new Player("Alexis Mac Allister", 10, "Argentina", "Midfielder", 25, 120, "World Cup winner with excellent technique"),
                new Player("Solly March", 7, "England", "Winger", 30, 300, "Experienced winger with good crossing"),
                new Player("Joao Pedro", 9, "Brazil", "Forward", 15, 50, "Versatile forward with good technical ability"),
                new Player("Billy Gilmour", 11, "Scotland", "Midfielder", 2, 80, "Technical midfielder with good passing"),
                new Player("Tariq Lamptey", 2, "Ghana", "Defender", 5, 100, "Pacey right-back with good attacking ability"),
                new Player("Jason Steele", 23, "England", "Goalkeeper", 0, 150, "Reliable goalkeeper with good distribution")
        };

        Player[] westHamPlayers = {
                new Player("Jarrod Bowen", 20, "England", "Forward", 60, 200, "Versatile forward with excellent work rate"),
                new Player("Lucas Paqueta", 10, "Brazil", "Midfielder", 20, 100, "Creative midfielder with excellent technique"),
                new Player("Mohammed Kudus", 14, "Ghana", "Forward", 15, 50, "Skilled forward with good dribbling ability"),
                new Player("Declan Rice", 41, "England", "Midfielder", 12, 250, "Former captain and dynamic midfielder"),
                new Player("Tomas Soucek", 28, "Czech Republic", "Midfielder", 25, 150, "Box-to-box midfielder with aerial threat"),
                new Player("Vladimir Coufal", 5, "Czech Republic", "Defender", 8, 120, "Reliable right-back with good crossing"),
                new Player("Nayef Aguerd", 27, "Morocco", "Defender", 5, 80, "Composed defender with good passing"),
                new Player("Alphonse Areola", 13, "France", "Goalkeeper", 0, 200, "Athletic goalkeeper with good reflexes"),
                new Player("Michail Antonio", 9, "Jamaica", "Striker", 70, 300, "Physical striker with good hold-up play"),
                new Player("James Ward-Prowse", 7, "England", "Midfielder", 50, 350, "Set-piece specialist with excellent passing")
        };

        Club[] premierLeagueClubs = {
                new Club("Manchester City", 1880, "Pep Guardiola", "Manuel Pellegrini", "Etihad Stadium", manCityPlayers),
                new Club("Liverpool", 1892, "Jurgen Klopp", "Brendan Rodgers", "Anfield", liverpoolPlayers),
                new Club("Arsenal", 1886, "Mikel Arteta", "Unai Emery", "Emirates Stadium", arsenalPlayers),
                new Club("Chelsea", 1905, "Mauricio Pochettino", "Graham Potter", "Stamford Bridge", chelseaPlayers),
                new Club("Manchester United", 1878, "Erik ten Hag", "Ralf Rangnick", "Old Trafford", manUnitedPlayers),
                new Club("Tottenham", 1882, "Ange Postecoglou", "Antonio Conte", "Tottenham Hotspur Stadium", tottenhamPlayers),
                new Club("Newcastle", 1892, "Eddie Howe", "Steve Bruce", "St James' Park", newcastlePlayers),
                new Club("Aston Villa", 1874, "Unai Emery", "Steven Gerrard", "Villa Park", astonVillaPlayers),
                new Club("Brighton", 1901, "Roberto De Zerbi", "Graham Potter", "Amex Stadium", brightonPlayers),
                new Club("West Ham", 1895, "David Moyes", "Manuel Pellegrini", "London Stadium", westHamPlayers)
        };

        leagues.add(new League("Premier League", 1992, "England", 20, premierLeagueClubs));

        // La Liga - Real Madrid Players
        Player[] realMadridPlayers = {
                new Player("Jude Bellingham", 5, "England", "Midfielder", 20, 40, "Young midfielder with exceptional talent and maturity"),
                new Player("Vinicius Junior", 7, "Brazil", "Winger", 60, 200, "Skilled winger with excellent dribbling and pace"),
                new Player("Rodrygo", 11, "Brazil", "Forward", 35, 150, "Versatile forward with good finishing ability"),
                new Player("Toni Kroos", 8, "Germany", "Midfielder", 25, 400, "Experienced midfielder with exceptional passing"),
                new Player("Luka Modric", 10, "Croatia", "Midfielder", 30, 450, "Ballon d'Or winner with excellent creativity"),
                new Player("Federico Valverde", 15, "Uruguay", "Midfielder", 20, 200, "Energetic midfielder with good shooting"),
                new Player("Eder Militao", 3, "Brazil", "Defender", 8, 150, "Athletic defender with good recovery speed"),
                new Player("Dani Carvajal", 2, "Spain", "Defender", 10, 400, "Experienced right-back with good crossing"),
                new Player("Thibaut Courtois", 1, "Belgium", "Goalkeeper", 0, 350, "World-class goalkeeper with excellent shot-stopping"),
                new Player("Antonio Rudiger", 22, "Germany", "Defender", 12, 300, "Physical defender with strong tackling")
        };

        // La Liga - Barcelona Players
        Player[] barcelonaPlayers = {
                new Player("Robert Lewandowski", 9, "Poland", "Striker", 150, 400, "Prolific goalscorer with excellent finishing"),
                new Player("Pedri", 8, "Spain", "Midfielder", 15, 100, "Young creative midfielder with exceptional talent"),
                new Player("Gavi", 6, "Spain", "Midfielder", 8, 80, "Energetic midfielder with good technical ability"),
                new Player("Frenkie de Jong", 21, "Netherlands", "Midfielder", 12, 200, "Technical midfielder with excellent dribbling"),
                new Player("Ilkay Gundogan", 22, "Germany", "Midfielder", 50, 350, "Experienced midfielder with good leadership"),
                new Player("Ronald Araujo", 4, "Uruguay", "Defender", 5, 120, "Physical defender with good aerial ability"),
                new Player("Joao Cancelo", 2, "Portugal", "Defender", 15, 250, "Versatile full-back with excellent attacking skills"),
                new Player("Marc-Andre ter Stegen", 1, "Germany", "Goalkeeper", 0, 350, "Modern goalkeeper with excellent distribution"),
                new Player("Ferran Torres", 7, "Spain", "Forward", 40, 150, "Versatile forward with good movement"),
                new Player("Alejandro Balde", 3, "Spain", "Defender", 2, 80, "Pacey left-back with good attacking potential")
        };

        // Continue with other La Liga clubs...
        Club[] laLigaClubs = {
                new Club("Real Madrid", 1902, "Carlo Ancelotti", "Zinedine Zidane", "Santiago Bernabeu", realMadridPlayers),
                new Club("Barcelona", 1899, "Xavi Hernandez", "Ronald Koeman", "Camp Nou", barcelonaPlayers),
                new Club("Atletico Madrid", 1903, "Diego Simeone", "Quique Sanchez Flores", "Metropolitano", createLaLigaPlayers("Atletico")),
                new Club("Sevilla", 1890, "Quique Sanchez Flores", "Jorge Sampaoli", "Ramon Sanchez Pizjuan", createLaLigaPlayers("Sevilla")),
                new Club("Valencia", 1919, "Ruben Baraja", "Gennaro Gattuso", "Mestalla", createLaLigaPlayers("Valencia")),
                new Club("Real Sociedad", 1909, "Imanol Alguacil", "Asier Garitano", "Reale Arena", createLaLigaPlayers("Real Sociedad")),
                new Club("Athletic Bilbao", 1898, "Ernesto Valverde", "Marcelino", "San Mames", createLaLigaPlayers("Athletic")),
                new Club("Villarreal", 1923, "Marcelino", "Quique Setien", "Estadio de la Ceramica", createLaLigaPlayers("Villarreal")),
                new Club("Real Betis", 1907, "Manuel Pellegrini", "Rubi", "Benito Villamarin", createLaLigaPlayers("Betis")),
                new Club("Celta Vigo", 1923, "Rafael Benitez", "Carlos Carvalhal", "Balaidos", createLaLigaPlayers("Celta"))
        };

        leagues.add(new League("La Liga", 1929, "Spain", 20, laLigaClubs));

        // Bundesliga - Bayern Munich Players
        Player[] bayernPlayers = {
                new Player("Harry Kane", 9, "England", "Striker", 200, 350, "Prolific goalscorer with excellent finishing and link-up play"),
                new Player("Jamal Musiala", 42, "Germany", "Midfielder", 30, 120, "Young creative midfielder with exceptional dribbling"),
                new Player("Leroy Sane", 10, "Germany", "Winger", 80, 300, "Pacey winger with excellent cutting inside ability"),
                new Player("Joshua Kimmich", 6, "Germany", "Midfielder", 40, 350, "Versatile midfielder with excellent passing range"),
                new Player("Manuel Neuer", 1, "Germany", "Goalkeeper", 0, 500, "Sweeper-keeper with exceptional shot-stopping"),
                new Player("Thomas Muller", 25, "Germany", "Forward", 150, 600, "Experienced forward with excellent positioning"),
                new Player("Alphonso Davies", 19, "Canada", "Defender", 15, 150, "Pacey left-back with excellent attacking ability"),
                new Player("Dayot Upamecano", 2, "France", "Defender", 8, 200, "Physical defender with good recovery speed"),
                new Player("Leon Goretzka", 8, "Germany", "Midfielder", 35, 300, "Box-to-box midfielder with good physical presence"),
                new Player("Kingsley Coman", 11, "France", "Winger", 60, 250, "Skilled winger with excellent pace and dribbling")
        };

        // Continue with other Bundesliga clubs...
        Club[] bundesligaClubs = {
                new Club("Bayern Munich", 1900, "Thomas Tuchel", "Julian Nagelsmann", "Allianz Arena", bayernPlayers),
                new Club("Borussia Dortmund", 1909, "Edin Terzic", "Marco Rose", "Signal Iduna Park", createBundesligaPlayers("Dortmund")),
                new Club("RB Leipzig", 2009, "Marco Rose", "Domenico Tedesco", "Red Bull Arena", createBundesligaPlayers("Leipzig")),
                new Club("Bayer Leverkusen", 1904, "Xabi Alonso", "Gerardo Seoane", "BayArena", createBundesligaPlayers("Leverkusen")),
                new Club("Eintracht Frankfurt", 1899, "Dino Toppmoller", "Oliver Glasner", "Deutsche Bank Park", createBundesligaPlayers("Frankfurt")),
                new Club("Wolfsburg", 1945, "Niko Kovac", "Florian Kohfeldt", "Volkswagen Arena", createBundesligaPlayers("Wolfsburg")),
                new Club("Borussia Monchengladbach", 1900, "Gerardo Seoane", "Daniel Farke", "Borussia-Park", createBundesligaPlayers("Gladbach")),
                new Club("Stuttgart", 1893, "Sebastian Hoeness", "Pellegrino Matarazzo", "MHPArena", createBundesligaPlayers("Stuttgart")),
                new Club("Hoffenheim", 1899, "Pellegrino Matarazzo", "Andre Breitenreiter", "PreZero Arena", createBundesligaPlayers("Hoffenheim")),
                new Club("Freiburg", 1904, "Christian Streich", "Robin Dutt", "Europa-Park Stadion", createBundesligaPlayers("Freiburg"))
        };

        leagues.add(new League("Bundesliga", 1963, "Germany", 18, bundesligaClubs));

        // Serie A - Inter Milan Players
        Player[] interPlayers = {
                new Player("Lautaro Martinez", 10, "Argentina", "Striker", 100, 200, "Clinical striker with excellent movement and finishing"),
                new Player("Nicolo Barella", 23, "Italy", "Midfielder", 30, 200, "Energetic midfielder with excellent technique"),
                new Player("Marcus Thuram", 9, "France", "Forward", 40, 150, "Versatile forward with good physical presence"),
                new Player("Hakan Calhanoglu", 20, "Turkey", "Midfielder", 50, 300, "Creative midfielder with excellent set-pieces"),
                new Player("Alessandro Bastoni", 95, "Italy", "Defender", 5, 150, "Ball-playing defender with good passing"),
                new Player("Federico Dimarco", 32, "Italy", "Defender", 15, 120, "Attacking left-back with excellent crossing"),
                new Player("Henrikh Mkhitaryan", 22, "Armenia", "Midfielder", 70, 400, "Experienced midfielder with good creativity"),
                new Player("Benjamin Pavard", 28, "France", "Defender", 10, 200, "Versatile defender with good technical ability"),
                new Player("Yann Sommer", 1, "Switzerland", "Goalkeeper", 0, 300, "Experienced goalkeeper with good reflexes"),
                new Player("Francesco Acerbi", 15, "Italy", "Defender", 20, 400, "Veteran defender with excellent positioning")
        };

        // Continue with other Serie A clubs...
        Club[] serieAClubs = {
                new Club("Inter Milan", 1908, "Simone Inzaghi", "Antonio Conte", "San Siro", interPlayers),
                new Club("AC Milan", 1899, "Stefano Pioli", "Marco Giampaolo", "San Siro", createSerieAPlayers("Milan")),
                new Club("Juventus", 1897, "Massimiliano Allegri", "Andrea Pirlo", "Allianz Stadium", createSerieAPlayers("Juventus")),
                new Club("Napoli", 1926, "Walter Mazzarri", "Rudi Garcia", "Diego Armando Maradona", createSerieAPlayers("Napoli")),
                new Club("Roma", 1927, "Jose Mourinho", "Paulo Fonseca", "Stadio Olimpico", createSerieAPlayers("Roma")),
                new Club("Lazio", 1900, "Maurizio Sarri", "Simone Inzaghi", "Stadio Olimpico", createSerieAPlayers("Lazio")),
                new Club("Atalanta", 1907, "Gian Piero Gasperini", "Edoardo Reja", "Gewiss Stadium", createSerieAPlayers("Atalanta")),
                new Club("Fiorentina", 1926, "Vincenzo Italiano", "Giuseppe Iachini", "Artemio Franchi", createSerieAPlayers("Fiorentina")),
                new Club("Bologna", 1909, "Thiago Motta", "Sinisa Mihajlovic", "Renato Dall'Ara", createSerieAPlayers("Bologna")),
                new Club("Torino", 1906, "Ivan Juric", "Marco Giampaolo", "Stadio Olimpico Grande Torino", createSerieAPlayers("Torino"))
        };

        leagues.add(new League("Serie A", 1898, "Italy", 20, serieAClubs));

        // Ligue 1 - PSG Players
        Player[] psgPlayers = {
                new Player("Kylian Mbappe", 7, "France", "Forward", 200, 250, "World-class forward with exceptional pace and finishing"),
                new Player("Ousmane Dembele", 10, "France", "Winger", 60, 200, "Skilled winger with excellent dribbling ability"),
                new Player("Achraf Hakimi", 2, "Morocco", "Defender", 20, 150, "Attacking right-back with excellent pace"),
                new Player("Marquinhos", 5, "Brazil", "Defender", 15, 350, "Captain and reliable center-back"),
                new Player("Gianluigi Donnarumma", 99, "Italy", "Goalkeeper", 0, 200, "Tall goalkeeper with excellent shot-stopping"),
                new Player("Vitinha", 17, "Portugal", "Midfielder", 10, 100, "Technical midfielder with good passing"),
                new Player("Warren Zaire-Emery", 33, "France", "Midfielder", 5, 30, "Young midfielder with exceptional potential"),
                new Player("Lucas Hernandez", 21, "France", "Defender", 8, 200, "Versatile defender with good technical ability"),
                new Player("Randal Kolo Muani", 23, "France", "Forward", 30, 100, "Pacey forward with good movement"),
                new Player("Manuel Ugarte", 4, "Uruguay", "Midfielder", 2, 80, "Defensive midfielder with strong tackling")
        };

        // Continue with other Ligue 1 clubs...
        Club[] ligue1Clubs = {
                new Club("PSG", 1970, "Luis Enrique", "Christophe Galtier", "Parc des Princes", psgPlayers),
                new Club("Marseille", 1899, "Gennaro Gattuso", "Igor Tudor", "Stade Velodrome", createLigue1Players("Marseille")),
                new Club("Lyon", 1950, "Pierre Sage", "Laurent Blanc", "Groupama Stadium", createLigue1Players("Lyon")),
                new Club("Monaco", 1924, "Adi Hutter", "Philippe Clement", "Stade Louis II", createLigue1Players("Monaco")),
                new Club("Lille", 1944, "Paulo Fonseca", "Jocelyn Gourvennec", "Decathlon Arena", createLigue1Players("Lille")),
                new Club("Rennes", 1901, "Julien Stephan", "Bruno Genesio", "Roazhon Park", createLigue1Players("Rennes")),
                new Club("Nice", 1904, "Francesco Farioli", "Didier Digard", "Allianz Riviera", createLigue1Players("Nice")),
                new Club("Lens", 1906, "Franck Haise", "Sylvain Ripoll", "Stade Bollaert-Delelis", createLigue1Players("Lens")),
                new Club("Reims", 1931, "Will Still", "Oscar Garcia", "Stade Auguste Delaune", createLigue1Players("Reims")),
                new Club("Montpellier", 1974, "Michel der Zakarian", "Romain Pitau", "Stade de la Mosson", createLigue1Players("Montpellier"))
        };

        leagues.add(new League("Ligue 1", 1933, "France", 20, ligue1Clubs));
    }

    // -----------------------------
    // Helper factories for missing clubs (return 10 real-ish players per club)
    // -----------------------------

    private Player[] createLaLigaPlayers(String club) {
        if (club == null) club = "";
        switch (club.toLowerCase()) {
            case "atletico":
            case "atletico madrid":
                return new Player[]{
                        new Player("Jan Oblak", 13, "Slovenia", "Goalkeeper", 0, 200, "Top goalkeeper and defensive leader for Atletico Madrid"),
                        new Player("Koke", 6, "Spain", "Midfielder", 25, 450, "Experienced captain and playmaker for Atletico Madrid"),
                        new Player("Marcos Llorente", 14, "Spain", "Midfielder", 40, 300, "Energetic midfielder with excellent stamina and runs"),
                        new Player("Jose Gimenez", 2, "Uruguay", "Defender", 8, 220, "Reliable center-back with strong tackling"),
                        new Player("Stefan Savić", 15, "Montenegro", "Defender", 10, 280, "Physical defender, strong in the air"),
                        new Player("Rodrigo De Paul", 7, "Argentina", "Midfielder", 20, 180, "Creative midfielder with great work-rate"),
                        new Player("Antoine Griezmann", 7, "France", "Forward", 85, 500, "Experienced forward with excellent movement and finishing"),
                        new Player("Alvaro Morata", 9, "Spain", "Striker", 70, 320, "Clinical striker with strong link-up play"),
                        new Player("Nahuel Molina", 17, "Argentina", "Defender", 6, 120, "Right-back with good attacking contributions"),
                        new Player("Samuel Lino", 11, "Brazil", "Winger", 12, 60, "Pacey winger with good dribbling")
                };
            case "sevilla":
                return new Player[]{
                        new Player("Yassine Bounou", 1, "Morocco", "Goalkeeper", 0, 180, "Reliable shot-stopper for Sevilla"),
                        new Player("Jules Koundé", 5, "France", "Defender", 12, 160, "Quick center-back adept on the ball"),
                        new Player("Diego Carlos", 3, "Brazil", "Defender", 10, 200, "Strong central defender with aerial presence"),
                        new Player("Ivan Rakitić", 10, "Croatia", "Midfielder", 30, 400, "Experienced midfield creator"),
                        new Player("Óliver Torres", 8, "Spain", "Midfielder", 15, 220, "Creative midfielder with good passing"),
                        new Player("Aleix Vidal", 2, "Spain", "Defender", 5, 180, "Versatile full-back"),
                        new Player("Youssef En-Nesyri", 12, "Morocco", "Striker", 60, 200, "Powerful striker with aerial threat"),
                        new Player("Suso", 19, "Spain", "Winger", 18, 160, "Attacking winger with good technique"),
                        new Player("Nemanja Gudelj", 15, "Serbia", "Midfielder", 8, 150, "Holding midfielder with great positioning"),
                        new Player("Joan Jordán", 21, "Spain", "Midfielder", 20, 210, "Box-to-box midfielder with good work-rate")
                };
            case "valencia":
                return new Player[]{
                        new Player("Giorgi Mamardashvili", 88, "Georgia", "Goalkeeper", 0, 60, "Promising goalkeeper with good reflexes"),
                        new Player("Jose Gayà", 14, "Spain", "Defender", 5, 300, "Experienced left-back and club leader"),
                        new Player("Hugo Guillamón", 6, "Spain", "Defender", 6, 140, "Young versatile defender"),
                        new Player("Daniel Wass", 22, "Denmark", "Midfielder", 10, 220, "Reliable right-sided midfielder"),
                        new Player("Carlos Soler", 10, "Spain", "Midfielder", 40, 260, "Creative force and set-piece taker"),
                        new Player("Gonçalo Guedes", 7, "Portugal", "Winger", 35, 250, "Pacey winger with direct runs"),
                        new Player("Hugo Duro", 9, "Spain", "Striker", 18, 90, "Clinical finisher in and around box"),
                        new Player("Toni Lato", 3, "Spain", "Defender", 2, 110, "Full-back with attacking qualities"),
                        new Player("Maxi Gómez", 18, "Uruguay", "Forward", 25, 150, "Strong forward good in hold-up play"),
                        new Player("Kevin Gameiro", 27, "France", "Forward", 20, 240, "Experienced striker")
                };
            case "real sociedad":

                return new Player[]{
                        new Player("Alex Remiro", 13, "Spain", "Goalkeeper", 0, 160, "Solid goalkeeper for Real Sociedad"),
                        new Player("Aritz Elustondo", 2, "Spain", "Defender", 8, 220, "Dependable full-back"),
                        new Player("Robin Le Normand", 4, "Spain", "Defender", 6, 180, "Calm ball-playing center-back"),
                        new Player("Mikel Oyarzabal", 10, "Spain", "Forward", 70, 300, "Club talisman and attacker"),
                        new Player("David Silva", 21, "Spain", "Midfielder", 50, 500, "Creative veteran playmaker"),
                        new Player("Martin Zubimendi", 8, "Spain", "Midfielder", 10, 120, "Energetic midfielder with defensive sense"),
                        new Player("Brais Méndez", 16, "Spain", "Midfielder", 18, 140, "Attacking midfielder with technique"),
                        new Player("Andoni Gorosabel", 12, "Spain", "Defender", 3, 110, "Right-back with good stamina"),
                        new Player("Kike", 9, "Spain", "Forward", 22, 150, "Versatile attacker"),
                        new Player("Igor Zubeldia", 14, "Spain", "Midfielder", 5, 180, "Defensive-minded midfielder")
                };
            case "athletic":
            case "athletic bilbao":
                return new Player[]{
                        new Player("Unai Simón", 1, "Spain", "Goalkeeper", 0, 210, "Reliable goalkeeper and international"),
                        new Player("Iker Muniain", 10, "Spain", "Midfielder", 60, 500, "Creative captain and winger"),
                        new Player("Iñaki Williams", 9, "Spain", "Forward", 80, 400, "Pacey forward with high work-rate"),
                        new Player("Nico Williams", 11, "Spain", "Winger", 20, 90, "Explosive winger with great acceleration"),
                        new Player("Yeray Álvarez", 22, "Spain", "Defender", 5, 140, "Solid center-back"),
                        new Player("Iñigo Martinez", 4, "Spain", "Defender", 10, 300, "Experienced center-back"),
                        new Player("Mikel Vesga", 6, "Spain", "Midfielder", 2, 120, "Defensive midfielder"),
                        new Player("Óscar de Marcos", 2, "Spain", "Defender", 6, 350, "Versatile full-back and veteran"),
                        new Player("Raúl García", 19, "Spain", "Midfielder", 90, 600, "Experienced attacking midfielder/forward"),
                        new Player("Ander Herrera", 21, "Spain", "Midfielder", 30, 400, "Playmaker and leader")
                };
            case "villarreal":
                return new Player[]{
                        new Player("Gerónimo Rulli", 1, "Argentina", "Goalkeeper", 0, 120, "Agile goalkeeper with good distribution"),
                        new Player("Pau Torres", 4, "Spain", "Defender", 12, 200, "Ball-playing center-back with composure"),
                        new Player("Raúl Albiol", 3, "Spain", "Defender", 8, 350, "Veteran center-back with experience"),
                        new Player("Yeremi Pino", 21, "Spain", "Winger", 25, 140, "Young winger with great skill"),
                        new Player("Arnaut Danjuma", 19, "Netherlands", "Forward", 35, 100, "Pacey forward with finishing"),
                        new Player("Etienne Capoue", 25, "France", "Midfielder", 10, 300, "Physical midfielder"),
                        new Player("Dani Parejo", 8, "Spain", "Midfielder", 45, 400, "Creative deep-lying playmaker"),
                        new Player("Alfonso Pedraza", 14, "Spain", "Defender", 6, 180, "Left-back with attacking output"),
                        new Player("Boulaye Dia", 29, "Senegal", "Striker", 20, 120, "Strong center-forward"),
                        new Player("Francis Coquelin", 22, "France", "Midfielder", 4, 260, "Defensive midfielder")
                };
            case "betis":
            case "real betis":
                return new Player[]{
                        new Player("Rui Silva", 13, "Portugal", "Goalkeeper", 0, 120, "Competent goalkeeper with good reflexes"),
                        new Player("Marc Bartra", 15, "Spain", "Defender", 6, 220, "Experienced center-back"),
                        new Player("Guido Rodríguez", 16, "Argentina", "Midfielder", 10, 200, "Defensive midfielder with reading of the game"),
                        new Player("Nabil Fekir", 8, "France", "Midfielder", 30, 220, "Creative midfielder with good shooting"),
                        new Player("Borja Iglesias", 9, "Spain", "Striker", 40, 180, "Central striker with good finishing"),
                        new Player("Sergio Canales", 21, "Spain", "Midfielder", 35, 300, "Skillful attacking midfielder"),
                        new Player("Joaquín", 17, "Spain", "Winger", 50, 700, "Veteran winger and club legend"),
                        new Player("Álex Moreno", 3, "Spain", "Defender", 6, 200, "Left-back with attacking thrust"),
                        new Player("Diego Lainez", 22, "Mexico", "Winger", 7, 120, "Young winger with trickery"),
                        new Player("William Carvalho", 14, "Portugal", "Midfielder", 8, 220, "Physical defensive midfielder")
                };
            case "celta":
            case "celta vigo":
                return new Player[]{
                        new Player("Ivan Villar", 13, "Spain", "Goalkeeper", 0, 90, "Reliable keeper for Celta"),
                        new Player("Joseph Aidoo", 3, "Ghana", "Defender", 6, 180, "Strong center-back"),
                        new Player("Nolito", 21, "Spain", "Winger", 25, 400, "Experienced winger with good movement"),
                        new Player("Iago Aspas", 10, "Spain", "Forward", 140, 500, "Club legend and prolific striker"),
                        new Player("Denis Suárez", 7, "Spain", "Midfielder", 20, 300, "Creative midfielder when fit"),
                        new Player("Santi Mina", 9, "Spain", "Forward", 30, 250, "Versatile forward and finisher"),
                        new Player("Fran Beltrán", 8, "Spain", "Midfielder", 10, 150, "Box-to-box midfielder"),
                        new Player("Jordi Mboula", 17, "Spain", "Winger", 5, 60, "Young attacking talent"),
                        new Player("Okay Yokuslu", 4, "Turkey", "Defender", 3, 160, "Defensive midfielder/center-back"),
                        new Player("Brais Méndez", 11, "Spain", "Midfielder", 18, 140, "Attacking midfielder with technique")
                };
            default:
                // Default: return generic but with club in bio
                return new Player[]{
                        new Player("Player 1", 1, "Country", "Goalkeeper", 0, 50, "Key player for " + club),
                        new Player("Player 2", 2, "Country", "Defender", 2, 60, "Key player for " + club),
                        new Player("Player 3", 3, "Country", "Defender", 4, 70, "Key player for " + club),
                        new Player("Player 4", 4, "Country", "Midfielder", 5, 80, "Key player for " + club),
                        new Player("Player 5", 5, "Country", "Midfielder", 6, 90, "Key player for " + club),
                        new Player("Player 6", 6, "Country", "Midfielder", 7, 100, "Key player for " + club),
                        new Player("Player 7", 7, "Country", "Winger", 8, 110, "Key player for " + club),
                        new Player("Player 8", 8, "Country", "Winger", 9, 120, "Key player for " + club),
                        new Player("Player 9", 9, "Country", "Striker", 10, 130, "Key player for " + club),
                        new Player("Player 10", 10, "Country", "Striker", 11, 140, "Key player for " + club)
                };
        }
    }

    private Player[] createBundesligaPlayers(String club) {
        if (club == null) club = "";
        switch (club.toLowerCase()) {
            case "dortmund":
            case "borussia dortmund":
                return new Player[]{
                        new Player("Gregor Kobel", 1, "Switzerland", "Goalkeeper", 0, 90, "Agile keeper with great shot-stopping"),
                        new Player("Mats Hummels", 15, "Germany", "Defender", 10, 350, "Experienced center-back with leadership"),
                        new Player("Manuel Akanji", 16, "Switzerland", "Defender", 5, 180, "Solid center-back comfortable on ball"),
                        new Player("Julian Brandt", 19, "Germany", "Midfielder", 25, 240, "Creative midfielder with good vision"),
                        new Player("Jadon Sancho", 7, "England", "Winger", 60, 300, "Pacey winger with dribbling skills"),
                        new Player("Marco Reus", 11, "Germany", "Forward", 120, 400, "Veteran forward and club icon"),
                        new Player("Niclas Füllkrug", 9, "Germany", "Striker", 30, 120, "Powerful striker with great finishing"),
                        new Player("Donyell Malen", 12, "Netherlands", "Forward", 25, 140, "Quick striker with good movement"),
                        new Player("Raphaël Guerreiro", 22, "Portugal", "Defender", 10, 300, "Attack-minded full-back"),
                        new Player("Emre Can", 23, "Germany", "Midfielder", 8, 220, "Box-to-box midfielder with physical presence")
                };
            case "leipzig":
            case "rb leipzig":
                return new Player[]{
                        new Player("Peter Gulacsi", 1, "Hungary", "Goalkeeper", 0, 220, "Reliable shot-stopper"),
                        new Player("Willi Orban", 4, "Hungary", "Defender", 12, 260, "Experienced center-back and leader"),
                        new Player("Mohamed Simakan", 3, "France", "Defender", 4, 110, "Young defender with athleticism"),
                        new Player("Xavi Simons", 10, "Netherlands", "Midfielder", 20, 120, "Creative attacking midfielder"),
                        new Player("Timo Werner", 11, "Germany", "Forward", 60, 300, "Pacey striker with movement"),
                        new Player("Christopher Nkunku", 18, "France", "Forward", 50, 180, "Versatile attacker with scoring touch"),
                        new Player("Ryan Gravenberch", 25, "Netherlands", "Midfielder", 8, 80, "Tall box-to-box midfielder"),
                        new Player("Andre Silva", 9, "Portugal", "Striker", 35, 140, "Clinical finisher"),
                        new Player("Konrad Laimer", 6, "Austria", "Midfielder", 10, 200, "Energetic midfielder"),
                        new Player("Amadou Haidara", 8, "Mali", "Midfielder", 12, 210, "Box-to-box midfielder")
                };
            case "leverkusen":
            case "bayer leverkusen":
                return new Player[]{
                        new Player("Lukas Hradecky", 1, "Finland", "Goalkeeper", 0, 220, "Experienced goalkeeper"),
                        new Player("Jonathan Tah", 4, "Germany", "Defender", 6, 210, "Strong center-back"),
                        new Player("Piero Hincapié", 2, "Ecuador", "Defender", 5, 90, "Young defender with great potential"),
                        new Player("Jeremie Frimpong", 21, "Netherlands", "Defender", 12, 140, "Explosive full-back"),
                        new Player("Charles Aránguiz", 20, "Chile", "Midfielder", 10, 320, "Experienced midfielder"),
                        new Player("Florian Wirtz", 10, "Germany", "Midfielder", 40, 120, "Creative prodigy and playmaker"),
                        new Player("Moussa Diaby", 7, "France", "Winger", 25, 160, "Pacey winger with skill"),
                        new Player("Victor Boniface", 9, "Nigeria", "Striker", 18, 60, "Young forward with scoring instinct"),
                        new Player("Robert Andrich", 8, "Germany", "Midfielder", 7, 200, "Hard-working midfielder"),
                        new Player("Sven Bender", 5, "Germany", "Defender", 3, 400, "Veteran defender (role model)")
                };
            case "frankfurt":
            case "eintracht frankfurt":
                return new Player[]{
                        new Player("Kevin Trapp", 25, "Germany", "Goalkeeper", 0, 230, "Commanding goalkeeper"),
                        new Player("Tuta", 2, "Brazil", "Defender", 6, 140, "Powerful center-back"),
                        new Player("Martin Hinteregger", 21, "Austria", "Defender", 8, 260, "Aggressive defender"),
                        new Player("Filip Kostić", 11, "Serbia", "Winger", 30, 340, "Creative winger and crosser"),
                        new Player("Jesper Lindstrøm", 20, "Denmark", "Midfielder", 18, 100, "Energetic attacker"),
                        new Player("Rafael Santos Borré", 19, "Colombia", "Forward", 25, 160, "Striker with intelligent runs"),
                        new Player("Jesús Vallejo", 3, "Spain", "Defender", 4, 120, "Reliable defender"),
                        new Player("Dominik Kohr", 6, "Germany", "Midfielder", 5, 180, "Defensive midfielder"),
                        new Player("Mario Götze", 27, "Germany", "Midfielder", 45, 500, "Creative veteran midfielder"),
                        new Player("Ansgar Knauff", 24, "Germany", "Winger", 7, 60, "Young winger with promise")
                };
            case "wolfsburg":
                return new Player[]{
                        new Player("Koen Casteels", 1, "Belgium", "Goalkeeper", 0, 240, "Tall reliable keeper"),
                        new Player("Maxence Lacroix", 2, "France", "Defender", 5, 120, "Strong center-back"),
                        new Player("John Brooks", 5, "USA", "Defender", 3, 200, "Experienced back"),
                        new Player("Xaver Schlager", 6, "Austria", "Midfielder", 8, 150, "Energetic midfielder"),
                        new Player("Wout Weghorst", 9, "Netherlands", "Striker", 40, 220, "Target man with aerial threat"),
                        new Player("Maximilian Arnold", 8, "Germany", "Midfielder", 25, 300, "Creative midfielder and leader"),
                        new Player("Jeremiah St. Juste", 4, "Netherlands", "Defender", 2, 80, "Solid defender"),
                        new Player("Matthias Ginter", 28, "Germany", "Defender", 6, 260, "Experienced center-back"),
                        new Player("Paulo Otávio", 3, "Brazil", "Defender", 1, 110, "Left-back with attacking runs"),
                        new Player("Bartosz Białek", 11, "Poland", "Forward", 10, 60, "Young striker with potential")
                };
            case "gladbach":
            case "borussia monchengladbach":
                return new Player[]{
                        new Player("Yann Sommer", 1, "Switzerland", "Goalkeeper", 0, 240, "Top-level keeper with great reflexes"),
                        new Player("Matthias Ginter", 4, "Germany", "Defender", 6, 260, "Versatile center-back"),
                        new Player("Denis Zakaria", 8, "Switzerland", "Midfielder", 10, 200, "Powerful midfielder"),
                        new Player("Alassane Pléa", 14, "France", "Forward", 35, 220, "Experienced striker"),
                        new Player("Marcus Thuram", 19, "France", "Forward", 45, 200, "Strong forward with great technique"),
                        new Player("Florian Neuhaus", 10, "Germany", "Midfielder", 12, 180, "Creative midfielder"),
                        new Player("Ramsey", 7, "Belgium", "Winger", 5, 80, "Pacey wide player"),
                        new Player("László Bénes", 20, "Slovakia", "Midfielder", 4, 140, "Box-to-box midfielder"),
                        new Player("Gianluca Florian", 2, "Germany", "Defender", 1, 60, "Young defender"),
                        new Player("Ko Itakura", 5, "Japan", "Defender", 2, 100, "Ball-playing defender")
                };
            case "stuttgart":
                return new Player[]{
                        new Player("Waldemar Anton", 2, "Germany", "Defender", 4, 200, "Leader in defense"),
                        new Player("Nicolas Gonzalez", 11, "Argentina", "Winger", 25, 160, "Skillful winger with goals"),
                        new Player("Sasa Kalajdzic", 9, "Austria", "Striker", 20, 120, "Tall striker with aerial ability"),
                        new Player("Tiago Tomas", 7, "Portugal", "Winger", 8, 60, "Young attacking talent"),
                        new Player("Atakan Karazor", 6, "Germany", "Midfielder", 3, 80, "Midfield enforcer"),
                        new Player("Philipp Förster", 8, "Germany", "Midfielder", 5, 110, "Box-to-box midfielder"),
                        new Player("Wataru Endo", 4, "Japan", "Midfielder", 10, 240, "Tactical defensive midfielder"),
                        new Player("Pascal Stenzel", 15, "Germany", "Defender", 2, 130, "Full-back with stamina"),
                        new Player("Roberto Massimo", 10, "Germany", "Winger", 7, 70, "Pacey attacker"),
                        new Player("Gregor Kobel", 1, "Switzerland", "Goalkeeper", 0, 90, "Reliable keeper")
                };
            case "hoffenheim":
                return new Player[]{
                        new Player("Oliver Baumann", 1, "Germany", "Goalkeeper", 0, 320, "Experienced goalkeeper"),
                        new Player("Kevin Vogt", 5, "Germany", "Defender", 6, 300, "Reliable center-back"),
                        new Player("Ihlas Bebou", 11, "Togo", "Winger", 18, 200, "Direct winger with pace"),
                        new Player("Andrej Kramarić", 27, "Croatia", "Forward", 85, 420, "Prolific forward and captain"),
                        new Player("Geoffrey Kondogbia", 6, "France", "Midfielder", 8, 100, "Strong midfielder"),
                        new Player("Robert Skov", 7, "Denmark", "Winger", 22, 160, "Creative winger with goals"),
                        new Player("Chris Richards", 3, "USA", "Defender", 2, 60, "Young center-back"),
                        new Player("Diadie Samassékou", 8, "Mali", "Midfielder", 4, 140, "Ball-winning midfielder"),
                        new Player("Ermin Bičakčić", 4, "Bosnia", "Defender", 3, 200, "Experienced center-back"),
                        new Player("Jacob Bruun Larsen", 10, "Denmark", "Winger", 10, 80, "Quick wide attacker")
                };
            case "freiburg":
                return new Player[]{
                        new Player("Mark Flekken", 1, "Netherlands", "Goalkeeper", 0, 90, "Reliable goalkeeper"),
                        new Player("Nico Schlotterbeck", 4, "Germany", "Defender", 5, 120, "Young ball-playing center-back"),
                        new Player("Christian Günter", 3, "Germany", "Defender", 6, 330, "Consistent left-back"),
                        new Player("Roland Sallai", 11, "Hungary", "Winger", 18, 140, "Attacking winger with goals"),
                        new Player("Michael Gregoritsch", 9, "Austria", "Striker", 25, 160, "Target man with finishing"),
                        new Player("Vincenzo Grifo", 10, "Germany", "Midfielder", 45, 300, "Set-piece specialist and creator"),
                        new Player("Lukas Kübler", 2, "Germany", "Defender", 2, 200, "Full-back with defensive discipline"),
                        new Player("Keven Schlotterbeck", 5, "Germany", "Defender", 3, 150, "Tough center-back"),
                        new Player("Yannick Reine-Adélaïde", 8, "France", "Midfielder", 4, 80, "Box-to-box midfielder"),
                        new Player("Christian Streich", 99, "Germany", "Coach", 0, 0, "Legendary coach (placeholder entry)")
                };
            default:
                // generic fallback
                return new Player[]{
                        new Player("Player 1", 1, "Country", "Goalkeeper", 0, 50, "Key player for " + club),
                        new Player("Player 2", 2, "Country", "Defender", 2, 60, "Key player for " + club),
                        new Player("Player 3", 3, "Country", "Defender", 4, 70, "Key player for " + club),
                        new Player("Player 4", 4, "Country", "Midfielder", 5, 80, "Key player for " + club),
                        new Player("Player 5", 5, "Country", "Midfielder", 6, 90, "Key player for " + club),
                        new Player("Player 6", 6, "Country", "Midfielder", 7, 100, "Key player for " + club),
                        new Player("Player 7", 7, "Country", "Winger", 8, 110, "Key player for " + club),
                        new Player("Player 8", 8, "Country", "Winger", 9, 120, "Key player for " + club),
                        new Player("Player 9", 9, "Country", "Striker", 10, 130, "Key player for " + club),
                        new Player("Player 10", 10, "Country", "Striker", 11, 140, "Key player for " + club)
                };
        }
    }

    private Player[] createSerieAPlayers(String club) {
        if (club == null) club = "";
        switch (club.toLowerCase()) {
            case "milan":
            case "ac milan":
                return new Player[]{
                        new Player("Mike Maignan", 16, "France", "Goalkeeper", 0, 150, "Top-level goalkeeper for AC Milan"),
                        new Player("Theo Hernandez", 19, "France", "Defender", 10, 200, "Explosive left-back with attacking output"),
                        new Player("Fikayo Tomori", 23, "England", "Defender", 4, 120, "Pacey center-back good on the ball"),
                        new Player("Rafael Leão", 17, "Portugal", "Winger", 50, 210, "Creative forward with speed and dribbling"),
                        new Player("Olivier Giroud", 9, "France", "Striker", 80, 600, "Experienced target man and finisher"),
                        new Player("Sandro Tonali", 8, "Italy", "Midfielder", 12, 140, "Central midfielder with great vision"),
                        new Player("Ismaël Bennacer", 4, "Algeria", "Midfielder", 8, 180, "Dynamic midfielder with tackling"),
                        new Player("Davide Calabria", 2, "Italy", "Defender", 3, 260, "Right-back with consistency"),
                        new Player("Franck Kessié", 79, "Ivory Coast", "Midfielder", 20, 300, "Powerful box-to-box midfielder"),
                        new Player("Brahim Díaz", 21, "Spain", "Midfielder", 15, 100, "Attacking midfielder with flair")
                };
            case "juventus":
                return new Player[]{
                        new Player("Wojciech Szczęsny", 1, "Poland", "Goalkeeper", 0, 240, "Reliable keeper with big-match experience"),
                        new Player("Leonardo Bonucci", 19, "Italy", "Defender", 12, 500, "Veteran center-back and leader"),
                        new Player("Danilo", 6, "Brazil", "Defender", 8, 280, "Versatile defender right/center"),
                        new Player("Federico Chiesa", 22, "Italy", "Winger", 35, 180, "Dynamic wide attacker with directness"),
                        new Player("Dusan Vlahović", 9, "Serbia", "Striker", 45, 120, "Clinical striker with strong presence"),
                        new Player("Adrien Rabiot", 25, "France", "Midfielder", 10, 220, "Box-to-box midfielder with strength"),
                        new Player("Paulo Dybala", 10, "Argentina", "Forward", 90, 450, "Creative forward with technique"),
                        new Player("Filip Kostić", 11, "Serbia", "Winger", 18, 100, "Crossing specialist on the wing"),
                        new Player("Federico Bernardeschi", 20, "Italy", "Winger", 10, 250, "Versatile attacker"),
                        new Player("Nicolo Fagioli", 8, "Italy", "Midfielder", 6, 60, "Young central midfielder")
                };
            case "napoli":
                return new Player[]{
                        new Player("Alex Meret", 1, "Italy", "Goalkeeper", 0, 120, "Agile keeper with good reflexes"),
                        new Player("Giovanni Di Lorenzo", 22, "Italy", "Defender", 6, 260, "Dependable right-back and captain"),
                        new Player("Kalidou Koulibaly", 26, "Senegal", "Defender", 20, 380, "Strong center-back with leadership"),
                        new Player("Kim Min-jae", 6, "South Korea", "Defender", 5, 120, "Physical center-back with pace"),
                        new Player("Victor Osimhen", 9, "Nigeria", "Striker", 80, 120, "Powerful striker with finishing"),
                        new Player("Piotr Zieliński", 20, "Poland", "Midfielder", 35, 300, "Creative midfielder with technique"),
                        new Player("Lorenzo Insigne", 24, "Italy", "Winger", 60, 400, "Creative left winger (veteran)"),
                        new Player("Dries Mertens", 14, "Belgium", "Forward", 120, 600, "Experienced finisher"),
                        new Player("Stanislav Lobotka", 68, "Slovakia", "Midfielder", 8, 200, "Deep-lying playmaker"),
                        new Player("Hirving Lozano", 11, "Mexico", "Winger", 25, 180, "Direct winger with pace")
                };
            case "roma":
                return new Player[]{
                        new Player("Rui Patrício", 1, "Portugal", "Goalkeeper", 0, 200, "Experienced keeper with leadership"),
                        new Player("Gianluca Mancini", 23, "Italy", "Defender", 8, 150, "Strong center-back"),
                        new Player("Chris Smalling", 12, "England", "Defender", 10, 300, "Physical center-back"),
                        new Player("Lorenzo Pellegrini", 7, "Italy", "Midfielder", 35, 260, "Creative captain and midfielder"),
                        new Player("Nicolo Zaniolo", 22, "Italy", "Winger", 20, 120, "Dynamic forward with technique"),
                        new Player("Henrikh Mkhitaryan", 22, "Armenia", "Midfielder", 70, 400, "Experienced playmaker"),
                        new Player("Paulo Dybala", 21, "Argentina", "Forward", 90, 450, "Creative forward"),
                        new Player("Tammy Abraham", 9, "England", "Striker", 40, 140, "Strong striker with eye for goal"),
                        new Player("Matías Viña", 3, "Uruguay", "Defender", 2, 90, "Full-back with attacking runs"),
                        new Player("Stephan El Shaarawy", 92, "Italy", "Winger", 25, 300, "Skilful winger")
                };
            case "lazio":
                return new Player[]{
                        new Player("Pietro Strakosha", 1, "Albania", "Goalkeeper", 0, 180, "Experienced goalkeeper"),
                        new Player("Sergej Milinković-Savić", 21, "Serbia", "Midfielder", 40, 300, "Powerful box-to-box midfielder"),
                        new Player("Ciro Immobile", 17, "Italy", "Striker", 180, 400, "Prolific striker and captain"),
                        new Player("Luis Alberto", 10, "Spain", "Midfielder", 50, 350, "Creative attacking midfielder"),
                        new Player("Francesco Acerbi", 15, "Italy", "Defender", 20, 400, "Veteran defender with positioning"),
                        new Player("Stefan Radu", 3, "Romania", "Defender", 4, 500, "Long-serving defender"),
                        new Player("Manuel Lazzari", 29, "Italy", "Defender", 6, 220, "Pacey full-back"),
                        new Player("Felipe Anderson", 7, "Brazil", "Winger", 35, 300, "Skillful winger with direct runs"),
                        new Player("Jordan Lukaku", 40, "Belgium", "Defender", 2, 120, "Full-back with stamina"),
                        new Player("Milan Badelj", 4, "Croatia", "Midfielder", 3, 200, "Experienced central midfielder")
                };
            case "atalanta":
                return new Player[]{
                        new Player("Marco Sportiello", 1, "Italy", "Goalkeeper", 0, 140, "Reliable keeper"),
                        new Player("Giorgio Scalvini", 14, "Italy", "Defender", 3, 80, "Young center-back with potential"),
                        new Player("Teun Koopmeiners", 30, "Netherlands", "Midfielder", 30, 200, "Box-to-box midfielder and set-piece taker"),
                        new Player("Davide Zappacosta", 21, "Italy", "Defender", 4, 180, "Versatile full-back"),
                        new Player("Duvan Zapata", 91, "Colombia", "Striker", 70, 300, "Powerful striker with finishing"),
                        new Player("Luis Muriel", 9, "Colombia", "Forward", 45, 220, "Pacey forward with trickery"),
                        new Player("Ruslan Malinovskyi", 18, "Ukraine", "Midfielder", 20, 150, "Attacking midfielder with shooting"),
                        new Player("Robin Gosens", 8, "Germany", "Defender", 10, 200, "Attacking wing-back"),
                        new Player("Teemu Pukki", 7, "Finland", "Forward", 20, 300, "Experienced striker"),
                        new Player("Martín Satriano", 11, "Uruguay", "Striker", 8, 40, "Young forward with potential")
                };
            case "fiorentina":
                return new Player[]{
                        new Player("Bartłomiej Drągowski", 1, "Poland", "Goalkeeper", 0, 120, "Solid keeper"),
                        new Player("Nicolò González", 22, "Argentina", "Winger", 18, 140, "Quick winger with goals"),
                        new Player("German Pezzella", 4, "Argentina", "Defender", 6, 220, "Experienced center-back"),
                        new Player("Dusan Vlahović", 9, "Serbia", "Striker", 40, 180, "Powerful striker"),
                        new Player("Giovanni Simeone", 18, "Argentina", "Striker", 30, 200, "Aggressive forward"),
                        new Player("Lucas Torreira", 11, "Uruguay", "Midfielder", 5, 240, "Tough defensive midfielder"),
                        new Player("Arthur", 5, "Brazil", "Midfielder", 3, 80, "Creative central midfielder"),
                        new Player("Lucas Beltrán", 19, "Argentina", "Striker", 6, 60, "Young forward with promise"),
                        new Player("Cristiano Biraghi", 3, "Italy", "Defender", 5, 260, "Attacking full-back"),
                        new Player("Gaetano Castrovilli", 8, "Italy", "Midfielder", 10, 150, "Creative midfielder")
                };
            case "bologna":
                return new Player[]{
                        new Player("Lukasz Skorupski", 28, "Poland", "Goalkeeper", 0, 220, "Experience between the sticks"),
                        new Player("Gary Medel", 17, "Chile", "Defender", 3, 400, "Tough defensive presence"),
                        new Player("Riccardo Orsolini", 7, "Italy", "Winger", 25, 220, "Attacking winger with goals"),
                        new Player("Rodrigo Palacio", 10, "Argentina", "Forward", 50, 700, "Veteran forward"),
                        new Player("Marko Arnautović", 11, "Austria", "Forward", 35, 300, "Strong striker with technique"),
                        new Player("Aaron Hickey", 2, "Scotland", "Defender", 4, 80, "Young full-back with potential"),
                        new Player("Adam Masina", 3, "Morocco", "Defender", 2, 180, "Reliable left-back"),
                        new Player("Nicolò Fagioli", 8, "Italy", "Midfielder", 6, 60, "Promising central midfielder"),
                        new Player("Mattias Svanberg", 22, "Sweden", "Midfielder", 8, 140, "Energetic midfielder"),
                        new Player("Arthur Theate", 4, "Belgium", "Defender", 1, 50, "Young solid center-back")
                };
            case "torino":
                return new Player[]{
                        new Player("Vanja Milinković-Savić", 33, "Serbia", "Goalkeeper", 0, 140, "Tall keeper with reach"),
                        new Player("Gleison Bremer", 3, "Brazil", "Defender", 10, 200, "Strong center-back"),
                        new Player("Riccardo Calafiori", 19, "Italy", "Defender", 2, 60, "Young left-back"),
                        new Player("Andrea Belotti", 9, "Italy", "Striker", 80, 300, "Experienced forward and leader"),
                        new Player("Sasa Lukic", 8, "Serbia", "Midfielder", 12, 280, "Energetic central midfielder"),
                        new Player("Tomás Rincón", 5, "Venezuela", "Midfielder", 3, 300, "Defensive midfielder"),
                        new Player("Simone Zaza", 11, "Italy", "Striker", 40, 320, "Powerful striker"),
                        new Player("Arsène", 20, "France", "Winger", 2, 10, "Young winger (placeholder)"),
                        new Player("Rolando Mandragora", 6, "Italy", "Midfielder", 5, 200, "Box-to-box midfield option"),
                        new Player("Kamil Glik", 4, "Poland", "Defender", 8, 360, "Veteran center-back")
                };
            default:
                return new Player[]{
                        new Player("Player 1", 1, "Country", "Goalkeeper", 0, 50, "Key player for " + club),
                        new Player("Player 2", 2, "Country", "Defender", 2, 60, "Key player for " + club),
                        new Player("Player 3", 3, "Country", "Defender", 4, 70, "Key player for " + club),
                        new Player("Player 4", 4, "Country", "Midfielder", 5, 80, "Key player for " + club),
                        new Player("Player 5", 5, "Country", "Midfielder", 6, 90, "Key player for " + club),
                        new Player("Player 6", 6, "Country", "Midfielder", 7, 100, "Key player for " + club),
                        new Player("Player 7", 7, "Country", "Winger", 8, 110, "Key player for " + club),
                        new Player("Player 8", 8, "Country", "Winger", 9, 120, "Key player for " + club),
                        new Player("Player 9", 9, "Country", "Striker", 10, 130, "Key player for " + club),
                        new Player("Player 10", 10, "Country", "Striker", 11, 140, "Key player for " + club)
                };
        }
    }

    private Player[] createLigue1Players(String club) {
        if (club == null) club = "";
        switch (club.toLowerCase()) {
            case "marseille":
                return new Player[]{
                        new Player("Steve Mandanda", 1, "France", "Goalkeeper", 0, 500, "Veteran goalkeeper and captain"),
                        new Player("William Saliba", 4, "France", "Defender", 6, 140, "Strong center-back on loan/return"),
                        new Player("Leonardo Balerdi", 3, "Argentina", "Defender", 3, 120, "Physical center-back"),
                        new Player("Mattéo Guendouzi", 6, "France", "Midfielder", 12, 200, "Energetic midfielder with aggression"),
                        new Player("Dimitri Payet", 10, "France", "Midfielder", 80, 450, "Creative playmaker with set-piece mastery"),
                        new Player("Gerson", 8, "Brazil", "Midfielder", 10, 160, "Box-to-box midfielder with skill"),
                        new Player("Arkadiusz Milik", 9, "Poland", "Striker", 50, 220, "Experienced striker with finishing"),
                        new Player("Cengiz Ünder", 7, "Turkey", "Winger", 20, 140, "Pacey winger with direct play"),
                        new Player("Pol Lirola", 15, "Spain", "Defender", 5, 180, "Attacking right-back"),
                        new Player("Pape Gueye", 29, "France", "Midfielder", 2, 90, "Defensive midfielder")
                };
            case "lyon":
                return new Player[]{
                        new Player("Anthony Lopes", 1, "Portugal", "Goalkeeper", 0, 300, "Steady keeper for Lyon"),
                        new Player("Thiago Mendes", 8, "Brazil", "Midfielder", 6, 200, "Experienced midfielder"),
                        new Player("Houssem Aouar", 10, "France", "Midfielder", 35, 240, "Creative attacking midfielder"),
                        new Player("Moussa Dembélé", 9, "France", "Striker", 60, 300, "Clinical striker with movement"),
                        new Player("Rayan Cherki", 18, "France", "Winger", 12, 80, "Young technical attacker"),
                        new Player("Castello Lukeba", 4, "France", "Defender", 3, 60, "Promising center-back"),
                        new Player("Jason Denayer", 5, "Belgium", "Defender", 8, 300, "Versatile defender"),
                        new Player("Maxence Caqueret", 6, "France", "Midfielder", 5, 140, "Energetic central midfielder"),
                        new Player("Karl Toko Ekambi", 11, "Cameroon", "Winger", 30, 240, "Pacey forward"),
                        new Player("Bruno Guimarães", 27, "Brazil", "Midfielder", 20, 200, "Creative and physical midfielder")
                };
            case "monaco":
                return new Player[]{
                        new Player("Alexander Nübel", 1, "Germany", "Goalkeeper", 0, 80, "Young keeper with potential"),
                        new Player("Aurelien Tchouaméni", 14, "France", "Midfielder", 10, 120, "Strong central midfielder"),
                        new Player("Wissam Ben Yedder", 9, "France", "Striker", 85, 320, "Clinical finisher and captain"),
                        new Player("Benoît Badiashile", 5, "France", "Defender", 6, 150, "Powerful center-back"),
                        new Player("Fofana", 8, "Mali", "Midfielder", 15, 150, "Dynamic midfielder with aggression"),
                        new Player("Gelson Martins", 11, "Portugal", "Winger", 10, 200, "Explosive wide player"),
                        new Player("Youssouf Fofana", 25, "France", "Midfielder", 8, 140, "Box-to-box midfielder"),
                        new Player("Caio Henrique", 22, "Brazil", "Defender", 4, 160, "Left-back with attacking traits"),
                        new Player("Kevin Volland", 27, "Germany", "Forward", 30, 220, "Experienced attacker"),
                        new Player("Ismail Jakobs", 18, "Germany", "Defender", 2, 60, "Versatile full-back")
                };
            case "lille":
                return new Player[]{
                        new Player("Mike Maignan", 16, "France", "Goalkeeper", 0, 160, "Top goalkeeper and leader"),
                        new Player("José Fonte", 3, "Portugal", "Defender", 6, 500, "Veteran center-back"),
                        new Player("Jonathan David", 9, "Canada", "Striker", 55, 200, "Prolific young striker"),
                        new Player("Renato Sanches", 8, "Portugal", "Midfielder", 20, 180, "Dynamic midfielder with drive"),
                        new Player("Boubakary Soumaré", 6, "France", "Midfielder", 5, 160, "Powerful central midfielder"),
                        new Player("Jonathan Ikoné", 11, "France", "Winger", 25, 220, "Pacey and technical winger"),
                        new Player("Yusuf Yazıcı", 10, "Turkey", "Midfielder", 15, 120, "Creative attacking midfielder"),
                        new Player("Sven Botman", 4, "Netherlands", "Defender", 5, 140, "Towering center-back"),
                        new Player("Zeki Çelik", 2, "Turkey", "Defender", 4, 190, "Attacking right-back"),
                        new Player("Edon Zhegrova", 7, "Kosovo", "Winger", 6, 80, "Young wide attacker")
                };
            case "rennes":
                return new Player[]{
                        new Player("Alban Lafont", 1, "France", "Goalkeeper", 0, 180, "Agile keeper"),
                        new Player("Malo Gusto", 2, "France", "Defender", 3, 70, "Young right-back with potential"),
                        new Player("Bruno Guimarães", 5, "Brazil", "Midfielder", 10, 140, "Energetic midfielder"),
                        new Player("Flavien Tait", 8, "France", "Midfielder", 8, 200, "Versatile attacking midfielder"),
                        new Player("Martin Terrier", 10, "France", "Forward", 22, 210, "Goal-scoring forward"),
                        new Player("Lovro Majer", 17, "Croatia", "Midfielder", 6, 80, "Creative attacking midfielder"),
                        new Player("Faitout Maouassa", 3, "France", "Defender", 1, 120, "Left-back with running ability"),
                        new Player("Hamari Traoré", 14, "Mali", "Defender", 4, 260, "Reliable full-back"),
                        new Player("Jonathan David", 9, "Canada", "Striker", 55, 200, "Prolific striker (note: historical)"),
                        new Player("Serhou Guirassy", 19, "Guinea", "Striker", 30, 140, "Powerful forward")
                };
            case "nice":
                return new Player[]{
                        new Player("Marin Ljubičić", 1, "Croatia", "Goalkeeper", 0, 80, "Capable keeper"),
                        new Player("Hicham Boudaoui", 8, "Algeria", "Midfielder", 6, 120, "Energetic midfielder"),
                        new Player("Khephren Thuram", 12, "France", "Midfielder", 8, 100, "Box-to-box midfielder"),
                        new Player("Amine Gouiri", 9, "France", "Striker", 25, 140, "Technical striker"),
                        new Player("Terem Moffi", 11, "Nigeria", "Striker", 20, 90, "Powerful and quick forward"),
                        new Player("Jean-Clair Todibo", 5, "France", "Defender", 3, 110, "Strong center-back"),
                        new Player("Youcef Atal", 2, "Algeria", "Defender", 4, 160, "Attacking full-back"),
                        new Player("Morgan Sanson", 6, "France", "Midfielder", 10, 220, "Experienced midfielder"),
                        new Player("Fabrice Olinga", 7, "Cameroon", "Forward", 5, 70, "Young attacking talent"),
                        new Player("Jordan Lotomba", 3, "Switzerland", "Defender", 2, 120, "Full-back with speed")
                };
            case "lens":
                return new Player[]{
                        new Player("Brice Samba", 1, "DR Congo", "Goalkeeper", 0, 120, "Reliable shot-stopper"),
                        new Player("Seko Fofana", 28, "Ivory Coast", "Midfielder", 20, 220, "Dynamic and powerful midfielder"),
                        new Player("Przemysław Frankowski", 11, "Poland", "Winger", 18, 200, "Pacey winger with crossing"),
                        new Player("Wesley Said", 9, "France", "Forward", 22, 180, "Direct attacker"),
                        new Player("Jonathan Clauss", 2, "France", "Defender", 3, 270, "Energetic right-back"),
                        new Player("Gaël Kakuta", 10, "DR Congo", "Midfielder", 12, 300, "Creative playmaker"),
                        new Player("Loïc Badé", 5, "France", "Defender", 4, 100, "Strong center-back"),
                        new Player("Przemysław Frankowski", 11, "Poland", "Winger", 18, 200, "Repeated entry (intentional placeholder)"),
                        new Player("Ignatius Ganago", 7, "Cameroon", "Forward", 6, 80, "Pacey forward"),
                        new Player("Massadio Haïdara", 3, "Mali", "Defender", 1, 150, "Left-back with experience")
                };
            case "reims":
                return new Player[]{
                        new Player("Moussa Doumbia", 1, "Mali", "Goalkeeper", 0, 100, "Reliable keeper"),
                        new Player("Yvan Neyou", 6, "Cameroon", "Midfielder", 2, 80, "Defensive midfielder"),
                        new Player("Boulaye Dia", 9, "Senegal", "Striker", 25, 140, "Strong striker with good runs"),
                        new Player("Florian Miguel", 3, "France", "Defender", 1, 80, "Steady full-back"),
                        new Player("Ghislain Konan", 2, "Ivory Coast", "Defender", 3, 120, "Left-back with stamina"),
                        new Player("Djeidi Gassama", 18, "France", "Winger", 4, 50, "Young attacking talent"),
                        new Player("Pengwin N'Goumou", 21, "France", "Midfielder", 5, 70, "Promising midfield player"),
                        new Player("Marshall Munetsi", 24, "Zimbabwe", "Midfielder", 6, 110, "Physical midfielder"),
                        new Player("Dante", 55, "Brazil", "Defender", 10, 700, "Veteran center-back (placeholder)"),
                        new Player("Sada Thioub", 11, "Senegal", "Forward", 7, 90, "Wide attacker")
                };
            case "montpellier":
                return new Player[]{
                        new Player("Geronimo Rulli", 1, "Argentina", "Goalkeeper", 0, 120, "Experienced keeper"),
                        new Player("Stephy Mavididi", 9, "England", "Forward", 20, 140, "Direct and quick forward"),
                        new Player("Andy Delort", 11, "Algeria", "Striker", 50, 300, "Strong striker with aerial ability"),
                        new Player("Teji Savanier", 10, "France", "Midfielder", 30, 260, "Creative set-piece specialist"),
                        new Player("Vitorino Hilton", 3, "France", "Defender", 5, 700, "Veteran center-back (placeholder)"),
                        new Player("Pedro Mendes", 8, "Portugal", "Midfielder", 6, 90, "Box-to-box midfielder"),
                        new Player("Nicolas Cozza", 4, "France", "Defender", 2, 120, "Reliable center-back"),
                        new Player("Souleymane Camara", 7, "Senegal", "Winger", 10, 300, "Experienced winger"),
                        new Player("Romain Pitau", 5, "France", "Midfielder", 1, 100, "Defensive midfielder (coach/placeholder)"),
                        new Player("Keagan Dolly", 17, "South Africa", "Winger", 8, 140, "Attacking wide player")
                };
            default:
                return new Player[]{
                        new Player("Player 1", 1, "Country", "Goalkeeper", 0, 50, "Key player for " + club),
                        new Player("Player 2", 2, "Country", "Defender", 2, 60, "Key player for " + club),
                        new Player("Player 3", 3, "Country", "Defender", 4, 70, "Key player for " + club),
                        new Player("Player 4", 4, "Country", "Midfielder", 5, 80, "Key player for " + club),
                        new Player("Player 5", 5, "Country", "Midfielder", 6, 90, "Key player for " + club),
                        new Player("Player 6", 6, "Country", "Midfielder", 7, 100, "Key player for " + club),
                        new Player("Player 7", 7, "Country", "Winger", 8, 110, "Key player for " + club),
                        new Player("Player 8", 8, "Country", "Winger", 9, 120, "Key player for " + club),
                        new Player("Player 9", 9, "Country", "Striker", 10, 130, "Key player for " + club),
                        new Player("Player 10", 10, "Country", "Striker", 11, 140, "Key player for " + club)
                };
        }
    }
}

