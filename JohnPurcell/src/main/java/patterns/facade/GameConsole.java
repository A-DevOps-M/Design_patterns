package patterns.facade;

/**
 * Dummy Implementation
 */
public class GameConsole {

    public void clearScreen(){
        System.out.println("Clearing screen ...");
    }

    public void draw(GameObjects objects){
        System.out.println("Drawing ...");
    }
}
