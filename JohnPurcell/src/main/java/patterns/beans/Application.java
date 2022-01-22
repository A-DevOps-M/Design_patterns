package patterns.beans;

import patterns.beans.controller.Controller;
import patterns.beans.model.Model;
import patterns.beans.view.View;

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
