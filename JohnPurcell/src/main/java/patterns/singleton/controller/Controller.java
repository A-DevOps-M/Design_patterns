package patterns.singleton.controller;

import patterns.singleton.model.Model;
import patterns.singleton.view.LoginFormEvent;
import patterns.singleton.view.LoginListener;
import patterns.singleton.view.View;

public class Controller implements LoginListener {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void loginPerformed(LoginFormEvent event) {
        System.out.println("Login event received: " + event.getName().toUpperCase() + "; " + event.getPassword() + ".");
    }
}
