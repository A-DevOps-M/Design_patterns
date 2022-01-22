package patterns.junit_tests;

import patterns.junit_tests.controller.Controller;
import patterns.junit_tests.model.Model;
import patterns.junit_tests.view.View;

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
