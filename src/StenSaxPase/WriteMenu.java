package StenSaxPase;

/**
 * Innehåller alla menyer som presenteras för användaren
 */
public class WriteMenu {
    /**
     * Huvud menyn, efterfrågar vad spelaren vill göra sedan utför det som valts
     */
    public static void mainMenu(){
        System.out.println("1. Ny Match\t2. Historik\t3. Avsluta Spelet");
        System.out.print("User Input: ");
        Player.playerChoice();
        switch(Player.getPlayerChoice()){
            case 1:
                matchChoiceMenu();
                break;
            case 2:
                Player.printHistory();
                mainMenu();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("mainMenu broke somehow");
        }

    }

    /**
     * Efterfrågar spelarens val, sedan räknar ut Datorns val och skriver ut vinnaren.
     * Sparar resultatet i spelarens historik sedan påbörjar "afterMatchMenu" metoden.
     */
    public static void matchChoiceMenu(){
        System.out.println("Vad väljer du?\n1. Sten\t2. Sax\t3. Påse");
        System.out.print("User Input: ");
        Player.playerChoice();
        Computer.setComputerChoice();
        // simplifierad för läsbarhet
        int spelarVal = Player.getPlayerChoice();
        int datorVal = Computer.getComputerChoice();
        String matchResultat;

        matchResultat = GameLogic.matchExecute(spelarVal,datorVal);
        Player.setMatchResults(matchResultat);
        afterMatchMenu();
    }

    /**
     * Menyn efter en match har spelats.
     * Efterfrågar vad spelaren vill göra, sedan utför det som spelaren angivit
     */
    public static void afterMatchMenu(){
        System.out.println("1. Meny\t2. Kör igen\t3. Avsluta Spelet");
        System.out.print("User Input: ");
        Player.playerChoice();
        switch(Player.getPlayerChoice()){
            case 1:
                mainMenu();
                break;
            case 2:
                matchChoiceMenu();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("afterMatchMenu broke somehow");
        }
    }
}
