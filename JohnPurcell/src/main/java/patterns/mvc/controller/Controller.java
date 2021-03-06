package patterns.mvc.controller;

import patterns.mvc.model.Model;
import patterns.mvc.view.View;

public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }
}
