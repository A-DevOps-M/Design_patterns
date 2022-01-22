package patterns.implementing_observer;

import patterns.implementing_observer.controller.Controller;
import patterns.implementing_observer.model.Model;
import patterns.implementing_observer.view.View;

import javax.swing.*;

public class Application {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> runApp());
    }

    public static void runApp(){

        Model model = new Model();
        View view = new View(model);
        Controller controller = new Controller(model, view);
        view.setLoginListener(controller);
    }
}
