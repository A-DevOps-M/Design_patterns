package patterns.singleton;

import patterns.singleton.controller.Controller;
import patterns.singleton.model.Model;
import patterns.singleton.view.View;

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
