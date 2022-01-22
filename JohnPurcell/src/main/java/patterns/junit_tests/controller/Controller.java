package patterns.junit_tests.controller;

import patterns.junit_tests.model.DAOFactory;
import patterns.junit_tests.model.Model;
import patterns.junit_tests.model.Person;
import patterns.junit_tests.model.PersonDAO;
import patterns.junit_tests.view.CreateUserEvent;
import patterns.junit_tests.view.CreateUserListener;
import patterns.junit_tests.view.View;

import java.sql.SQLException;

public class Controller implements CreateUserListener {
    private View view;
    private Model model;

    private PersonDAO personDAO = DAOFactory.getPersonDAO();

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    @Override
    public void userCreated(CreateUserEvent event) {
        System.out.println("Login event received: " + event.getName() + "; " + event.getPassword());

        try {
            personDAO.addPerson(new Person(event.getName(), event.getPassword()));
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


}
