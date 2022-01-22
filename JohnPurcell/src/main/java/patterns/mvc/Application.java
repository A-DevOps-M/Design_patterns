package patterns.mvc;

import patterns.mvc.controller.Controller;
import patterns.mvc.model.Model;
import patterns.mvc.view.View;

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
