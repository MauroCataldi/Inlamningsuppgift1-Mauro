package StenSaxPase;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    private static ArrayList<String>matchResults= new ArrayList<>();//spelarens historik
    private static int playerChoice, indexCounter=0;

    /**
     * efterfrågar val 1-3 i en loop tills det får det den vill ha
     * då sparas det i spelarens val "playerChoice"
     */
    public static void playerChoice() {
        Scanner scan = new Scanner(System.in);
        String pChoice = scan.nextLine();
        while (!(pChoice.equals("1") || pChoice.equals("2") || pChoice.equals("3"))) {
            System.out.print("Endast siffror som motsvarar menyvalen tack!\nUser Input:");
            pChoice = scan.nextLine();
        }
        Player.playerChoice = Integer.parseInt(pChoice);
    }

    /**
     *
     * @return returnerar spelarens val
     */
    public static int getPlayerChoice() {
        return playerChoice;
    }

    /**
     * skriver ut match historiken om det finns någon lagrad
     * annars skrivs det ut att det inte finns någon
     */
    public static void printHistory(){
        if(indexCounter>0){
            System.out.println("\nSkriver ut historik:");
            for(int i =0;i<indexCounter;i++){
                System.out.println(matchResults.get(i));
            }
            System.out.println(" ");
        }else{
            System.out.println("Historik är tom");
        }
    }

    /**
     * Sparar matchens resultat i "matchResults" och ökar index räknaren.
     * OBS! Om användaren spelar mer matcher än Integer variabeln tillåter kommer spelet inte fungera
     * @param matchResult tar emot resultatet som vill sparas av matchen i form av String
     */
    public static void setMatchResults(String matchResult) {
        matchResults.add(indexCounter, matchResult);
        indexCounter++;
    }
}
