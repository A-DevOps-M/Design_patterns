package patterns.dao_factory.controller;

import patterns.dao_factory.model.DAOFactory;
import patterns.dao_factory.model.Model;
import patterns.dao_factory.model.Person;
import patterns.dao_factory.model.PersonDAO;
import patterns.dao_factory.view.*;

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
