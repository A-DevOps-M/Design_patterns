package patterns.facade;

/**
 * Facade class!!
 */
public class Game {

    InputSystem input = new InputSystem();
    GameObjects object = new GameObjects();
    GameConsole screen = new GameConsole();

    public void update(){
        // Input
        input.getInput();

        // Update game objects (player, bad guys, etc)
        object.update(input);

        // Draw
        screen.draw(object);
        screen.clearScreen();
    }
}
