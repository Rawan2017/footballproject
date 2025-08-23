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

    private Player[] createLaLigaPlayers(String club) {
        return new Player[]{
                new Player("Star Player 1", 1, "Spain", "Forward", 20, 100, "Key player for " + club),
                new Player("Star Player 2", 2, "Spain", "Midfielder", 15, 120, "Creative force for " + club),
                new Player("Star Player 3", 3, "Spain", "Defender", 5, 150, "Reliable defender for " + club),
                new Player("Star Player 4", 4, "Spain", "Goalkeeper", 0, 200, "Solid goalkeeper for " + club),
                new Player("Star Player 5", 5, "Spain", "Midfielder", 10, 80, "Energetic midfielder for " + club),
                new Player("Star Player 6", 6, "Spain", "Forward", 25, 90, "Prolific scorer for " + club),
                new Player("Star Player 7", 7, "Spain", "Defender", 3, 110, "Versatile defender for " + club),
                new Player("Star Player 8", 8, "Spain", "Midfielder", 12, 70, "Technical player for " + club),
                new Player("Star Player 9", 9, "Spain", "Forward", 18, 60, "Young talent for " + club),
                new Player("Star Player 10", 10, "Spain", "Midfielder", 8, 100, "Experienced player for " + club)
        };
    }

    private Player[] createBundesligaPlayers(String club) {
        return new Player[]{
                new Player("Key Player 1", 9, "Germany", "Forward", 25, 110, "Main attacker for " + club),
                new Player("Key Player 2", 7, "Germany", "Midfielder", 18, 120, "Creative midfielder for " + club),
                new Player("Key Player 3", 5, "Germany", "Defender", 6, 140, "Solid center-back for " + club),
                new Player("Key Player 4", 2, "Germany", "Goalkeeper", 0, 170, "Reliable goalkeeper for " + club),
                new Player("Key Player 5", 11, "Germany", "Winger", 20, 90, "Pacey winger for " + club),
                new Player("Key Player 6", 8, "Germany", "Midfielder", 12, 100, "Box-to-box presence for " + club),
                new Player("Key Player 7", 3, "Germany", "Defender", 4, 130, "Versatile defender for " + club),
                new Player("Key Player 8", 14, "Germany", "Forward", 22, 80, "Young forward for " + club),
                new Player("Key Player 9", 4, "Germany", "Defender", 7, 150, "Aerial threat for " + club),
                new Player("Key Player 10", 1, "Germany", "Goalkeeper", 0, 200, "Commanding goalkeeper for " + club)
        };
    }

    private Player[] createSerieAPlayers(String club) {
        return new Player[]{
                new Player("Italian Star 1", 10, "Italy", "Forward", 30, 120, "Key striker for " + club),
                new Player("Italian Star 2", 8, "Italy", "Midfielder", 18, 90, "Creative midfielder for " + club),
                new Player("Italian Star 3", 6, "Italy", "Defender", 5, 150, "Reliable defender for " + club),
                new Player("Italian Star 4", 1, "Italy", "Goalkeeper", 0, 180, "Experienced goalkeeper for " + club),
                new Player("Italian Star 5", 7, "Italy", "Winger", 20, 100, "Pacey winger for " + club),
                new Player("Italian Star 6", 4, "Italy", "Defender", 3, 130, "Ball-playing defender for " + club),
                new Player("Italian Star 7", 11, "Italy", "Forward", 22, 80, "Young forward for " + club),
                new Player("Italian Star 8", 5, "Italy", "Midfielder", 12, 110, "Box-to-box midfielder for " + club),
                new Player("Italian Star 9", 3, "Italy", "Defender", 2, 140, "Versatile back for " + club),
                new Player("Italian Star 10", 2, "Italy", "Midfielder", 9, 100, "Set-piece specialist for " + club)
        };
    }

    private Player[] createLigue1Players(String club) {
        return new Player[]{
                new Player("French Star 1", 9, "France", "Forward", 40, 140, "Main striker for " + club),
                new Player("French Star 2", 10, "France", "Midfielder", 15, 110, "Creative midfielder for " + club),
                new Player("French Star 3", 3, "France", "Defender", 6, 160, "Reliable defender for " + club),
                new Player("French Star 4", 1, "France", "Goalkeeper", 0, 170, "Commanding goalkeeper for " + club),
                new Player("French Star 5", 7, "France", "Winger", 25, 90, "Pacey winger for " + club),
                new Player("French Star 6", 6, "France", "Midfielder", 12, 100, "Box-to-box presence for " + club),
                new Player("French Star 7", 4, "France", "Defender", 4, 130, "Versatile defender for " + club),
                new Player("French Star 8", 11, "France", "Forward", 20, 80, "Young attacker for " + club),
                new Player("French Star 9", 5, "France", "Midfielder", 8, 95, "Energetic midfielder for " + club),
                new Player("French Star 10", 2, "France", "Defender", 3, 120, "Full-back with attacking intent for " + club)
        };
    }
}
