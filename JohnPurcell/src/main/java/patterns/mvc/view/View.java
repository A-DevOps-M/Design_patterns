package patterns.mvc.view;

import patterns.mvc.model.Model;

import javax.swing.*;

public class View extends JFrame {

    private Model model;

    public View(Model model){
        super("MVC Pattern");
        this.model = model;
    }
}
