package StenSaxPase;


/**
 * @author MauroCataldi
 * innehåller main metoden som startar programmet
 */
public class LaunchGame {
    /**
     * Kallar på mainMenu metoden hos WriteMenu klassen och startar på detta vis spelet
     */
    public static void main(String[] args) {
        WriteMenu writeMenu = new WriteMenu();
        writeMenu.mainMenu();
    }
}
