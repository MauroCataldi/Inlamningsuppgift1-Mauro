package StenSaxPase;

/**
 * Innehåller ett värde som representerar datorns val
 * Kan Slumpa fram ett nytt värde och skicka tillbaka det om det efterfrågas
 */
public class Computer {
    private int computerChoice;

    /**
     * genererar ett splumpat vörde som förvaras i form av heltal i klassen Computer
     */
    public void setComputerChoice() {
        this.computerChoice = (int)(Math.random()*3)+1;
    }

    /**
     * returnerar det värde som förvaras i computerChoice
     * @return returnerar förvarad dator val
     */
    public int getComputerChoice() {
        return computerChoice;
    }
}
