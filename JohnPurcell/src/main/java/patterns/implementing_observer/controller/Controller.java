package patterns.implementing_observer.controller;

import patterns.implementing_observer.model.Model;
import patterns.implementing_observer.view.LoginFormEvent;
import patterns.implementing_observer.view.LoginListener;
import patterns.implementing_observer.view.View;

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
