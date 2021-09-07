package StenSaxPase;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    private static ArrayList<String>matchResults= new ArrayList<>();
    private static int playerChoice;
    private static long indexCounter=0;

    public static void playerChoice() {
        Scanner scan = new Scanner(System.in);
        String pChoice = scan.nextLine();
        while (!(pChoice.equals("1") || pChoice.equals("2") || pChoice.equals("3"))) {
            System.out.print("Endast siffror som motsvarar menyvalen tack!\nUser Input:");
            pChoice = scan.nextLine();
        }
        Player.playerChoice = Integer.valueOf(pChoice);
    }

    public static int getPlayerChoice() {
        return playerChoice;
    }

    public static void printHistory(){
        if(indexCounter>0){
            System.out.println("\nSkriver ut historik:");
            for(int i =0;i<indexCounter;i++){
                System.out.println(matchResults.get(i));
            }
            System.out.println("");
        }else{
            System.out.println("Historik är tom");
        }
    }

    public static void setMatchResults(String matchResult) {
        matchResults.add((int) indexCounter, matchResult);
        indexCounter++;
    }
}
