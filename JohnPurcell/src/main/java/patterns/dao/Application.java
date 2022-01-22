package patterns.dao;

import patterns.dao.controller.Controller;
import patterns.dao.model.Model;
import patterns.dao.view.View;

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
