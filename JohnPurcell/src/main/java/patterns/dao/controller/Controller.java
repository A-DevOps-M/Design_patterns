package patterns.dao.controller;

import patterns.dao.model.Model;
import patterns.dao.model.Person;
import patterns.dao.model.PersonDAO;
import patterns.dao.view.LoginFormEvent;
import patterns.dao.view.LoginListener;
import patterns.dao.view.View;

import java.sql.SQLException;

public class Controller implements LoginListener {

    private Model model;
    private View view;

    private PersonDAO personDAO = new PersonDAO();

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void loginPerformed(LoginFormEvent event) {
        System.out.println("Login event received: " + event.getName().toUpperCase() + "; " + event.getPassword() + ".");

        try {
            personDAO.addPerson(new Person(event.getName(), event.getPassword()));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
