package StenSaxPase;

/**
 * Skriver ut spelaren och datorns val, sedan skriver ut vinnaren efter att valen jämförs.
 */
public class GameLogic {
    /**
     * en metod som både skriver ut vad spelarna i matchen valde samt skriver ut resultaten och skickar det tillbaka
     * till där metoden kallades från för att sparas i spelarens historik
     * @param playerChoice Integer valet sparat i spelar(Player) klassen skickas hit
     * @param computerChoice Integer valet sparat i dator(Computer) klassen skickas hit
     * @return String är returnerad med medelandet av matchens resultat
     */
    public static String matchExecute(int playerChoice, int computerChoice) {
        String svar;
        System.out.println("Spelaren valde: " + choiceInterpret(playerChoice) +
                "\tDatorn valde: " + choiceInterpret(computerChoice));
        svar = choiceCompare(playerChoice,computerChoice);
        System.out.println(svar);
        return svar;
    }
    /**
     * Exempel = 1:sten 2:sax 3:påse
     * @param x tolkar den int det får till vad det ska representera och skickar det tillbaka som en string
     */
    private static String choiceInterpret(int x) {
        switch (x) {
            case 1:
                return "Sten";
            case 2:
                return "Sax";
            case 3:
                return "Påse";
            default:
                return "choice interpret broke";
        }
    }
    /**
     * Jämför spelaren samt datorns val som skickas in sedan returnerar resultatet i form av en string
     * @return resultatet av spelaren/datorns val
     * @param spelarVal integer som spelaren valde
     * @param datorVal integer som datorn valde
     */
    private static String choiceCompare(int spelarVal, int datorVal){
        if(spelarVal==datorVal){
            return "Det blev lika!";
        }else if(spelarVal+1==datorVal || spelarVal-2==datorVal){
            return "Spelaren vann!";
        }else{
            return "Datorn vann!";
        }
    }
}
