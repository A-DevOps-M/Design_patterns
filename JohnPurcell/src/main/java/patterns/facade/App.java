package patterns.facade;

public class App {

    public static void main(String[] args) {

        // Facade Pattern toepassen
        Game game = new Game();

        // Game Loop
        while (true) {
            game.update();
        }
    }
}
