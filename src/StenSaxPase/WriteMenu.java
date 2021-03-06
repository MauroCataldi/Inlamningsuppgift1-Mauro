package StenSaxPase;

/**
 * @author MauroCataldi
 * Innehåller alla menyer som presenteras för användaren
 */
public class WriteMenu {
    //initierar objekt av spelare samt dator
    public Computer computerPlayer = new Computer();
    public Player playerOne = new Player();
    // Loop som används för att avsluta program när det blir false
    private static boolean mainMenuLoop = true;

    /**
     * Huvud menyn, efterfrågar vad spelaren vill göra sedan utför det som valts
     */
    public void mainMenu() {
        while(mainMenuLoop) {
            System.out.println("1. Ny Match\t2. Historik\t3. Avsluta Spelet");
            System.out.print("User Input: ");
            playerOne.playerChoice();
            switch (playerOne.getPlayerChoice()) {
                case 1:
                    matchChoiceMenu();
                    break;
                case 2:
                    playerOne.printHistory();
                    break;
                case 3:
                    mainMenuLoop = false;
                    break;
                default:
                    System.out.println("mainMenu broke somehow");
            }
        }
    }

    /**
     * Efterfrågar spelarens val, sedan räknar ut Datorns val och skriver ut vinnaren.
     * Sparar resultatet i spelarens historik sedan påbörjar "afterMatchMenu" metoden.
     */
    public void matchChoiceMenu() {
        System.out.println("Vad väljer du?\n1. Sten\t2. Sax\t3. Påse");
        System.out.print("User Input: ");
        playerOne.playerChoice();
        computerPlayer.setComputerChoice();
        // simplifierad för läsbarhet
        int spelarVal = playerOne.getPlayerChoice();
        int datorVal = computerPlayer.getComputerChoice();
        String matchResultat;

        matchResultat = GameLogic.matchExecute(spelarVal, datorVal);
        playerOne.setMatchResults(matchResultat);
        afterMatchMenu();
    }

    /**
     * Menyn efter en match har spelats.
     * Efterfrågar vad spelaren vill göra, sedan utför det som spelaren angivit
     */
    public void afterMatchMenu() {
        System.out.println("1. Meny\t2. Kör igen\t3. Avsluta Spelet");
        System.out.print("User Input: ");
        playerOne.playerChoice();
        switch (playerOne.getPlayerChoice()) {
            case 1:
                mainMenu();
                break;
            case 2:
                matchChoiceMenu();
                break;
            case 3:
                mainMenuLoop = false;
                break;
            default:
                System.out.println("afterMatchMenu broke somehow");
        }
    }
}
