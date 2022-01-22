package patterns.dao_factory;

import patterns.dao_factory.controller.Controller;
import patterns.dao_factory.model.Model;
import patterns.dao_factory.view.View;

import javax.swing.*;

public class Application {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> runApp());
    }

    public static void runApp(){

        Model model = new Model();
        View view = new View(model);
        Controller controller = new Controller(view, model);
        view.setLoginListener(controller);
    }
}
