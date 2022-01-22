package patterns.observer.controller;

import patterns.observer.model.Model;
import patterns.observer.view.View;

public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }
}
