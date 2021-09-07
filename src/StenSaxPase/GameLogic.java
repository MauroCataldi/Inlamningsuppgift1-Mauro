package StenSaxPase;

public class GameLogic {
    public static String matchExecute(int playerChoice, int computerChoice) {
        String svar = "";
        System.out.println("Spelaren valde: " + choiceInterpret(playerChoice) +
                "\tDatorn valde: " + choiceInterpret(computerChoice));
        svar = choiceCompare(playerChoice,computerChoice);
        System.out.println(svar);
        return svar;
    }

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
