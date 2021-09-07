package StenSaxPase;

import java.util.Scanner;

public class WriteMenu {

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

    public static void matchChoiceMenu(){
        System.out.println("Vad väljer du?\n1. Sten\t2. Sax\t3. Påse");
        System.out.print("User Input: ");
        Player.playerChoice();
        Computer.setComputerChoice();
        Player.setMatchResults(GameLogic.matchExecute(Player.getPlayerChoice(),Computer.getComputerChoice()));
        afterMatchMenu();
    }

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
