package StenSaxPase;

public class Computer {
    private static int computerChoice;
    /**
     * genererar ett splumpat vörde som förvaras i form av heltal i klassen Computer
     */
    public static void setComputerChoice() {
        Computer.computerChoice = (int)(Math.random()*3)+1;
    }

    /**
     * returnerar det värde som förvaras i computerChoice
     * @return returnerar förvarad dator val
     */
    public static int getComputerChoice() {
        return computerChoice;
    }
}
