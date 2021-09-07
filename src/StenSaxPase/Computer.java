package StenSaxPase;

public class Computer {
    private static int computerChoice;

    public static void setComputerChoice() {
        Computer.computerChoice = (int)(Math.random()*3)+1;
    }

    public static int getComputerChoice() {
        return computerChoice;
    }
}
