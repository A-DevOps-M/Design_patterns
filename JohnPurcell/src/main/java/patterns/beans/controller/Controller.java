package patterns.beans.controller;

import patterns.beans.model.Model;
import patterns.beans.view.LoginFormEvent;
import patterns.beans.view.LoginListener;
import patterns.beans.view.View;

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
