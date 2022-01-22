package patterns.observer;

import patterns.observer.controller.Controller;
import patterns.observer.model.Model;
import patterns.observer.view.View;

import javax.swing.*;

public class Application {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> runApp());
    }

    public static void runApp(){

        Model model = new Model();
        View view = new View(model);
        Controller controller = new Controller(model, view);
    }
}
