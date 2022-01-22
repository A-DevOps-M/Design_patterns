package patterns.dao.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * One DAO class person table or view
 * CRUD: create, read, update , delete
 */

public class PersonDAO {

    public void addPerson(Person person) throws SQLException {
        Connection conn = Database.getInstance().getConnection();
        PreparedStatement ps = conn.prepareStatement("insert into people (name, password) value (?, ?);");
        ps.setString(1, person.getName());
        ps.setString(2, person.getPassword());
        ps.executeUpdate();
        ps.close();
    }

    public Person getPerson(int id) throws SQLException{
        Connection conn = Database.getInstance().getConnection();

        String sql = "select id, name, password from people where id=? order by id";
        PreparedStatement selectStatement = conn.prepareStatement(sql);

        selectStatement.setInt(1, id);

        ResultSet results = selectStatement.executeQuery();

        Person person = null;

        if (results.next()) {
            String name = results.getString("name");
            String password = results.getString("password");

            person = new Person(id, name, password);
        }

        results.close();
        selectStatement.close();

        return person;
    }

    public List<Person> getPeople() throws SQLException{
        List<Person> people = new ArrayList<>();
        Connection conn = Database.getInstance().getConnection();
        String sql = "select * from people order by id";
        Statement selectStatement = conn.createStatement();
        ResultSet results = selectStatement.executeQuery(sql);

        while (results.next()){
            int id = results.getInt("id");
            String name = results.getString("name");
            String password = results.getString("password");

            Person person = new Person(id, name, password);
            people.add(person);
        }
        results.close();
        selectStatement.close();
        return people;
    }

    public void updatePerson(Person person){

    }

    public void deletePerson(int id) throws SQLException{
        Connection conn = Database.getInstance().getConnection();
        PreparedStatement ps = conn.prepareStatement("delete from people where id = ?;");
        ps.setInt(1, id);
        ps.executeUpdate();
        ps.close();
    }
}
